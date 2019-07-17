package com.example.jtyauth.security;

import com.example.jtyauth.client.AuthClient;
import com.example.jtyauth.client.ClientRepository;
import com.example.jtyauth.exception.BusinessException;
import com.example.jtyauth.support.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @Author: yeting
 * @Date: 2019/7/12 20:41
 */
@Service
public class MyClientDetailService implements ClientDetailsService {
    
    private final ClientRepository clientRepository;

    @Autowired
    public MyClientDetailService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        AuthClient client = clientRepository.findByClientId(clientId).orElseThrow(() -> new BusinessException(ResultCode.USER_NOT_EXIST));
        BaseClientDetails clientDetails = new BaseClientDetails();
        clientDetails.setClientId(client.getClientId());
        clientDetails.setClientSecret(client.getClientSecret());
        clientDetails.setAuthorizedGrantTypes(Arrays.asList(client.getAuthorizedGrantTypes().split(",")));
        clientDetails.setScope(Arrays.asList(client.getScope().split(",")));
        return clientDetails;
    }
}

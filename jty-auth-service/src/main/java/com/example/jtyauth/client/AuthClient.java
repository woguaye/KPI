package com.example.jtyauth.client;

import com.example.jtyauth.domain.SuperEntity;
import com.example.jtyauth.support.DomainRegistry;
import lombok.Data;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * @Author: yeting
 * @Date: 2019/7/12 20:31
 */
@Entity
@Data
public class AuthClient extends SuperEntity  {

    private String clientId;

    private String clientSecret;

    private String clientDecodeSecret;

    private String authorizedGrantTypes;

    private String scope;

    private Integer userId;

    public static void create(Integer userId) {

        String password = UUID.randomUUID().toString().replace("-", "");
        String encodePassword = DomainRegistry.passwordEncoder().encode(password);

        AuthClient client = new AuthClient();
        client.setClientId(LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE) + "" + RandomStringUtils.randomNumeric(8));
        client.setClientSecret(encodePassword);
        client.setClientDecodeSecret(password);
        client.setAuthorizedGrantTypes("password,refresh_token");
        client.setScope("all");
        client.setUserId(userId);
        DomainRegistry.clientRepository().save(client);
    }


}

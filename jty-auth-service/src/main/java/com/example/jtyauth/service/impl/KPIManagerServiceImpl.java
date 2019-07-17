package com.example.jtyauth.service.impl;

import com.example.jtyauth.domain.dto.KPIManagerDTO;
import com.example.jtyauth.domain.dto.KPIManagerHistoryDto;
import com.example.jtyauth.form.KPIManagerHistoryForm;
import com.example.jtyauth.form.KPIManagerSearchForm;
import com.example.jtyauth.form.KPIStaffForm;
import com.example.jtyauth.repository.*;
import com.example.jtyauth.security.MyUserDetail;
import com.example.jtyauth.service.KPIManagerService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: yeting
 * @Date: 2019/5/22 14:19
 */
@Service
public class KPIManagerServiceImpl implements KPIManagerService {

    @Autowired
    private RoleRepository roleRepository;


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public Page<KPIManagerDTO> getManagers(MyUserDetail user, KPIManagerSearchForm form) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public void addStaff(KPIStaffForm form) {

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public void updateStaff(KPIStaffForm form) {

    }

    @Override
    public void resetPassword(Integer staffId) {

    }

    @Override
    public void enableManager(Integer staffId, Integer userId, String operateReason) {

    }

    @Override
    public void disableManager(Integer staffId, Integer userId, String operateReason) {

    }

    @Override
    public Page<KPIManagerHistoryDto> findHistoryByManagerId(Integer staffId, KPIManagerHistoryForm form) {
        return null;
    }

    @Override
    public void deleteStaff(Integer staffId) {

    }

    private void addHistory(Integer managerId, Integer operatorId, String operateItem, String operateReason) {

    }


    /**
     * 获取当前积分排名
     *
     * @return
     */
    private Map<Integer, Integer> getEmployeeScoreRank(Integer partentId) {
        return null;
    }
}

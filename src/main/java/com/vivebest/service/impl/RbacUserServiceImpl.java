package com.vivebest.service.impl;

import com.vivebest.entity.RbacUser;
import com.vivebest.mapper.RbacUserMapper;
import com.vivebest.service.IRbacUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Rbac用户的实现类
 * @author he.wj
 * @create 2017-12-23 21:17
 **/
@Service
public class RbacUserServiceImpl implements IRbacUserService{

    @Autowired
    private RbacUserMapper rbacUserMapper;

    @Override
    public List<RbacUser> queryRbacUser() {
        return rbacUserMapper.queryRbacUser();
    }

    @Override
    public int updateRbacUser(RbacUser rbacUser) {
        return rbacUserMapper.updateRbacUser(rbacUser);
    }

    @Override
    public int delRbacUser(int id) {
        return rbacUserMapper.delRbacUser(id);
    }

    @Override
    public int addRbacUser(RbacUser rbacUser) {
        return rbacUserMapper.insert(rbacUser);
    }
}

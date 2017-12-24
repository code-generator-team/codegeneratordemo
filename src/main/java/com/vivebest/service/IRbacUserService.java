package com.vivebest.service;

import com.vivebest.entity.RbacUser;

import java.util.List;

/**
 * Rbac用户接口类
 * @author he.wj
 * @create 2017-12-23 21:18
 **/
public interface IRbacUserService {

    /**
     * 查询Rbac所有用户
      * @return Rbac所有用户的列表
     */
   List<RbacUser> queryRbacUser();

    /**
     * 根据ID更新RbacUser
     * *@param rbacUser 用户对象
     * @return Rbac所有用户的列表
     */
    int updateRbacUser(RbacUser rbacUser);

    /**
     * 根据id删除RbacUser
     * @param id 序号
     * @return 成功删除的记录数
     */
    int delRbacUser(int id);

    /**
     * 添加用户
     * @param rbacUser Rbac用户
     * @return 成功插入的记录数
     */
    int addRbacUser(RbacUser rbacUser);
}

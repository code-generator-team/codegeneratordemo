package com.vivebest.controller;

import com.vivebest.common.utils.ResposeUtil;
import com.vivebest.entity.RbacUser;
import com.vivebest.service.IRbacUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Rbac用户控制类
 * @author he.wj
 * @create 2017-12-23 21:08
 **/
@RequestMapping("/generator/code/v1")
@RestController
public class RbacUserController {

    @Resource(name="rbacUserServiceImpl")
    private IRbacUserService iRbacUserService;

    @RequestMapping(value = "/rbacUsers", method = RequestMethod.GET)
    public Object queryRbacUser(){
        return ResposeUtil.putResponseDate(iRbacUserService.queryRbacUser());
    }

    @RequestMapping(value = "/updateRbacUsers", method=RequestMethod.POST)
    public Object updateRbacUser(@RequestBody RbacUser rbacUser){
        iRbacUserService.updateRbacUser(rbacUser);
        return ResposeUtil.putResponseDate();
    }

    @RequestMapping(value = "/rbacUsers/{id}", method = RequestMethod.DELETE)
    public Object delRbacUser(@PathVariable("id") Integer id){
        iRbacUserService.delRbacUser(id);
        return ResposeUtil.putResponseDate();
    }

    @RequestMapping(value = "/rbacUsers", method = RequestMethod.POST)
    public Object addRbacUser(@RequestBody RbacUser rbacUser){
        iRbacUserService.addRbacUser(rbacUser);
        return ResposeUtil.putResponseDate();
    }
}

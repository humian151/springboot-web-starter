package com.zwq.service;

import com.zwq.entity.UserInf;

import java.util.List;

/**
 * Created by DELL on 2018/3/16.
 */
public interface HrmService {
    /**
     * 用户登录
     * @param loginname
     * @param password
     * @return
     */
    UserInf login(String loginname, String password);

    /**
     * 根据id 查询用户
     * @param id
     * @return
     */
    UserInf findUserById(Integer id);

    /**
     * 获得所有用户（分页）
     * @param user
     * @param page
     * @param pageSize
     * @return
     */
    List<UserInf> findUser(UserInf user,Integer page, Integer pageSize);

    /**
     * 根据id删除用户
     * @param id
     */
    void removeUserById(Integer id);

    /**
     * 修改用户
     * @param user
     */
    void modifyUser(UserInf user);

    /**
     * 添加用户
     * @param user
     */
    void addUser(UserInf user);
}

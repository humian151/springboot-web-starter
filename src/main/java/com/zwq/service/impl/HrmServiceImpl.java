package com.zwq.service.impl;

import com.github.pagehelper.PageHelper;
import com.zwq.entity.UserInf;
import com.zwq.mapper.UserInfMapper;
import com.zwq.service.HrmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class HrmServiceImpl implements HrmService{
    @Autowired
    UserInfMapper userInfMapper;

    @Override
    public UserInf login(String loginname, String password) {
        Example example = new Example(UserInf.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("loginname",loginname);
        criteria.andEqualTo("password",password);
        List<UserInf> userInfs = userInfMapper.selectByExample(example);
        if (userInfs!=null && !userInfs.isEmpty()){
            return userInfs.get(0);
        }
        return null;
    }

    @Override
    public UserInf findUserById(Integer id) {
        return userInfMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserInf> findUser(UserInf user, Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        Example example = new Example(UserInf.class);
        Example.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmptyOrWhitespace(user.getUsername())) {
            criteria.andLike("username", "%" + user.getUsername() + "%");
        }

        return userInfMapper.selectByExample(example);
    }

    @Override
    public void removeUserById(Integer id) {
        userInfMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void modifyUser(UserInf user) {
        userInfMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void addUser(UserInf user) {
        userInfMapper.insert(user);
    }
}

package com.zwq.controller;

import com.zwq.dto.JsonResult;
import com.zwq.entity.UserInf;
import com.zwq.service.HrmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private HrmService hrmService;

    /**
     * 登录方法
     * @param loginname  用户名
     * @param password  密码
     * @param session
     * @param mv
     * @return
     */
    @RequestMapping(value = "/login")
    public ModelAndView login(@RequestParam("loginname")String loginname,
                              @RequestParam("password")String password,
                              HttpSession session,
                              ModelAndView mv){
        UserInf user = hrmService.login(loginname, password);
        if(user != null){
            session.setAttribute("USERSESSION",user);
            mv.setViewName("redirect:/main");
        }else{
            mv.addObject("message","登录名或密码错误，请重新输入");
            mv.setViewName("forward:/login");
        }
        return mv;
    }

    @RequestMapping(value = "/selectUser")
    @ResponseBody
    public JsonResult selectUser(Integer pageIndex,
                                 Integer pageSize,
                                 UserInf userInf){
        if (pageIndex == null) {
            pageIndex = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        List<UserInf> userList = hrmService.findUser(userInf, pageIndex, pageSize);

        return JsonResult.ok(userList);
    }

    @RequestMapping(value = "/removeUser")
    @ResponseBody
    public JsonResult removeUser(String ids){
        String[] idArray = ids.split(",");
        for(String id :idArray){
            hrmService.removeUserById(Integer.parseInt(id));
        }

        return JsonResult.ok("删除成功！");
    }

    @RequestMapping(value = "/updateUser")
    @ResponseBody
    public JsonResult updateUser(UserInf userInf){
        hrmService.modifyUser(userInf);
        return JsonResult.ok("更新成功！");
    }

    @RequestMapping(value = "/addUser")
    @ResponseBody
    public JsonResult addUser(UserInf userInf){
        hrmService.addUser(userInf);
        return  JsonResult.ok("保存成功！");
    }
}

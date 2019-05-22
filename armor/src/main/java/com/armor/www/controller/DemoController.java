package com.armor.www.controller;

import com.alibaba.fastjson.JSONObject;
import com.armor.www.entity.UserEntity;
import com.armor.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@RestController
@Controller
class DemoController {

    @Autowired
    private UserService userServ;

    @RequestMapping( value = "/demo" )
    public String demo() {
        UserEntity []users = userServ.getUserList(0, 20);
        String usersStr = JSONObject.toJSONString(users);

        return usersStr;
    }

    @RequestMapping( value = "/demo2" )
    public ModelAndView demo2(ModelAndView mv) {
        UserEntity []users = userServ.getUserList(0, 20);
        List<UserEntity> userlist = Arrays.asList(users);

        mv.setViewName("userlist");
        mv.addObject("userList", userlist);

        return mv;
    }

    @RequestMapping( value = "/user/{userId}")
    public String getUser(@PathVariable("userId") int userId) {
        UserEntity user = userServ.getUser(userId);

        return JSONObject.toJSONString(user);
    }

    @RequestMapping( value={"/userlist/{page}/{size}"} )
    public ModelAndView userList(ModelAndView mv, @PathVariable(value = "page", required = true) int page, @PathVariable(value = "size") int size) {
        UserEntity []users = userServ.getUserList(page, size);
        List<UserEntity> userlist = Arrays.asList(users);

        mv.setViewName("userlist");
        mv.addObject("userList", userlist);

        return mv;
    }

    @RequestMapping( value = "userroom/{uid}")
    public String getUserroom(@PathVariable("uid") int userId) {
        UserEntity userroom = userServ.getUserroom(userId);

        String userroomStr = JSONObject.toJSONString(userroom);

        return userroomStr;
    }

    @RequestMapping( value = "userbkacnt/{uid}")
    public String getUserBankacnt(@PathVariable("uid") int userId) {
        UserEntity user = userServ.getUserBankacnt(userId);

        return JSONObject.toJSONString(user);
    }

    @RequestMapping( value = "/userRmBkacnts/{uid}")
    public String getUserRoomAndBankAncts(@PathVariable("uid") int userId) {
        UserEntity user = userServ.getUserRoomAndBankAcnts(userId);

        return JSONObject.toJSONString(user);
    }
}
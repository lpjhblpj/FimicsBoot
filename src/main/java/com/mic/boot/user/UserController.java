package com.mic.boot.user;



import com.alibaba.fastjson.JSON;
import com.mic.boot.common.BaseModel;
import com.mic.boot.user.dao.IUserDao;
import com.mic.boot.user.dao.UserDaoImpl;
import com.mic.boot.user.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UserController {


    private final IUserDao<User> userDao = new UserDaoImpl();

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(
                        @RequestParam(value = "name",required = true) String name,
                        @RequestParam(value = "password",required = false)String password
            ){



        User user =userDao.findByNameAndPasswod(name,password);
        String result="";


        if(user!=null){
            result=JSON.toJSONString(new BaseModel(user,200,"登录成功"));
        }else {
            result=JSON.toJSONString(new BaseModel(user,500,"登录失败"));
        }

       return result;
    }


}

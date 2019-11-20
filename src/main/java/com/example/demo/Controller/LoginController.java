package com.example.demo.Controller;

import com.example.demo.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @Autowired
    UserMapper userMapper;

    @GetMapping("/login")
    public String login(@RequestParam(name="name")String name,
                        @RequestParam(name="password")String password,
                        HttpServletRequest request){

        for(String n:userMapper.getName())
        {
            if(name.equals(n)){
                if (password.equals(userMapper.getPaw(name))){
                    return "main";
                }else {
                    request.getSession().setAttribute("wc",false);
                    return "login";
                }
            }
        }
        request.getSession().setAttribute("wc",true);
        return "login";
    }
}

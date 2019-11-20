package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TzController {
    @GetMapping("/main")
    public String Main(){
        return "main";
    }

    @GetMapping("/1")
    public String One(){
        return "1";
    }

    @GetMapping("/2_1")
    public String Two_1(){
        return "2_1";
    }

    @GetMapping("/2_2")
    public String Two_2(){
        return "2_2";
    }

    @GetMapping("/2_3")
    public String Two_3(){
        return "2_3";
    }

    @GetMapping("/2_4")
    public String Two_4(){
        return "2_4";
    }

    @GetMapping("/2_5")
    public String Two_5(){
        return "2_5";
    }

    @GetMapping("/3_1")
    public String Three_1(){
        return "3_1";
    }

    @GetMapping("/3_2")
    public String Three_2(){
        return "3_2";
    }

    @GetMapping("/3_3")
    public String Three_3(){
        return "3_3";
    }

    @GetMapping("/3_4")
    public String Three_4(){
        return "3_4";
    }

    @GetMapping("/3_5")
    public String Three_5(){
        return "3_5";
    }

    @GetMapping("/3_6")
    public String Three_6(){
        return "3_6";
    }

    @GetMapping("/3_7")
    public String Three_7(){
        return "3_7";
    }

    @GetMapping("4_1")
    public String Four_1(){
        return "4_1";
    }

    @GetMapping("4_2")
    public String Four_2(){
        return "4_2";
    }
}

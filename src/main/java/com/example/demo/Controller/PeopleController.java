package com.example.demo.Controller;

import com.example.demo.Mapper.PeopleMapper;
import com.example.demo.Model.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PeopleController {
    @Autowired
    private PeopleMapper peopleMapper;

    @GetMapping("/people")
    public String People(@RequestParam(name="o1")String o1,
                         @RequestParam(name="o2")String o2,
                         @RequestParam(name="o3")String o3,
                         @RequestParam(name="o4")String o4,
                         @RequestParam(name="o5")String o5,
                         @RequestParam(name="o6")String o6,
                         @RequestParam(name="o7")String o7,
                         @RequestParam(name="o8")String o8,
                         @RequestParam(name="o9")String o9,
                         @RequestParam(name="o10")String o10,
                         @RequestParam(name="o11")String o11,
                         @RequestParam(name="o12")String o12,
                         @RequestParam(name="o13")String o13){
        People people=new People();
        people.setName(o1);
        people.setSex(o2);
        people.setYear(o3);
        people.setXl(o4);
        people.setXw(o5);
        people.setSchool(o6);
        people.setZy(o7);
        people.setZc(o8);
        people.setRccc(o9);
        people.setGd(o10);
        people.setGzxz(o11);
        people.setRyzt(o12);
        people.setRsdw(o13);

        peopleMapper.insert(people);
        return "3_1";
    }
}

package com.example.demo.Controller;

import com.example.demo.Mapper.PtMapper;
import com.example.demo.Mapper.PtzrMapper;
import com.example.demo.Model.Pt;
import com.example.demo.Model.Ptzr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PtController {


    @Autowired
    private PtMapper ptMapper;

    @Autowired
    private PtzrMapper ptzrMapper;

    @GetMapping("/pt")
    public String display(@RequestParam(name="o1")String o1,
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
                          @RequestParam(name="o13")String o13,
                          @RequestParam(name="o14")String o14,
                          @RequestParam(name="o15")String o15,
                          @RequestParam(name="o16")String o16,
                          @RequestParam(name="o17")String o17,
                          @RequestParam(name="o18")String o18,
                          @RequestParam(name="o19")String o19,
                          @RequestParam(name="o20")String o20,
                          @RequestParam(name="o21")String o21,
                          @RequestParam(name="o22")String o22,
                          @RequestParam(name="o23")String o23,
                          @RequestParam(name="o24")String o24,
                          @RequestParam(name="o25")String o25,
                          @RequestParam(name="o26")String o26,
                          @RequestParam(name="o27")String o27,
                          @RequestParam(name="o28")String o28,
                          @RequestParam(name="o29")String o29,
                          @RequestParam(name="o30")String o30,
                          @RequestParam(name="o31")String o31,
                          @RequestParam(name="o32")String o32,
                          @RequestParam(name="o33")String o33,
                          @RequestParam(name="o34")String o34,
                          @RequestParam(name="o35")String o35,
                          @RequestParam(name="o36")String o36,
                          @RequestParam(name="o37")String o37){
        Pt pt=new Pt();
        Ptzr ptzr=new Ptzr();
        pt.setO1(o1);
        pt.setO2(o2);
        pt.setO3(o3);
        pt.setO4(o4);
        pt.setO5(o5);
        pt.setO6(o6);
        pt.setO7(o7);
        pt.setO8(o8);
        pt.setO9(o9);
        pt.setO10(o10);
        pt.setO11(o11);
        pt.setO12(o12);
        pt.setO13(o13);
        pt.setO14(o14);
        pt.setO15(o15);
        pt.setO16(o16);
        pt.setO17(o17);
        pt.setO18(o18);
        pt.setO19(o19);
        pt.setO20(o20);
        pt.setO21(o21);
        pt.setO22(o22);
        pt.setO23(o23);
        pt.setO24(o24);
        pt.setO25(o25);
        pt.setO26(o26);
        pt.setO27(o27);
        ptzr.setName(o28);
        ptzr.setSex(o29);
        ptzr.setYear(o30);
        ptzr.setZc(o31);
        ptzr.setZy(o32);
        ptzr.setXl(o33);
        ptzr.setXw(o34);
        ptzr.setPgphone(o35);
        ptzr.setPhone(o36);
        ptzr.setE_mail(o37);
        ptMapper.insert(pt);
        ptzrMapper.insert(ptzr);
        return "2_1";
    }


}

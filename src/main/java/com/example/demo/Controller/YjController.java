package com.example.demo.Controller;

import com.example.demo.Mapper.*;
import com.example.demo.Model.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class YjController {

    @Autowired
    private YjMapper yjMapper;

    @Autowired
    private JgMapper jgMapper;

    @Autowired
    private JyMapper jyMapper;

    @Autowired
    private ZsMapper zsMapper;

    @Autowired
    private FwMapper fwMapper;

    @GetMapping("/yj")
    public String Yj(@RequestParam(name="fx")String fx,
                        @RequestParam(name="nr")String nr,
                        HttpServletRequest request){
        Yj yj=new Yj();
        yj.setFx(fx);
        yj.setNr(nr);
        yjMapper.insert(yj);

        if(yj!=null) {
            request.getSession().setAttribute("wc1", true);
            yj=null;
            return "2_1";
        }else {
            request.getSession().setAttribute("wc1", false);
            yj=null;
            return "2_1";
        }

    }

    @GetMapping("/jg")
    public String Jg(@RequestParam(name="jg")String jg,
                        HttpServletRequest request){
        Jg j=new Jg();
        j.setJg(jg);
        jgMapper.insert(j);

        if(j!=null) {
            request.getSession().setAttribute("wc2", true);
            j=null;
            return "2_2";
        }else {
            request.getSession().setAttribute("wc2", false);
            j=null;
            return "2_2";
        }

    }

    @GetMapping("/jy")
    public String Jy(@RequestParam(name="jg")String jg,
                     @RequestParam(name="zz")String zz,
                     @RequestParam(name="pd")String pd,
                     HttpServletRequest request){
        Jy jy=new Jy();
        jy.setJg(jg);
        jy.setZz(zz);
        jy.setPd(pd);
        jyMapper.insert(jy);

        if(jy!=null) {
            request.getSession().setAttribute("wc3", true);
            jy=null;
            return "2_3";
        }else {
            request.getSession().setAttribute("wc3", false);
            jy=null;
            return "2_3";
        }

    }

    @GetMapping("/zs")
    public String Zs(@RequestParam(name="zs")String zs,
                     @RequestParam(name="dw")String dw,
                     HttpServletRequest request){
        Zs z=new Zs();
        z.setZs(zs);
        z.setDw(dw);
        zsMapper.insert(z);

        if(z!=null) {
            request.getSession().setAttribute("wc4", true);
            z=null;
            return "2_4";
        }else {
            request.getSession().setAttribute("wc4", false);
            z=null;
            return "2_4";
        }

    }

    @GetMapping("/fw")
    public String Fw(@RequestParam(name="fw")String fw,
                     @RequestParam(name="nr")String nr,
                     HttpServletRequest request){
        Fw f=new Fw();
        f.setFw(fw);
        f.setNr(nr);
        fwMapper.insert(f);
        if(f!=null) {
            request.getSession().setAttribute("wc5", true);
            f=null;
            return "2_5";
        }else {
            request.getSession().setAttribute("wc5", false);
            f=null;
            return "2_5";
        }

    }
}

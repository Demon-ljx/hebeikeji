package com.example.demo.Controller;

import com.example.demo.Mapper.PtMapper;
import com.example.demo.Model.Pt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class OneController {

    @Autowired
    private PtMapper ptMapper;

    @GetMapping(value = "/sss")
    public String findAll(@RequestParam(name = "sheng") String sheng,
                          HttpServletRequest request) throws SQLException,ClassNotFoundException {
        System.out.println(sheng);
        if(sheng.equals("string:130000")){
            request.getSession().setAttribute("aaa", true);
        }else {
            request.getSession().setAttribute("aaa", false);
        }
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC", "root", "123");
        Statement stmt; //创建声明
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select pt_name,pt_num,year,wenh,ly,jb,sx from 1_pt");
        List<Map<String, String>> list = new ArrayList<>();
        if (rs != null) {
            while (rs.next()) {
                Map<String, String> map = new HashMap<String, String>();
                map.put("pt_name", rs.getString("pt_name"));
                map.put("pt_num", rs.getString("pt_num"));
                map.put("year", rs.getString("year"));
                map.put("wenh", rs.getString("wenh"));
                map.put("ly", rs.getString("ly"));
                map.put("jb", rs.getString("jb"));
                map.put("sx", rs.getString("sx"));
                list.add(map);
            }
        }
        request.getSession().setAttribute("list", list);
        int i=list.size();
        System.out.println(list.get(0).get("pt_name"));


        if (i >= 1) {
            request.getSession().setAttribute("list1", list.get(0).get("pt_name"));
            request.getSession().setAttribute("list2", list.get(0).get("pt_num"));
            request.getSession().setAttribute("list3", list.get(0).get("year"));
            request.getSession().setAttribute("list4", list.get(0).get("wenh"));
            request.getSession().setAttribute("list5", list.get(0).get("ly"));
            request.getSession().setAttribute("list6", list.get(0).get("jb"));
            request.getSession().setAttribute("list7", list.get(0).get("sx"));

            request.getSession().setAttribute("bbb", false);
            request.getSession().setAttribute("ccc", false);
            request.getSession().setAttribute("ddd", false);
            request.getSession().setAttribute("eee", false);
            if (i >= 2) {
                request.getSession().setAttribute("list14", list.get(1).get("pt_name"));
                request.getSession().setAttribute("list15", list.get(1).get("pt_num"));
                request.getSession().setAttribute("list16", list.get(1).get("year"));
                request.getSession().setAttribute("list17", list.get(1).get("wenh"));
                request.getSession().setAttribute("list18", list.get(1).get("ly"));
                request.getSession().setAttribute("list19", list.get(1).get("jb"));
                request.getSession().setAttribute("list20", list.get(1).get("sx"));

                request.getSession().setAttribute("bbb", true);
                request.getSession().setAttribute("ccc", false);
                request.getSession().setAttribute("ddd", false);
                request.getSession().setAttribute("eee", false);
                if (i >= 3) {
                    request.getSession().setAttribute("list27", list.get(2).get("pt_name"));
                    request.getSession().setAttribute("list28", list.get(2).get("pt_num"));
                    request.getSession().setAttribute("list29", list.get(2).get("year"));
                    request.getSession().setAttribute("list30", list.get(2).get("wenh"));
                    request.getSession().setAttribute("list31", list.get(2).get("ly"));
                    request.getSession().setAttribute("list32", list.get(2).get("jb"));
                    request.getSession().setAttribute("list33", list.get(2).get("sx"));

                    request.getSession().setAttribute("ccc", true);
                    request.getSession().setAttribute("ddd", false);
                    request.getSession().setAttribute("eee", false);
                    if (i >= 4) {
                        request.getSession().setAttribute("list40", list.get(3).get("pt_name"));
                        request.getSession().setAttribute("list41", list.get(3).get("pt_num"));
                        request.getSession().setAttribute("list42", list.get(3).get("year"));
                        request.getSession().setAttribute("list43", list.get(3).get("wenh"));
                        request.getSession().setAttribute("list44", list.get(3).get("ly"));
                        request.getSession().setAttribute("list45", list.get(3).get("jb"));
                        request.getSession().setAttribute("list46", list.get(3).get("sx"));

                        request.getSession().setAttribute("ddd", true);
                        request.getSession().setAttribute("eee", false);
                        if (i >= 5) {
                            request.getSession().setAttribute("list53", list.get(4).get("pt_name"));
                            request.getSession().setAttribute("list54", list.get(4).get("pt_num"));
                            request.getSession().setAttribute("list55", list.get(4).get("year"));
                            request.getSession().setAttribute("list56", list.get(4).get("wenh"));
                            request.getSession().setAttribute("list57", list.get(4).get("ly"));
                            request.getSession().setAttribute("list58", list.get(4).get("jb"));
                            request.getSession().setAttribute("list59", list.get(4).get("sx"));

                            request.getSession().setAttribute("eee", true);
                        }
                    }
                }
            }
        }
        return "main";
    }

}

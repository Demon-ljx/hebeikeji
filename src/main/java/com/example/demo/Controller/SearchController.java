package com.example.demo.Controller;


import com.example.demo.Mapper.PeopleMapper;
import com.example.demo.Model.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SearchController {

    @Autowired
    private PeopleMapper peopleMapper;

    @GetMapping(value = "/search")
    public String findAll(@RequestParam(name = "s") String s,
                          HttpServletRequest request) {
        People people = peopleMapper.Select(s);
        request.getSession().setAttribute("people", people);
        return "main";
    }

    @RequestMapping(value = "/speople", method = RequestMethod.POST)
    public String find(@RequestParam(name = "o1") String o1,
                       @RequestParam(name = "o2") String o2,
                       @RequestParam(name = "o4") String o4,
                       @RequestParam(name = "o5") String o5,
                       @RequestParam(name = "o6") String o6,
                       @RequestParam(name = "o7") String o7,
                       @RequestParam(name = "o8") String o8,
                       @RequestParam(name = "o9") String o9,
                       @RequestParam(name = "o10") String o10,
                       @RequestParam(name = "o11") String o11,
                       @RequestParam(name = "o12") String o12,
                       @RequestParam(name = "o13") String o13,
                       HttpServletRequest request) throws SQLException, ClassNotFoundException {
        String sql = "select name,sex,year,xl,xw,school,zy,zc,rccc,gd,gzxz,ryzt,rsdw from 3_people where ";
        if (o1 != null && !o1.equals("")) {
            sql = sql + "name like" + "\"" + "%" + o1 + "%" + "\"";
            if (o4 != null && !o4.equals("")) {
                sql = sql + " and " + "xl=" + "\"" + o4 + "\"";
            }
        } else {
            if (o4 != null && !o4.equals("")) {
                sql = sql + "xl=" + "\"" + o4 + "\"";
            }
        }
        if (o2 != null && !o2.equals("")) {
            sql = sql + " and " + "sex=" + "\"" + o2 + "\"";
        }

        if (o5 != null && !o5.equals("")) {
            sql = sql + " and " + "xw=" + "\"" + o5 + "\"";
        }
        if (o6 != null && !o6.equals("")) {
            sql = sql + " and " + "school=" + "\"" + o6 + "\"";
        }
        if (o7 != null && !o7.equals("")) {
            sql = sql + " and " + "zy=" + "\"" + o7 + "\"";
        }
        if (o8 != null && !o8.equals("")) {
            sql = sql + " and " + "zc=" + "\"" + o8 + "\"";
        }
        if (o9 != null && !o9.equals("")) {
            sql = sql + " and " + "rccc=" + "\"" + o9 + "\"";
        }
        if (o10 != null && !o10.equals("")) {
            sql = sql + " and " + "gd=" + "\"" + o10 + "\"";
        }
        if (o11 != null && !o11.equals("")) {
            sql = sql + " and " + "gzxz=" + "\"" + o11 + "\"";
        }
        if (o12 != null && !o12.equals("")) {
            sql = sql + " and " + "ryzt=" + "\"" + o12 + "\"";
        }
        if (o13 != null && !o13.equals("")) {
            sql = sql + " and " + "rsdw=" + "\"" + o13 + "\"";
        }
        System.out.println(sql);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC", "root", "123");
        Statement stmt; //创建声明
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        List<Map<String, String>> list = new ArrayList<>();
        if (rs != null) {
            while (rs.next()) {
                Map<String, String> map = new HashMap<String, String>();
                map.put("name", rs.getString("name"));
                map.put("sex", rs.getString("sex"));
                map.put("year", rs.getString("year"));
                map.put("xl", rs.getString("xl"));
                map.put("xw", rs.getString("xw"));
                map.put("school", rs.getString("school"));
                map.put("zy", rs.getString("zy"));
                map.put("zc", rs.getString("zc"));
                map.put("rccc", rs.getString("rccc"));
                map.put("gd", rs.getString("gd"));
                map.put("gzxz", rs.getString("gzxz"));
                map.put("ryzt", rs.getString("ryzt"));
                map.put("rsdw", rs.getString("rsdw"));
                list.add(map);
            }
        }
        request.getSession().setAttribute("list", list);
        int i=list.size();
        if(i==0){
            request.getSession().setAttribute("wc", false);
        }
        if (i >= 1) {
            request.getSession().setAttribute("map1", list.get(0).get("name"));
            request.getSession().setAttribute("map2", list.get(0).get("sex"));
            request.getSession().setAttribute("map3", list.get(0).get("year"));
            request.getSession().setAttribute("map4", list.get(0).get("xl"));
            request.getSession().setAttribute("map5", list.get(0).get("xw"));
            request.getSession().setAttribute("map6", list.get(0).get("school"));
            request.getSession().setAttribute("map7", list.get(0).get("zy"));
            request.getSession().setAttribute("map8", list.get(0).get("zc"));
            request.getSession().setAttribute("map9", list.get(0).get("rccc"));
            request.getSession().setAttribute("map10", list.get(0).get("gd"));
            request.getSession().setAttribute("map11", list.get(0).get("gzxz"));
            request.getSession().setAttribute("map12", list.get(0).get("ryzt"));
            request.getSession().setAttribute("map13", list.get(0).get("rsdw"));
            request.getSession().setAttribute("wc", true);
            request.getSession().setAttribute("qwe", false);
            request.getSession().setAttribute("asd", false);
            request.getSession().setAttribute("zxc", false);
            request.getSession().setAttribute("rty", false);
            if (i >= 2) {
                request.getSession().setAttribute("map14", list.get(1).get("name"));
                request.getSession().setAttribute("map15", list.get(1).get("sex"));
                request.getSession().setAttribute("map16", list.get(1).get("year"));
                request.getSession().setAttribute("map17", list.get(1).get("xl"));
                request.getSession().setAttribute("map18", list.get(1).get("xw"));
                request.getSession().setAttribute("map19", list.get(1).get("school"));
                request.getSession().setAttribute("map20", list.get(1).get("zy"));
                request.getSession().setAttribute("map21", list.get(1).get("zc"));
                request.getSession().setAttribute("map22", list.get(1).get("rccc"));
                request.getSession().setAttribute("map23", list.get(1).get("gd"));
                request.getSession().setAttribute("map24", list.get(1).get("gzxz"));
                request.getSession().setAttribute("map25", list.get(1).get("ryzt"));
                request.getSession().setAttribute("map26", list.get(1).get("rsdw"));
                request.getSession().setAttribute("qwe", true);
                request.getSession().setAttribute("asd", false);
                request.getSession().setAttribute("zxc", false);
                request.getSession().setAttribute("rty", false);
                if (i >= 3) {
                    request.getSession().setAttribute("map27", list.get(2).get("name"));
                    request.getSession().setAttribute("map28", list.get(2).get("sex"));
                    request.getSession().setAttribute("map29", list.get(2).get("year"));
                    request.getSession().setAttribute("map30", list.get(2).get("xl"));
                    request.getSession().setAttribute("map31", list.get(2).get("xw"));
                    request.getSession().setAttribute("map32", list.get(2).get("school"));
                    request.getSession().setAttribute("map33", list.get(2).get("zy"));
                    request.getSession().setAttribute("map34", list.get(2).get("zc"));
                    request.getSession().setAttribute("map35", list.get(2).get("rccc"));
                    request.getSession().setAttribute("map36", list.get(2).get("gd"));
                    request.getSession().setAttribute("map37", list.get(2).get("gzxz"));
                    request.getSession().setAttribute("map38", list.get(2).get("ryzt"));
                    request.getSession().setAttribute("map39", list.get(2).get("rsdw"));
                    request.getSession().setAttribute("asd", true);
                    request.getSession().setAttribute("zxc", false);
                    request.getSession().setAttribute("rty", false);
                    if (i >= 4) {
                        request.getSession().setAttribute("map40", list.get(3).get("name"));
                        request.getSession().setAttribute("map41", list.get(3).get("sex"));
                        request.getSession().setAttribute("map42", list.get(3).get("year"));
                        request.getSession().setAttribute("map43", list.get(3).get("xl"));
                        request.getSession().setAttribute("map44", list.get(3).get("xw"));
                        request.getSession().setAttribute("map45", list.get(3).get("school"));
                        request.getSession().setAttribute("map46", list.get(3).get("zy"));
                        request.getSession().setAttribute("map47", list.get(3).get("zc"));
                        request.getSession().setAttribute("map48", list.get(3).get("rccc"));
                        request.getSession().setAttribute("map49", list.get(3).get("gd"));
                        request.getSession().setAttribute("map50", list.get(3).get("gzxz"));
                        request.getSession().setAttribute("map51", list.get(3).get("ryzt"));
                        request.getSession().setAttribute("map52", list.get(3).get("rsdw"));
                        request.getSession().setAttribute("zxc", true);
                        request.getSession().setAttribute("rty", false);
                        if (i >= 5) {
                            request.getSession().setAttribute("map53", list.get(4).get("name"));
                            request.getSession().setAttribute("map54", list.get(4).get("sex"));
                            request.getSession().setAttribute("map55", list.get(4).get("year"));
                            request.getSession().setAttribute("map56", list.get(4).get("xl"));
                            request.getSession().setAttribute("map57", list.get(4).get("xw"));
                            request.getSession().setAttribute("map58", list.get(4).get("school"));
                            request.getSession().setAttribute("map59", list.get(4).get("zy"));
                            request.getSession().setAttribute("map60", list.get(4).get("zc"));
                            request.getSession().setAttribute("map61", list.get(4).get("rccc"));
                            request.getSession().setAttribute("map62", list.get(4).get("gd"));
                            request.getSession().setAttribute("map63", list.get(4).get("gzxz"));
                            request.getSession().setAttribute("map64", list.get(4).get("ryzt"));
                            request.getSession().setAttribute("map65", list.get(4).get("rsdw"));
                            request.getSession().setAttribute("rty", true);
                        }
                    }
                }
            }
        }
        list=null;
        return "redirect:/3_1";

    }
}

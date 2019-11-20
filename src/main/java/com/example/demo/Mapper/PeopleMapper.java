package com.example.demo.Mapper;

import com.example.demo.Model.People;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PeopleMapper {
    @Insert("insert into 3_people(name,sex,year,xl,xw,school,zy,zc,rccc,gd,gzxz,ryzt,rsdw) values (#{name},#{sex},#{year},#{xl},#{xw},#{school},#{zy},#{zc},#{rccc},#{gd},#{gzxz},#{ryzt},#{rsdw})")
    void insert(People people);

    @Select("select * from 3_people where name=#{name}")
    People Select(@Param("name")String name);

//    @Select("<script>" +
//            "select * from 3_people" +
//            "<where>" +
//                "<if test='name != null'>" +
//                "and name like '%', #{name}, '%'"+
//                "</if>"+
//                "<if test='sex != null'>" +
//                "and sex = #{sex}"+
//                "</if>"+
//                "<if test='year != null'>" +
//                "and year = #{year}"+
//                "</if>"+
//                "<if test='xl != null'>" +
//                "and xl = #{xl}"+
//                "</if>"+
//                "<if test='xw != null'>" +
//                "and xw = #{xw}"+
//                "</if>"+
//                "</if>"+
//                "<if test='school != null'>" +
//                "and school = #{school}"+
//                "</if>"+
//                "</if>"+
//                "<if test='zy != null'>" +
//                "and zy = #{zy}"+
//                "</if>"+
//                "</if>"+
//                "<if test='zc != null'>" +
//                "and zc = #{zc}"+
//                "</if>"+
//                "</if>"+
//                "<if test='rccc != null'>" +
//                "and rccc = #{rccc}"+
//                "</if>"+
//                "</if>"+
//                "<if test='gd != null'>" +
//                "and gd = #{gd}"+
//                "</if>"+
//                "</if>"+
//                "<if test='gzxz != null'>" +
//                "and gzxz = #{gzxz}"+
//                "</if>"+
//                "</if>"+
//                "<if test='ryzt != null'>" +
//                "and ryzt = #{ryzt}"+
//                "</if>"+
//                "</if>"+
//                "<if test='rsdw != null'>" +
//                "and rsdw = #{rsdw}"+
//                "</if>"+
//            "</where>" +
//            "</script>")
//    List select(People people);
}

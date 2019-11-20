package com.example.demo.Mapper;

import com.example.demo.Model.Ptzr;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PtzrMapper {
    @Insert("insert into 1_ptzr(name,sex,year,zc,zy,xl,xw,pgphone,phone,e_mail) values (#{name},#{sex},#{year},#{zc},#{zy},#{xl},#{xw},#{pgphone},#{phone},#{e_mail})")
    void insert(Ptzr ptzr);

}

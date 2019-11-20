package com.example.demo.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select name from user")
    List<String> getName();

    @Select("select password from user where name=#{name}")
    String getPaw(@Param("name")String name);
}

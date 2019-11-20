package com.example.demo.Mapper;

import com.example.demo.Model.Fw;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FwMapper {
    @Insert("insert into 2_fw(fw,nr) values (#{fw},#{nr})")
    void insert(Fw fw);
}

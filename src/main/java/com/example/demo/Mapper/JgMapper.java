package com.example.demo.Mapper;

import com.example.demo.Model.Jg;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JgMapper {
    @Insert("insert into 2_jg(jg) values (#{jg})")
    void insert(Jg jg);
}

package com.example.demo.Mapper;

import com.example.demo.Model.Zs;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ZsMapper {
    @Insert("insert into 2_zs(zs,dw) values (#{zs},#{dw})")
    void insert(Zs zs);
}

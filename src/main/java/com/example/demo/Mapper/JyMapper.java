package com.example.demo.Mapper;

import com.example.demo.Model.Jy;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JyMapper {
    @Insert("insert into 2_jy(jg,zz,pd) values (#{jg},#{zz},#{pd})")
    void insert(Jy jy);
}

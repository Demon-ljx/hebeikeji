package com.example.demo.Mapper;

import com.example.demo.Model.Yj;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface YjMapper {
    @Insert("insert into 2_yj(fx,nr) values (#{fx},#{nr})")
    void insert(Yj yj);
}

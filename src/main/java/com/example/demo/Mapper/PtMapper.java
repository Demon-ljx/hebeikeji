package com.example.demo.Mapper;

import com.example.demo.Model.Pt;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PtMapper {
    @Insert("insert into 1_pt(pt_name,pt_num,year,wenh,ly,jb,sx,zzxs,fr,ytjs,jjj,jjhy1,jjhy2,jjhy3,xk1,xk2,xk3,yt_name,yt_num,yt_fr,phone,lx,gjdw,ptwz,wz,address,yb) values (#{o1},#{o2},#{o3},#{o4},#{o5},#{o6},#{o7},#{o8},#{o9},#{o10},#{o11},#{o12},#{o13},#{o14},#{o15},#{o16},#{o17},#{o18},#{o19},#{o20},#{o21},#{o22},#{o23},#{o24},#{o25},#{o26},#{o27})")
    void insert(Pt pt);
}

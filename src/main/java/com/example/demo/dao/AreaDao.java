package com.example.demo.dao;

import com.example.demo.entity.Area;

import java.util.List;

public interface AreaDao {
    //查询所有
    List<Area> query();
    //根据id查具体的
    Area queryById(Integer id);

    int insertArea(Area area);

    int updateArea(Integer id);

    int deleteArea(Integer id);
}

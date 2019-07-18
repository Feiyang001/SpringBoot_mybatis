package com.example.demo.service;

import com.example.demo.entity.Area;

import java.util.List;

public interface IAreaService {

    List<Area> getAreaList();
    //根据id查具体的
    Area getById(Integer id);

    boolean addArea(Area area);

    boolean updateArea(Area area);

    boolean deleteArea(Integer id);
}

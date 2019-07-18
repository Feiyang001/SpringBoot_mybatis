package com.example.demo.dao;

import com.example.demo.entity.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void query() {
        List<Area> areas = areaDao.query();
        assertEquals(2,areas.size());
    }

    @Test
    @Ignore
    public void queryById() {
        Area area = areaDao.queryById(1);
        assertEquals("东苑",area.getAreaName());
    }

    @Test
    @Ignore
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("西苑");
        area.setPriority(1);
        int i = areaDao.insertArea(area);
        assertEquals(1,i);
    }

    @Test
    @Ignore
    public void updateArea() {
        Area area = areaDao.queryById(1);
        area.setAreaName("伯克利");
        areaDao.updateArea(area.getAreaId());
    }

    @Test
    @Ignore
    public void deleteArea() {
        int i = areaDao.deleteArea(2);
        assertEquals(1,i);
    }

}
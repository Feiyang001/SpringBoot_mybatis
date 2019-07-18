package com.example.demo.service.Imp;

import com.example.demo.dao.AreaDao;
import com.example.demo.entity.Area;
import com.example.demo.service.IAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service("iAreaService")
public class AreaServiceImp implements IAreaService {


    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> getAreaList() {
        return areaDao.query();
    }

    @Override
    public Area getById(Integer id) {
        return areaDao.queryById(id);
    }

    @Override
    @Transactional
    public boolean addArea(Area area) {
        if (area.getAreaName() != null && "".equals(area.getAreaName())){
            area.setCreatTime(new Date());
            area.setLastEditTime(new Date());
            try {
                int i = areaDao.insertArea(area);
                if (i>0){
                    return true;
                }else {
                    throw new RuntimeException("添加失败");
                }
            }catch (Exception e){
                throw new RuntimeException("添加失败"+e.getMessage());
            }
        }else {
            throw new RuntimeException("区域信息不能为空");
        }
    }

    @Override
    public boolean updateArea(Area area) {
        if (area.getAreaId() != null && "".equals(area.getAreaId())){
            area.setLastEditTime(new Date());
            try {
                int i = areaDao.updateArea(area.getAreaId());
                if (i>0){
                    return true;
                }else {
                    throw new RuntimeException("添加失败");
                }
            }catch (Exception e){
                throw new RuntimeException("添加失败"+e.toString());
            }
        }else {
            throw new RuntimeException("区域信息不能为空");
        }
    }

    @Override
    public boolean deleteArea(Integer id) {
        if (id != null && "".equals(id)) {
            try {
                int i = areaDao.deleteArea(id);
                if (i > 0) {
                    return true;
                } else {
                    throw new RuntimeException("添加失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("添加失败" + e.toString());
            }
        } else {
            throw new RuntimeException("区域id不能为空");
        }
    }
}

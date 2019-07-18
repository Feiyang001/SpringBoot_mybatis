package com.example.demo.contrller;

import com.example.demo.entity.Area;
import com.example.demo.service.IAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController //@Controller和@ResponseBody 的组合标签
@RequestMapping("/admin")
public class AreaController {

    @Autowired
    private IAreaService iAreaService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    private Map<String,Object> listArea(){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        List<Area> areaList = iAreaService.getAreaList();
        modelMap.put("areaList",areaList);
        return modelMap;
    }

    @RequestMapping(value = "/getbyid",method = RequestMethod.GET)
    private Map<String,Object> getAreaById(Integer id){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        Area area = iAreaService.getById(id);
        modelMap.put("area",area);
        return modelMap;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    private Map<String,Object> addArea(@RequestBody Area area){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("success",iAreaService.addArea(area));
        return modelMap;
    }

    @RequestMapping(value = "/modify",method = RequestMethod.POST)
    private Map<String,Object> modifyArea(@RequestBody Area area){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("success",iAreaService.updateArea(area));
        return modelMap;
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    private Map<String,Object> deleteArea(Integer id){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("success",iAreaService.deleteArea(id));
        return modelMap;
    }


}

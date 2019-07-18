package com.example.demo.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 统一的异常处理的类
 *
 * 可以根据需要和实际的错误情况，提示相应的信息，
 *
 * 这个是一个类似的处理方式
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    private Map<String,Object> exceptionHandle(HttpServletRequest request,Exception e){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("success",false); //捕获到异常
        map.put("error",e.getMessage());
        return map;
    }

}

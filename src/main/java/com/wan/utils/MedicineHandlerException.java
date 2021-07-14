package com.wan.utils;

import com.wan.pojo.MedicineException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MedicineHandlerException implements HandlerExceptionResolver {
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) {
        ModelAndView mv = new ModelAndView();
        if(e instanceof MedicineException){
            mv.addObject("expInfo",e.getMessage());
        }else{
            mv.addObject("expInfo","系统出现未知错误,请与管理员联系");
        }
        mv.setViewName("prompt");
        return mv;
    }
}

package com.wan.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/medicine")
public class MedicineController {
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String toMain(){

        return "index";
    }

}

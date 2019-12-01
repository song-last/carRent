package com.song.controller;

import com.song.pojo.BusCar;
import com.song.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;


@Controller
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/Test")
    public String Test1(){
        return "index";
    }

    @PostMapping("/car/{id}")
    @ResponseBody
    public Object Test(@PathVariable(value = "id")String id) throws UnsupportedEncodingException {
        String id1 = new String(id.getBytes("ISO8859-1"),"UTF-8");
        BusCar busCar = carService.findByCarNumber(id1);
        return busCar;
    }
}

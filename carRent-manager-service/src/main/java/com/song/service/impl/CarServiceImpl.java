package com.song.service.impl;

import com.song.mapper.BusCarMapper;
import com.song.pojo.BusCar;
import com.song.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    BusCarMapper busCarMapper;

    @Override
    public BusCar findByCarNumber(String id) {
        BusCar busCar = busCarMapper.selectByPrimaryKey(id);
        return busCar;
    }
}

package com.song.service;

import com.song.pojo.BusCar;

public interface CarService {

    BusCar findByCarNumber(String id);
}

package com.bramantio.ubay.webapp.services;

import com.bramantio.ubay.webapp.dto.CarModelDTO;

import java.util.List;

/**
 * Hi!
 * Created by captain_n3mo on 23/04/2017.
 */
public interface CarService {

    List<String> showCarName(); // for return name list of car

    CarModelDTO findDetail(String name); // for return information of selected car

}

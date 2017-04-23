package com.bramantio.ubay.webapp.dto;

/**
 * Hi!
 * Created by captain_n3mo on 23/04/2017.
 */
public class CarModelDTO {

    private int carId;
    private String carName;
    private String carDescription;
    private String carUrl;

    public CarModelDTO(int carId, String carName, String carDescription, String carUrl) {
        this.carId = carId;
        this.carName = carName;
        this.carDescription = carDescription;
        this.carUrl = carUrl;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarDescription() {
        return carDescription;
    }

    public void setCarDescription(String carDescription) {
        this.carDescription = carDescription;
    }

    public String getCarUrl() {
        return carUrl;
    }

    public void setCarUrl(String carUrl) {
        this.carUrl = carUrl;
    }

}
package com.bramantio.ubay.webapp.project;


import com.bramantio.ubay.webapp.dto.CarModelDTO;
import com.bramantio.ubay.webapp.dto.UserDTO;
import com.bramantio.ubay.webapp.services.CarService;
import com.bramantio.ubay.webapp.services.UserSevice;
import com.bramantio.ubay.webapp.services.implementation.CarServiceImpl;
import com.bramantio.ubay.webapp.services.implementation.UserServiceImpl;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zul.Messagebox;

import java.util.Date;
import java.util.List;

/**
 * Hi!
 * Created by captain_n3mo on 23/04/2017.
 */
public class homeVM {

    private String name, email, tujuan, carSelected, carName, carDescription, carUrl, phone;
    private int carId;
    private Date date, timeStart, timeEnd;
    private List<String> listCar;
    CarService carService = new CarServiceImpl();
    CarModelDTO carModelDto = new CarModelDTO();
    UserSevice userSevice = new UserServiceImpl();
    UserDTO userDTO = new UserDTO();

    @Command
    @NotifyChange({"carId", "carName", "carDescription", "carUrl", "name"})
    public void find(){
        carModelDto = carService.findDetail(carSelected);
        setCarId(carModelDto.getCarId());
        setCarName(carModelDto.getCarName());
        setCarDescription(carModelDto.getCarDescription());
        setCarUrl(carModelDto.getCarUrl());
        setName("masPanro");
        Messagebox.show("yuhu");
    }

    @Command
    public void booking(){
        userDTO.setUserName(this.name);
        userDTO.setUserPhone(this.phone);
        userDTO.setUserEmail(this.email);
        Boolean success = userSevice.saveUser(userDTO);
        if (success){
            Messagebox.show("YEAH, SAVED!","Information Saved", Messagebox.OK,Messagebox.INFORMATION);
        } else {
            Messagebox.show("OUCH, NOT SAVED!","Information Saved", Messagebox.OK,Messagebox.INFORMATION);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getListCar() {
        return carService.showCarName();
    }

    public void setListCar(List<String> listCar) {
        this.listCar = listCar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getCarSelected() {
        return carSelected;
    }

    public void setCarSelected(String carSelected) {
        this.carSelected = carSelected;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
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

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }
}

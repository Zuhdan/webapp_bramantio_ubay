package com.bramantio.ubay.webapp.dto;

import java.util.Date;
import com.bramantio.ubay.webapp.dto.CarModelDTO;
import com.bramantio.ubay.webapp.dto.UserDTO;

/**
 * Hi!
 * Created by captain_n3mo on 23/04/2017.
 */
public class BookingDTO {

    private UserDTO userBooker;
    private String tujuan;
    private Date dateUsed; //keterangan waktu dan tanggal booking
    private Date startHour, endHour; //keterangan waktu dan tanggal tujuan booking
    private CarModelDTO carModel;

    public BookingDTO(UserDTO userBooker, String tujuan, Date dateUsed, Date startHour, Date endHour, CarModelDTO carModel) {
        this.userBooker = userBooker;
        this.tujuan = tujuan;
        this.dateUsed = dateUsed;
        this.startHour = startHour;
        this.endHour = endHour;
        this.carModel = carModel;
    }

    public UserDTO getUserBooker() {
        return userBooker;
    }

    public void setUserBooker(UserDTO userBooker) {
        this.userBooker = userBooker;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public Date getDateUsed() {
        return dateUsed;
    }

    public void setDateUsed(Date dateUsed) {
        this.dateUsed = dateUsed;
    }

    public Date getStartHour() {
        return startHour;
    }

    public void setStartHour(Date startHour) {
        this.startHour = startHour;
    }

    public Date getEndHour() {
        return endHour;
    }

    public void setEndHour(Date endHour) {
        this.endHour = endHour;
    }

    public CarModelDTO getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModelDTO carModel) {
        this.carModel = carModel;
    }
}

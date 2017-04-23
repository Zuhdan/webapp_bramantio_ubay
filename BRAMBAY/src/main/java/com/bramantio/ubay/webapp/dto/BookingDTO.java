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
    private Date dateBooking, hourBooking; //keterangan waktu dan tanggal booking
    private Date dateBook, hourBook; //keterangan waktu dan tanggal tujuan booking
    private CarModelDTO carModel;

    public BookingDTO(UserDTO userBooker, String tujuan, Date dateBooking, Date hourBooking, Date dateBook, Date hourBook, CarModelDTO carModel) {
        this.userBooker = userBooker;
        this.tujuan = tujuan;
        this.dateBooking = dateBooking;
        this.hourBooking = hourBooking;
        this.dateBook = dateBook;
        this.hourBook = hourBook;
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

    public Date getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(Date dateBooking) {
        this.dateBooking = dateBooking;
    }

    public Date getHourBooking() {
        return hourBooking;
    }

    public void setHourBooking(Date hourBooking) {
        this.hourBooking = hourBooking;
    }

    public Date getDateBook() {
        return dateBook;
    }

    public void setDateBook(Date dateBook) {
        this.dateBook = dateBook;
    }

    public Date getHourBook() {
        return hourBook;
    }

    public void setHourBook(Date hourBook) {
        this.hourBook = hourBook;
    }

    public CarModelDTO getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModelDTO carModel) {
        this.carModel = carModel;
    }
}

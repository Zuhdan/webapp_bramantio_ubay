package com.bramantio.ubay.webapp.services;

import com.bramantio.ubay.webapp.dto.BookingDTO;

/**
 * Hi!
 * Created by captain_n3mo on 24/04/2017.
 */
public interface BookingService {
    Boolean saveAll(BookingDTO bookingDTO);
    BookingDTO showAll();
}

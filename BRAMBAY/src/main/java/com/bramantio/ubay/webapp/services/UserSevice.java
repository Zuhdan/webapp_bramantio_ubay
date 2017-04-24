package com.bramantio.ubay.webapp.services;

import com.bramantio.ubay.webapp.dto.UserDTO;

/**
 * Hi!
 * Created by captain_n3mo on 24/04/2017.
 */
public interface UserSevice {

    Boolean saveUser(UserDTO userDTO);
    UserDTO getUser(String name);

}

package com.proyectopoo.proyectopoo.aplication.services.user;

import com.proyectopoo.proyectopoo.config.response.MessageRespone;
import com.proyectopoo.proyectopoo.infrastructure.dto.user.UserDTO;

public interface UserSevice {

    MessageRespone createUser(UserDTO userDTO);
}

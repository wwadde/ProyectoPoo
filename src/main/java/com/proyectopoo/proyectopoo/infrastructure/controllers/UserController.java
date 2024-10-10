package com.proyectopoo.proyectopoo.infrastructure.controllers;


import com.proyectopoo.proyectopoo.aplication.services.user.UserSevice;
import com.proyectopoo.proyectopoo.config.response.MessageRespone;
import com.proyectopoo.proyectopoo.infrastructure.dto.user.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {


    private final UserSevice userService;


    @PostMapping("/createUser") //crear
    public ResponseEntity<MessageRespone> createUser(@RequestBody UserDTO userDTO) {
        //crear el usuario


        return new ResponseEntity<>( , HttpStatus.OK);


    }






}

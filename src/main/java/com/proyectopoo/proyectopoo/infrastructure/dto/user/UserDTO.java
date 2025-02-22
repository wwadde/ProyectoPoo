package com.proyectopoo.proyectopoo.infrastructure.dto.user;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private String name;

    private String password;

    private String email;

    private String userName;

}

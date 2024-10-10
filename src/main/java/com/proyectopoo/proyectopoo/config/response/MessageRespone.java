package com.proyectopoo.proyectopoo.config.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageRespone<T> {

    private String message;
    private boolean success;
    private T data;

}

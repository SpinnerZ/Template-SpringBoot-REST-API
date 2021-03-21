package com.springboot.templaterest.entities.dtos;

import lombok.Getter;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

public class ResponseDTO<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Getter private UUID messageId = UUID.randomUUID();
    @Getter private Instant instant = Instant.now();
    @Getter private final String message = "";
    @Getter private T data;

    public ResponseDTO(T data) {
        this.data = data;
    }
}

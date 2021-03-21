package com.springboot.templaterest.controllers.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    @Getter private final UUID messageId = UUID.randomUUID();
    @Getter private final Instant instant = Instant.now();
    @Getter @Setter private String message;
    @Getter private final String data = "";

    public StandardError(String message) {
        this.message = message;
    }
}

package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String message) {
        super(message);
        System.out.println(message);
    }
}

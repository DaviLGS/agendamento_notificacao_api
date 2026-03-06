package com.devmagalu.agendamento_notificacao_api.exception;

import org.hibernate.annotations.NotFound;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message){
        super(message);
    }
}

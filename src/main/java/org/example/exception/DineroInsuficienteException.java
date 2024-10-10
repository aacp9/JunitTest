package org.example.exception;
//extendemos la clase a RuntimeException
public class DineroInsuficienteException extends RuntimeException{
    public DineroInsuficienteException(String message){
        super(message);
    }
}

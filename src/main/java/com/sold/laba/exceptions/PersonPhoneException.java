package com.sold.laba.exceptions;

public class PersonPhoneException extends PersonInformationException{
    public PersonPhoneException() {super("unsuitable phone");}
    public PersonPhoneException(String message) {super(message);}
}

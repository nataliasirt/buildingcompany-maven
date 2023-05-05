package com.solvd.laba.exceptions;

public class PersonLastNameException extends PersonInformationException{
    public PersonLastNameException() {super("unsuitable last name");}
    public PersonLastNameException(String message) {super(message);}
}

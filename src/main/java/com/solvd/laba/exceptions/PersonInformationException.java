package com.solvd.laba.exceptions;

public class PersonInformationException extends IncorrectDataException {
    public PersonInformationException() {super("Please try to change");}
    public PersonInformationException(String message) {super(message);}
}

package com.solvd.laba.exceptions;

public class PersonNameException extends PersonInformationException{
    public PersonNameException() {super("unsuitable name"); }
    public PersonNameException(String message) {super(message); }
}
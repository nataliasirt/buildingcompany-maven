package com.sold.laba.exceptions;
import java.io.IOException;
public class IncorrectDataException extends IOException{
    public IncorrectDataException () {super("Input data is incorrect");}
    public IncorrectDataException(String message) {super(message);}
}



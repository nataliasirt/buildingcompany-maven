package com.solvd.laba.interfaces;

import com.solvd.laba.exceptions.PrintNullException;

public interface IPrint {

    void printPersonalInfo(String s) throws PrintNullException;

    void printPersonalInfo() throws PrintNullException;
}
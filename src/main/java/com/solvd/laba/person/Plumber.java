package com.solvd.laba.person;
import com.solvd.laba.exceptions.AgeException;

public class Plumber extends Employee {

    public Plumber(String personName, double baseSalary, int subordinatesNumber)  {
        super(personName, baseSalary, subordinatesNumber);
        }
    private boolean highEducation;

    public boolean isHighEducation() {
        return highEducation;
    }

}
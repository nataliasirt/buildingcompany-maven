package com.solvd.laba.person;
import com.solvd.laba.exceptions.AgeException;
import com.solvd.laba.exceptions.PrintNullException;

public class Employee extends Person {
    private String personName;
    private double baseSalary = 1000;
    private int subordinatesNumber;

    public Employee(String personName, int personAge, double baseSalary, int subordinatesNumber) throws AgeException {
        super(personName, personAge);
        this.personName = personName;
        this.baseSalary = baseSalary;
        this.subordinatesNumber = subordinatesNumber;
    }

    public Employee(String personName, double baseSalary, int subordinatesNumber) {
    }

    public String getName() {
            return personName;}
    public double getBaseSalary() {
            return baseSalary;}
    public int getSubordinatesNumber() {
            return subordinatesNumber;}
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setSubordinatesNumber(int subordinatesNumber) {
            this.subordinatesNumber = subordinatesNumber;
        }

    @Override
    public void printPersonalInfo() throws PrintNullException {

    }


}
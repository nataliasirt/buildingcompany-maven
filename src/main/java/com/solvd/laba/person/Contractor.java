package com.solvd.laba.person;


public abstract class Contractor {
    public String nameOfContractor;
    public int numberOfEmployees;

    public void setNameOfContractor(String nameOfContractor){
        this.nameOfContractor = nameOfContractor;
    }

    String getNameOfContractor(){
        return nameOfContractor;
    }

    public void setNumberOfEmployees(int numberOfEmployees){
        this.numberOfEmployees = numberOfEmployees;
    }

    int getNumberOfEmployees(){
        return numberOfEmployees;
    }

}

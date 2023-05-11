package com.solvd.laba.person;

public class Manager extends Employee {
    private static final double K = 0.03;

    public Manager(String personName, double baseSalary, int subordinatesNumber) {
        super(personName, baseSalary, subordinatesNumber);
    }
    @Override
    public double getBaseSalary() {
        double salaryManager;
        if(getSubordinatesNumber() == 0) {
            salaryManager = super.getBaseSalary();
        } else {
            salaryManager = super.getBaseSalary() * getSubordinatesNumber() * K;
        }
        return salaryManager;
    }
}


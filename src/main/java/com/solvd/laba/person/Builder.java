package com.solvd.laba.person;


import com.solvd.laba.exceptions.AgeException;

public abstract class Builder extends Person {
    private int salary;

    public Builder(String personName, int personAge, int salary) throws AgeException {
        super(personName, personAge);
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return " Builder{" +
                ", salary =" + salary +
                '}';
    }
}

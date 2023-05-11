package com.solvd.laba.person;
import com.solvd.laba.exceptions.AgeException;
import java.util.Objects;

public class Electrician extends Employee {

    private boolean insurance;
    private int worksYearExperience;

    public Electrician(String personName, int personAge, double baseSalary, int subordinatesNumber, boolean insurance, int worksYearExperience) throws AgeException {
        super(personName, baseSalary, subordinatesNumber);
        this.insurance = insurance;
        this.worksYearExperience = worksYearExperience;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public int getWorksYearExperience() {
        return worksYearExperience;
    }

    public void setWorksYearExperience(int worksYearExperience) {
        this.worksYearExperience = worksYearExperience;
    }


    @Override
    public String toString() {
        return "Electrician{" +
                "insurance=" + insurance +
                ", worksYearExperience=" + worksYearExperience +
                ", salary=" + getBaseSalary() +
                ", personName='" + getPersonName() + '\'' +
                ", personAge=" + personAge +
                "} " + super.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), insurance, worksYearExperience);
    }

    @Override
    public void printPersonalInfo(String s) {
        System.out.println("My Electrician Info: " + getPersonName() + " " + getPersonAge() + " Experience: " + getWorksYearExperience());
    }
}
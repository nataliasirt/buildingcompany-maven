package com.solvd.laba.person;
import com.solvd.laba.exceptions.AgeException;
import com.solvd.laba.enums.*;
import com.solvd.laba.interfaces.IDrive;

public abstract class Driver extends Employee implements IDrive {

    public Driver(String personName, int personAge, int salary, DriveCategory driveCategory) throws AgeException {
        super(personName, personAge, salary);
        this.driveCategory = driveCategory;
    }
    private DriveCategory driveCategory;

    public Driver(String personName, double baseSalary, int subordinatesNumber) {
        super(personName, baseSalary, subordinatesNumber);
    }

    public DriveCategory getDriveCategory() {
        return driveCategory;
    }

    public void setDriveCategory(DriveCategory driveCategory) {
        this.driveCategory = driveCategory;
    }


    @Override
    public void driveTo() {

    }
}
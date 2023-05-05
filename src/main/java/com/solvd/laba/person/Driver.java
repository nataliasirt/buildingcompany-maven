package com.solvd.laba.person;
import com.solvd.laba.exceptions.AgeException;
import com.solvd.laba.enums.*;
import com.solvd.laba.interfaces.IDrive;

public class Driver extends Employee implements IDrive {

    public Driver(String personName, int personAge, int salary, DriveCategory driveCategory) throws AgeException {
        super(personName, personAge, salary);
        this.driveCategory = driveCategory;
    }

    private DriveCategory driveCategory;

    public Driver() {
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
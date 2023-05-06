package com.solvd.laba.person;
import com.solvd.laba.exceptions.AgeException;
import com.solvd.laba.exceptions.PrintNullException;
import com.solvd.laba.interfaces.IPrint;
import java.util.Objects;

public class Employee extends Person implements IPrint {

    protected int salary;
    public static int numberOfEmployees;

    public Employee() {
    }

    public Employee(String personName, int personAge, int salary) throws AgeException {
        super(personName, personAge);
        this.salary = salary;
    }

    public Employee(String personName, int personAge) throws AgeException {
        super(personName, personAge);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void setNumberOfEmployees(int employeesCount) {
        Employee.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Name: " + getPersonName() + "\n" + "Age: " + getPersonAge() + "\n" + "\n" +
                "\n" +
                "salary: " + getSalary();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return personAge == employee.personAge && salary == employee.salary && Objects.equals(personName, employee.personName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), personName, personAge, salary);
    }

    @Override
    public void printPersonalInfo() throws PrintNullException {

    }
}
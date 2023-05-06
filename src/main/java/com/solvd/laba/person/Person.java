package com.solvd.laba.person;
import com.solvd.laba.exceptions.AgeException;
import com.solvd.laba.exceptions.PrintNullException;
import com.solvd.laba.interfaces.IPrint;
import java.util.Objects;


public abstract class Person implements IPrint {

    protected String personName;
    protected int personAge;

    public Person(String personName, int personAge) throws AgeException {
        this.personName = personName;
        this.personAge = personAge;
    }

    public Person() {
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) throws AgeException {
        this.personAge = personAge;
        if (personAge <= 0 || personAge > 65) {
            throw new AgeException("Age is not correct!!! ");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personAge=" + personAge +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personAge == person.personAge && Objects.equals(personName, person.personName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personName, personAge);
    }

    @Override
    public void printPersonalInfo(String s) throws PrintNullException {
        if (s == null) {
            throw new PrintNullException("Info is null !");
        }
    }
}
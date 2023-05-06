package com.solvd.laba.person;
import com.solvd.laba.exceptions.AgeException;
import com.solvd.laba.exceptions.PrintNullException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client extends Person {

    List<Client> allClients = new ArrayList<>();
    private String clientName;
    private int phoneNumber;

    public Client() {
    }

    public Client(String personName, int personAge, int id, String personSurname, String companyName, int phoneNumber) throws AgeException {
        super(personName, personAge);
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
    }
    public String getCompanyName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getTelephoneNumber() {
        return phoneNumber;
    }

    public void setTelephoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "companyName " + clientName + "\n" +
                "telephoneNumber " + phoneNumber + "\n"
                + "name " + getPersonName() + "\n" + "age " + getPersonAge() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return phoneNumber == client.phoneNumber && Objects.equals(clientName, client.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),  clientName, phoneNumber);
    }

    @Override
    public void printPersonalInfo(String s) {
        System.out.println("This is my project");
    }

    @Override
    public void printPersonalInfo() throws PrintNullException {
    }

    public List<Client> addClient(Client client) {
        allClients.add(client);
        return allClients;
    }
}

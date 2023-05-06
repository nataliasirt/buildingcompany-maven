package com.solvd.laba.database;
import com.solvd.laba.exceptions.AgeException;
import com.solvd.laba.exceptions.PrintNullException;
import com.solvd.laba.person.Client;
import com.solvd.laba.person.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class BuildingCompany {
    private String nameOfCompany;
    private int numberOfEmployees;

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public BuildingCompany(String nameOfCompany, int numberOfEmployees) {

    }

    private static final Logger LOGGER = LogManager.getLogger(BuildingCompany.class);

    public static void main(String[] args) {

        try {
            Employee employee1 = new Employee("Ivan Sidorov", 28, 1500);
            employee1.printPersonalInfo(null);
        } catch (PrintNullException | AgeException e) {
            LOGGER.error(e.getMessage());
        }
    }

    public void buildingTheHouse() {

        Client client = new Client();
        {
            Scanner scanner = new Scanner(System.in);
            String messageOne = "Enter Client's name: ";
            LOGGER.info(messageOne);
            String clientName = scanner.nextLine();
            client.setClientName(clientName);
        }

        int houseArea;
        {
            Scanner scanner = new Scanner(System.in);
            String messageOne = "Enter area of the house: ";
            LOGGER.info(messageOne);
            houseArea = scanner.nextInt();
        }

        int priceForAllWork;
        {
            Scanner scanner = new Scanner(System.in);
            String messageOne = "Enter price for one square meter(USA Dollar): ";
            LOGGER.info(messageOne);
            double priceForOneSquareMeter = scanner.nextDouble();
            priceForAllWork = (int) (houseArea * priceForOneSquareMeter);
        }

        ContractorCompany contractorCompany = new ContractorCompany();
        {
            Scanner scanner = new Scanner(System.in);
            String messageOne = "Enter contractor's company name: ";
            LOGGER.info(messageOne);
            String contractorCompanyName = scanner.nextLine();
            contractorCompany.setNameOfContractor(contractorCompanyName);

            String messageTwo = "Enter count of number of employees: ";
            LOGGER.info(messageTwo);
            int numberOfEmployees = scanner.nextInt();
            contractorCompany.setNumberOfEmployees(numberOfEmployees);
        }
    }
}

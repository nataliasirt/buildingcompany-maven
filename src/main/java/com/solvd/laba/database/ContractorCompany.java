package com.solvd.laba.database;
import com.solvd.laba.person.Contractor;

public class ContractorCompany extends Contractor {

    public ContractorCompany(){
        nameOfContractor = "";
        numberOfEmployees = 0;
    }

    public ContractorCompany(String nameOfContractor, int numberOfEmployees){
        this.nameOfContractor = nameOfContractor;
        this.numberOfEmployees = numberOfEmployees;
    }
}

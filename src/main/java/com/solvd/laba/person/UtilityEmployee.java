package com.solvd.laba.person;
import com.solvd.laba.exceptions.AgeException;
import java.util.ArrayList;
import java.util.Arrays;

public class UtilityEmployee {
    public static void main(String[] args) {
        ArrayList<String> employeesArrayList = new ArrayList<>();
        ArrayList<String> employeesArrayList2 = new ArrayList<>(Arrays.asList("Alex", "Max", "Anna"));
        System.out.println(employeesArrayList2.get(2));
    }

    public static double getSalaryBudget(Employee[] employees) {
        double salaryBudget = 0;
        for (Employee employee : employees) {
            salaryBudget += employee.getBaseSalary();
        }
        return salaryBudget;
    }

    public static double getMinSalary(Employee[] employees) {
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (minSalary > employee.getBaseSalary()) {
                minSalary = employee.getBaseSalary();
            }
        }
        return minSalary;
    }

    public static double getMaxSalary(Employee[] employees) {
        double maxSalary = 0;
        for (Employee employee : employees) {
            if (maxSalary < employee.getBaseSalary()) {
                maxSalary = employee.getBaseSalary();
            }
        }
        return maxSalary;
    }

    public static int getMinSubordinatesNumber(Employee[] employees) {
        int minSubNum = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (minSubNum > employee.getSubordinatesNumber()) {
                minSubNum = employee.getSubordinatesNumber();
            }
        }
        return minSubNum;
    }

    public static int getMaxSubordinatesNumber(Employee[] employees) {
        int maxSubNum = 0;
        for (Employee employee : employees) {
            if (maxSubNum < employee.getSubordinatesNumber()) {
                maxSubNum = employee.getSubordinatesNumber();
            }
        }
        return maxSubNum;
    }
}
package com.company;

import com.company.devices.Car;


import java.util.Date;

public class Human {
   public String firstName;
    public String lastName;
    public Animal pet;
    public Car machine;
    public Double salary;
    public Double lastSalaryCheck;
    public Date lastSalaryDate;
    public Double cash;


       public Human() {
        this.salary = 10000.0;
        this.lastSalaryDate = new Date();
        this.lastSalaryCheck = this.salary;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }


    public Double getSalary() {
        System.out.println("You recently checked your payout: " + this.lastSalaryDate + " it was: " + lastSalaryCheck + " PLN");
        this.lastSalaryCheck = this.salary;
        this.lastSalaryDate = new Date();
        return this.salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Dude you have not income");
        } else {
            System.out.println("New data has been sent to the accounting system");
            System.out.println("Please collect the annex to the contract from Hania from HR");
            System.out.println("By the way, ZUS and US already knows about changing your paycheck, hiding your income won't do anything");
            this.salary = salary;
        }
    }

    public Car pickMachine() {
        return machine;
    }

    public void unsetVehicle() {
        this.machine = null;
    }

    public Car getMachine() {
        return machine;
    }

    public void setMachine(Car newCar) {
        if (this.salary > newCar.price) {
            this.machine = newCar;
            System.out.println("Damn, You can buy it for cash!");
        } else if (this.salary > (newCar.price / 12)) {
            this.machine = newCar;
            System.out.println("Well, you'll pay off the loan");
        } else {
            System.out.println("Change job, take a loan, as someone once said");
        }
    }


    @Override
    public String toString() {
        return "Human{" +
                "First Name='" + firstName + "\n" +
                ", Last Name='" + lastName + "\n" +
                ", Pet=" + pet + "\n" +
                ", Car=" + machine + "\n" +
                ", Salary=" + salary + "\n" +
                ", Last Salary date=" + lastSalaryDate + "\n" +
                ", Last salary value=" + lastSalaryCheck +
                '}';

    }

}








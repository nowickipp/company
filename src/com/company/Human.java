package com.company;

import com.company.devices.Car;
import com.company.farmVille.Animal;


import java.util.Date;

import static java.util.Objects.nonNull;

public class Human {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Car[] garage;
    public Double salary;
    public Double lastSalaryCheck;
    public Date lastSalaryDate;
    public Double cash;
    public Double getCash;


    public Human(String firstName, String lastName) {
        this.salary = 10000.0;
        this.lastSalaryDate = new Date();
        this.lastSalaryCheck = this.salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = new Car[2];
    }

    public Human(String firstName, String lastName, int garageSize) {
        this.salary = 10000.0;
        this.lastSalaryDate = new Date();
        this.lastSalaryCheck = this.salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = new Car[garageSize];
    }

    public Car getCar(int number) {
        return this.garage[number];
    }

    public void setCar(Car car, int place) {
        this.garage[(place - 1)] = car;
    }

    public Double carValue(){
        Double sum = 0d;
        for (Car car : garage){
            if (car != null){
                sum += car.getValue();
            }
        }
        return sum;
    }

    public void removeCar(Car newCar) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == newCar) {
                this.garage[i] = null;
            }
        }
    }

    public boolean isFreeSpace() {
        for (Car car : garage) {
            if (car == null) {
                return true;
            }
        }
        return false;
    }

    public boolean haveCar(Car thatCar) {
        for (Car car : garage) {
            if (car == thatCar) {
                return true;
            }
        }
        return false;
    }

    public void myCars() {
        for (int i = 0; i < this.garage.length; i++) {
            if (nonNull(this.getCar(i)))
                System.out.println(this.firstName  + (i + 1)  + this.getCar(i));
        }
    }
    public int freePlace() {
        int x = 0;
        for (int i = 1; i <= this.garage.length; i++) {
            if (this.getCar((i - 1)) == null) {
                x = 1;
                break;
            }
        }
        return x;
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




    @Override
    public String toString() {
        return "Human{" +
                "First Name='" + firstName + "\n" +
                ", Last Name='" + lastName + "\n" +
                ", Pet=" + pet + "\n" +
                ", Salary=" + salary + "\n" +
                ", Last Salary date=" + lastSalaryDate + "\n" +
                ", Last salary value=" + lastSalaryCheck +
                '}';

    }


}








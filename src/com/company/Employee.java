package com.company;

public class Employee {

    String nume, email;
    int freeDays;
    double capacity, hourRate;

    public Employee(String nume, String email, double hourRate, int freeDays, double capacity){
        this.nume=nume;
        this.email=email;
        this.hourRate=hourRate;
        this.freeDays=freeDays;
        this.capacity=capacity;
    }
    public double calculateDailyIncome(){
        return hourRate *capacity;
    }
    public double calculateMonthlyIncome(){
        return calculateDailyIncome()*(21-freeDays);
    }



}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hrmanagement;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class PartTimeEmployee extends employee {
    private double workingHour;
    private double payRate;

    public PartTimeEmployee() {
        
    }

    public PartTimeEmployee(double workingHour, double payRate, String id, String name, int yearOfBirth, String address, String phone) {
        super(id, name, yearOfBirth, address, phone);
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    public double getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(double workingHour) {
        this.workingHour = workingHour;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public void InputEmployee()
    {
        super.InputEmployee();
        Scanner sc = new Scanner(System.in);
        System.out.print("Working hours: ");
        workingHour = sc.nextInt();
        System.out.print("Pay rate: ");
        payRate = sc.nextDouble();
    }
    @Override
    public void getInfo() {
        System.out.println("ID:"+getId()+" -Name:"+getName()+" -Birth:"+getYearOfBirth()+" -Address:"+getAddress()+" -Phone:"+getPhone()+"- Working Hour: "+workingHour+"- Pay Rate: "+payRate);

    }

    @Override
    public double getPayment() {
        return workingHour*payRate;
    }
    
}

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
public class FullTimeEmployee extends employee {
    private double salary;

    public FullTimeEmployee() {
        
    }

    public FullTimeEmployee(double salary, String id, String name, int yearOfBirth, String address, String phone) {
        super(id, name, yearOfBirth, address, phone);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public void InputEmployee()
    {
        super.InputEmployee();
        Scanner sc = new Scanner(System.in);
        System.out.print("Salary: ");
        salary = sc.nextDouble();
    }
    
    @Override
    public void getInfo()
    {
        System.out.println("ID:"+getId()+" -Name:"+getName()+" -Birth:"+getYearOfBirth()+" -Address:"+getAddress()+" -Phone:"+getPhone()+" -Salary:"+salary);
    }
    
    
    @Override
    public double getPayment()
    {
        return salary;
    }
}

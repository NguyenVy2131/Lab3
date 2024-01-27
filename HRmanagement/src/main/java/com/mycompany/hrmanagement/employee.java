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
public abstract class employee {
    private String id;
    private String name;
    private int yearOfBirth;
    private String address;
    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public employee()
    {
    }
    public employee(String id, String name, int yearOfBirth, String address, String phone)
    {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
    }
    public void InputEmployee()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("The id of employee: ");
        id = sc.nextLine();
        System.out.print("The name of employee: ");
        name = sc.nextLine();
        System.out.print("The year of birth of employee: ");
        yearOfBirth = sc.nextInt();
        sc.nextLine();
        System.out.print("The address of employee: ");
        address = sc.nextLine();
        System.out.print("The phone number of employee: ");
        phone = sc.nextLine();
    }
    
    public abstract void getInfo();
    public abstract double getPayment();
    
    
}

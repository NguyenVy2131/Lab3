/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hrmanagement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class HRmanagement {

    public static Scanner sc = new Scanner(System.in);
    private ArrayList<FullTimeEmployee> fulltime = new ArrayList<>();
    private ArrayList<PartTimeEmployee> parttime = new ArrayList<>();

    public HRmanagement() {
    }

    public void inputfull() {
        System.out.print("Number of full time employees: ");
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            FullTimeEmployee emp = new FullTimeEmployee();
            emp.InputEmployee();
            fulltime.add( emp);
        }
    }

    public void inputpart() {
        System.out.print("Number of part time employees: ");
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            PartTimeEmployee empt = new PartTimeEmployee();
            empt.InputEmployee();
            parttime.add(empt);
        }
    }

    public void outputfull() {
        for (int i = 0; i < fulltime.size(); i++) {
            fulltime.get(i).getInfo();
        }
    }

    public void outputpart() {
        for (int i = 0; i < parttime.size(); i++) {
            parttime.get(i).getInfo();
        }
    }

    public static void main(String[] args) {
        int menu;
        HRmanagement Employee = new HRmanagement();
        do {
            System.out.printf("\n" + "1: Add Full-time Employee\n"
                    + "2: Add Part-time Employee\n"
                    + "3: Show all Full-time Employee\n"
                    + "4: Show all Part-time Employee\n"
                    + "5: Show all Employee\n"
                    + "6: Search Employee by Id \n"
                    + "7: Delete Employee by Id \n"
                    + "8: Edit Employee information by Id\n"
                    + "9: Search Employee by payment \n"
                    + "10: Sort Full-time Employee and Part-Time employee in ascending order by age, payment\n"
                    + "11: Exit\nInput ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    Employee.inputfull();
                    break;
                case 2:
                    Employee.inputpart();
                    break;
                case 3:
                    Employee.outputfull();
                    break;
                case 4:
                    Employee.outputpart();
                    break;
                case 5:
                    Employee.outputfull();
                    Employee.outputpart();
                    break;
                case 6:
                    Employee.searchID();
                    break;
                case 7:
                    Employee.deleteID();
                    break;
                case 8:
                    Employee.editID();
                    break;
                case 9:
                    Employee.SearchEmployeePayment();
                    break;
                case 10:
                    Employee.sort();
                    break;
                case 11:
            }
        } while (menu != 11);
    }

    public void searchID() {
        sc.nextLine();
        System.out.println("The ID you want to search: ");
        String searchid = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < Math.max(fulltime.size(), parttime.size()); i++) {
            if (i < fulltime.size() && fulltime.get(i).getId().equals(searchid)) {
                fulltime.get(i).getInfo();
                flag = true;
            }
            if (i < parttime.size() && parttime.get(i).getId().equals(searchid)) {
                parttime.get(i).getInfo();
                flag = true;
            }
        }
        if (!flag) {
            System.out.print("The company does not have this ID ");
        }

    }

    public void deleteID() {
        sc.nextLine();
        System.out.print("The ID you want to delete: ");
        String ID = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < Math.max(fulltime.size(), parttime.size()); i++) {
            if (i < fulltime.size() && fulltime.get(i).getId().equals(ID)) {
                fulltime.remove(i);
                flag = true;
            }
            if (i < parttime.size() && parttime.get(i).getId().equals(ID)) {
                parttime.remove(i);
                flag = true;
            }
        }
        if (!flag) {
            System.out.print("The company does not have this ID");
        }
        else
            System.out.print("Deleted successfully");
    }

    public void editID() {
        System.out.print("The ID you want to edit: ");
        sc.nextLine();
        String id = sc.next();
        boolean flag = false;
        for (FullTimeEmployee i : fulltime) {
            if (i.getId().equals(id)) {
                int n;
                do {
                    System.out.print("\n" + "1: Edit name\n"
                            + "2: Edit year of birth\n"
                            + "3: Edit address\n"
                            + "4: Edit phone\n"
                            + "5: Output result\n"
                            + "6: Finish\nInput ");
                    n = sc.nextInt();
                    switch (n) {
                        case 1:
                            System.out.print("New name: ");
                            String newname = sc.next();
                            sc.nextLine();
                            i.setName(newname);
                            break;
                        case 2:
                            System.out.print("New year of birth: ");
                            int newyear = sc.nextInt();
                            sc.nextLine();
                            i.setYearOfBirth(newyear);
                            break;
                        case 3:
                            System.out.print("New address: ");
                            String newaddress = sc.nextLine();
                            sc.nextLine();
                            i.setAddress(newaddress);
                            break;
                        case 4:
                            System.out.print("New phone number: ");
                            String phone = sc.nextLine();
                            sc.nextLine();
                            i.setPhone(phone);
                            break;
                        case 5:
                            for (FullTimeEmployee d : fulltime) {
                                d.getInfo();
                            }
                            break;
                        case 6:
                    }
                } while (n != 6);
            }

        }
        for (PartTimeEmployee i : parttime) {
            if (i.getId().equals(id)) {
                int n;
                do {
                    System.out.print("\n" + "1: Edit name\n"
                            + "2: Edit year of birth\n"
                            + "3: Edit address\n"
                            + "4: Edit phone\n"
                            + "5: Output result\n"
                            + "6: Finish\nInput ");
                    n = sc.nextInt();
                    switch (n) {
                        case 1:
                            System.out.print("New name: ");
                            String newname = sc.next();
                            sc.nextLine();
                            i.setName(newname);
                            break;
                        case 2:
                            System.out.print("New year of birth: ");
                            int newyear = sc.nextInt();
                            sc.nextLine();
                            i.setYearOfBirth(newyear);
                            break;
                        case 3:
                            System.out.print("New address: ");
                            String newaddress = sc.nextLine();
                            sc.nextLine();
                            i.setAddress(newaddress);
                            break;
                        case 4:
                            System.out.print("New phone number: ");
                            String phone = sc.nextLine();
                            sc.nextLine();
                            i.setPhone(phone);
                            break;
                        case 5:
                            for (PartTimeEmployee d : parttime) {
                                d.getInfo();
                            }
                            break;
                        case 6:
                    }
                } while (n != 6);
            }
            if (!flag) {
                System.out.print("The company does not have this ID");
            } else {
                System.out.print("Editied successfully");
            }
        }
    }
    public void SearchEmployeePayment() {
        System.out.println("A range of payment:");
        System.out.print("From:");
        double from = sc.nextDouble();
        System.out.print("To:");
        double to = sc.nextDouble();
        boolean flag = false;
        for (FullTimeEmployee full : fulltime) {
            if (full.getPayment() >= from && full.getPayment() <= to) {
                flag = true;
                full.getInfo();
            }
        }
        for (PartTimeEmployee part : parttime) {
            if (part.getPayment() >= from && part.getPayment() <= to) {
                flag = true;
                part.getInfo();
            }
        }
        if (!flag) {
            System.out.println("There are not any employee with payment in this range");
        }
    }

    public void sort() {
        Comparator<FullTimeEmployee> compare = new Comparator<FullTimeEmployee>() {
            @Override
            public int compare(FullTimeEmployee o1, FullTimeEmployee o2) {
                if (o1.getYearOfBirth() - o2.getYearOfBirth() > 0) {
                    return -1;
                } else if (o1.getYearOfBirth() - o2.getYearOfBirth() == 0) {
                    if (o1.getPayment() - o2.getPayment() > 0) {
                        return 1;
                    } else if (o1.getYearOfBirth() - o2.getYearOfBirth() == 0) {
                        return 0;
                    } else {
                        return -1;
                    }
                } else {
                    return 1;
                }
            }

        };
        Comparator<PartTimeEmployee> comparepart = new Comparator<PartTimeEmployee>() {
            @Override
            public int compare(PartTimeEmployee o1, PartTimeEmployee o2) {
                if (o1.getYearOfBirth() - o2.getYearOfBirth() > 0) {
                    return -1;
                } else if (o1.getYearOfBirth() - o2.getYearOfBirth() == 0) {
                    if (o1.getPayment() - o2.getPayment() > 0) {
                        return 1;
                    } else if (o1.getYearOfBirth() - o2.getYearOfBirth() == 0) {
                        return 0;
                    } else {
                        return -1;
                    }
                } else {
                    return 1;
                }
            }
        };
        fulltime.sort(compare);
        parttime.sort(comparepart);
        System.out.println("Fulltime Employee in ascending order by age");
        for (FullTimeEmployee full : fulltime) {
            full.getInfo();
        }
        System.out.println("Parttime Employee in ascending order by age");
        for (PartTimeEmployee part : parttime) {
            part.getInfo();
        }
    }
    }



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cdstore;

import java.util.*;

/**
 *
 * @author LENOVO
 */
public class CDStore {

    public static Scanner sc = new Scanner(System.in);
    private ArrayList<CDdetail> list = new ArrayList<>();

    public void CDStore() {
    }

    public void input() {
        System.out.print("Number of CD: ");
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            CDdetail detail = new CDdetail();
            detail.InputDetail();
            list.add(detail);
        }
    }

    public void output() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).Outputdetail();
        }
    }

    public static void main(String[] args) {
        int menu;
        CDStore CD = new CDStore();
        do {
            System.out.printf("\n" + "1: Add CD\n"
                    + "2: Search CD by CD title\n"
                    + "3: Search CDs by collection (game/movie/music)\n"
                    + "4: Search CDs by type (audio/video)\n"
                    + "5: Delete CD by CD Id\n"
                    + "6: Edit CD information by Id\n"
                    + "7: Display all CDs\n"
                    + "8: Sort the CD list ascending by year of release\n"
                    + "9: Exit\nInput ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    CD.input();
                    break;
                case 2:
                    CD.searchTitle();
                    break;
                case 3:
                    CD.searchCollection();
                    break;
                case 4:
                    CD.searchtype();
                    break;
                case 5:
                    CD.deleteID();
                    break;
                case 6:
                    CD.editID();
                    break;
                case 7:
                    CD.output();
                    break;
                case 8:
                    CD.sort();
                    break;
                case 9:
            }
        } while (menu != 9);
    }

    public void searchTitle() {
        sc.nextLine();
        System.out.println("The title you want to search: ");
        String searchtt = sc.nextLine();
        boolean flag = false;
        for (CDdetail i : list) {
            if (i.getTitle().equals(searchtt)) {
                i.Outputdetail();
                flag = true;
            }

        }
        if(!flag){
            System.out.print("The store does not have this title ");
        }

    }

    public void searchCollection() {
        sc.nextLine();
        System.out.print("The collection you want to search: ");
        String searchco = sc.next();
        boolean flag = false;
        for (CDdetail i : list) {
            if (i.getCDcollection().equals(searchco)) {
                i.Outputdetail();
                flag = true;
            } 
        }
        if(!flag){
            System.out.print("The store does not have this collection ");
        }
    }

    public void searchtype() {
        sc.nextLine();
        System.out.print("The type you want to search: ");
        String searchty = sc.next();
        boolean flag = false;
        for (CDdetail i : list) {
            if (i.getCDtype().equals(searchty)) {
                i.Outputdetail();
                flag = true;
            } 
        }
        if(!flag){
            System.out.print("The store does not have this type ");
        }
    }

    public void deleteID() {
        sc.nextLine();
        System.out.print("The ID you want to delete: ");
        int ID = sc.nextInt();
        boolean flag = false;
        for (CDdetail i : list) {
            if (i.getCDid() == ID) {
                list.remove(i);
                 flag = true;
            } 
        }
        if(!flag){
            System.out.println("The store does not have this ID");
        }
        else
            System.out.print("Deleted successfully");
    }

    public void sort() {
        Comparator<CDdetail> com = new Comparator<CDdetail>() {
            public int compare(CDdetail d1, CDdetail d2) {
                return d1.getYearRelease() - d2.getYearRelease();
            }
        };
        list.sort(com);
    }

    public void editID() {
        System.out.print("The ID you want to edit: ");
        sc.nextLine();
        int id = sc.nextInt();
        boolean flag = false;
        for (CDdetail i : list) {
            if (i.getCDid() == id) {
                int n;
                do {
                    System.out.print("\n" + "1: Edit collection\n"
                            + "2: Edit type\n"
                            + "3: Edit title\n"
                            + "4: Edit price\n"
                            + "5: Edit years of release\n"
                            + "6: Output result\n"
                            + "7: Finish\nInput ");
                    n = sc.nextInt();
                    switch (n) {
                        case 1:
                            System.out.print("New collection: ");
                            String newcollection = sc.next();
                            sc.nextLine();
                            i.setCDcollection(newcollection);
                            break;
                        case 2:
                            System.out.print("New type: ");
                            String newtype = sc.next();
                            sc.nextLine();
                            i.setCDtype(newtype);
                            break;
                        case 3:
                            System.out.print("New title: ");
                            String newtitle = sc.nextLine();
                            sc.nextLine();
                            i.setTitle(newtitle);
                            break;
                        case 4:
                            System.out.print("New price: ");
                            int newprice = sc.nextInt();
                            sc.nextLine();
                            i.setPrices(newprice);
                            break;
                        case 5:
                            System.out.print("New years of release: ");
                            int newyear = sc.nextInt();
                            sc.nextLine();
                            i.setYearRelease(newyear);
                            break;
                        case 6:
                            for (CDdetail d : list) {
                                d.Outputdetail();
                            }
                            break;
                        case 7:
                    }
                } while (n != 7);
            }
            
        }
        if(!flag){
        System.out.print("The store does not have this ID");
        }
        else{
            System.out.print("Editied successfully");
        }
    }
}

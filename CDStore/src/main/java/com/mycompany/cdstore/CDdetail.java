/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cdstore;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class CDdetail {
    private int CDid;
    private String CDcollection;
    private String CDtype;
    private String title;
    private int prices;
    private int yearRelease;

    public void setCDid(int CDid) {
        this.CDid = CDid;
    }

    public void setCDcollection(String CDcollection) {
        this.CDcollection = CDcollection;
    }

    public void setCDtype(String CDtype) {
        this.CDtype = CDtype;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
    public CDdetail()
    {
    }
    public CDdetail(int CDid, String CDcollection, String CDtype, String title, int prices, int yearrelease)
    {
        this.CDid = CDid;
        this.CDcollection = CDcollection;
        this.CDtype = CDtype;
        this.title = title;
        this.prices = prices;
        this.yearRelease = yearRelease;
    }


    public int getCDid() {
        return CDid;
    }

    public String getCDcollection() {
        return CDcollection;
    }

    public String getCDtype() {
        return CDtype;
    }

    public String getTitle() {
        return title;
    }

    public int getPrices() {
        return prices;
    }

    public int getYearRelease() {
        return yearRelease;
    }
    public void InputDetail()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("CD id: ");
        CDid = sc.nextInt();
        System.out.printf("CD collection 1: game; 2: movie; 3: music ");
        int a = sc.nextInt();
        if(a==1){
            CDcollection = "game";
        }
        if(a==2){
            CDcollection = "movie";
        }
        if(a==3){
            CDcollection = "music";
        }
        
        System.out.printf("CD type 1: audio; 2: video ");
        int b = sc.nextInt();
        if(b==1){
            CDtype = "audio";
        }
        if(b==2){
            CDtype = "video";
        }
        sc.nextLine();
        System.out.print("CD title: ");
        title = sc.nextLine();
        System.out.print("CD prices: ");
        prices = sc.nextInt();
        System.out.print("The year of release: ");
        yearRelease = sc.nextInt();
        
        
    }
    public void Outputdetail()
    {
        System.out.print(CDid+" - "+CDcollection+" - "+CDtype+" - "+title+" - "+prices+" - "+yearRelease+"\n");
    }
    
    
}

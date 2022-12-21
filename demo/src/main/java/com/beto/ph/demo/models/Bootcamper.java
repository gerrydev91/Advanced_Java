package com.beto.ph.demo.models;

public class Bootcamper {

    private String name;
    private double age;

    public double getage() {
        return age;
    }

    public void setage(double age) {
        this.age = age;
    }

   

    public Bootcamper(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public Bootcamper() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 

    

    
}

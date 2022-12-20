package com.beto.ph.demo.models;

public class Bootcamper {

    private String name;
    private double edad;

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

   

    public Bootcamper(String name, double edad) {
        this.name = name;
        this.edad = edad;
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

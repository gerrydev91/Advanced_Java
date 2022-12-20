package com.beto.ph.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.beto.ph.demo.models.Bootcamper;

@Service
public class BootcamperService {

private final List<Bootcamper> bootcampers = new ArrayList();

public  List<Bootcamper> getAll() {
    return bootcampers;
}

public  void add(Bootcamper bootcamper){
    bootcampers.add(bootcamper);
}
    
}

package com.beto.ph.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.beto.ph.demo.models.Bootcamper;

@Service
public class BootcamperService {

    //***** GITHUB FOOT PRINT *****

    private final List<Bootcamper> bootcampers = new ArrayList();

    public List<Bootcamper> getAll() {
        return bootcampers;
    }

    public void add(Bootcamper bootcamper) {
        bootcampers.add(bootcamper);
    }

    public Bootcamper getBC(String name) {

        for (Bootcamper bootcamper : bootcampers) {
            if (bootcamper.getName().equalsIgnoreCase(name)) {
                return bootcamper;
            }
        }

        return null;
    }

    public Bootcamper changeAge(String name, double age) {

        for (Bootcamper bootcamper : bootcampers) {
            if (bootcamper.getName().equalsIgnoreCase(name)) {
                bootcamper.setage(age);
                return bootcamper;
            }
        }

        return null;
    }

}

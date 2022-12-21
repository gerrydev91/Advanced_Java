package com.beto.ph.demo.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.stereotype.Component;

import com.beto.ph.demo.models.Bootcamper;
import com.beto.ph.demo.services.BootcamperService;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;

@Component
@Path("/")
public class BootcampersControllers { 
    
    /*The controller does not know anything about the model, it's the service 
    responsibility to communicate with model*/
    private BootcamperService bootcamperService;


    //The constructor must have as many services as we will use
    public BootcampersControllers (BootcamperService bootcamperService){
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("Gerardo", 31.9));
        this.bootcamperService.add(new Bootcamper("Laura", 34.0));
        this.bootcamperService.add(new Bootcamper("Teresa", 56.0));
        this.bootcamperService.add(new Bootcamper("Claribel", 36.0));

    }

    @GET
    @Path("/bootcampers")
    @Produces("Application/json")
    public List<Bootcamper> listAll(){
        return bootcamperService.getAll();
    }


    @GET
    @Path("/bootcampers/{name}")
    @Produces("Application/json")
    public  Bootcamper listOne(@PathParam("name") String name){
        return bootcamperService.getBC(name);
    }


    @PUT
    @Path("/bootcampers/{name}/{age}")
    @Produces("Application/json")
    @Consumes("Application/json")

    public  Bootcamper changeAge(@PathParam("name") String name, 
    @PathParam("age") double age){

        //Bootcamper bootcamper = new Bootcamper();
        return bootcamperService.changeAge(name, age);
        
    }

    @POST
    @Path("/bootcampers")
    @Produces("Application/json")
    @Consumes("Application/json")
    public Response insertBootcamper(Bootcamper bootcamper){
        bootcamperService.add(bootcamper);
        return Response.created(URI.create("/bootcamper" + 
        bootcamper.getName())
        ).build();

    }

    @DELETE
    @Path("/bootcampers/{name}/{age}")
    @Produces("Application/json")
    @Consumes("Application/json")

    public  Bootcamper delete(@PathParam("name") String name, 
    @PathParam("age") double age){

        return bootcamperService.delete(name, age);
        
    }



}

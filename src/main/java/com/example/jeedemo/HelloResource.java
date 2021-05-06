package com.example.jeedemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello-resource")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World! from HelloResource!!";
    }
}
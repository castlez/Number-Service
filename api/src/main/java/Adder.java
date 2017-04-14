package com.castle.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/sum/values")
public class Adder {
	
	@GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello() {
        int sum = 0;
        for(Integer i : Values.getList()){
        	sum += i;
        }
        return Integer.toString(sum) + '\n';
    }
}

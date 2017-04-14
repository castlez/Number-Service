package com.castle.rest;

import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;



@Path("/values")
public class Editor {

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String postval(String val) {
    	try{
	    	Integer t = Integer.parseInt(val.substring(val.lastIndexOf('=')+1));
	    	Values.add(t);
	    	return "ok\n";    		
    	}
    	catch(Exception e){
    		return e.getMessage();
    	}
    }

    @DELETE
    public String delAll(){
    	Values.clear();
    	return "ok\n";
    }
}

/* Values Class
 * authored by Jonathan Castle
 * April 14, 2017
 * 
 * This class is responsible for 
 * handling the addition of new numbers
 * and the deletion of all numbers in the list
*/

package com.castle.rest;

import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;


// Editor Class
@Path("/values")
public class Editor {

    // Accepts a value from the user and places it in the list
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

    // clears the list of numebrs
    @DELETE
    public String delAll(){
    	Values.clear();
    	return "ok\n";
    }
}

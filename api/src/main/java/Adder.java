/* Values Class
 * authored by Jonathan Castle
 * April 14, 2017
 * 
 * This class is responsible for 
 * handling the summation requests
 * of users
*/

package com.castle.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// Adder Class
@Path("/sum/values")
public class Adder {
	
    // Sum values and returns them to user
	@GET
    @Produces(MediaType.TEXT_HTML)
    public String sumVals() {
        int sum = 0;
        for(Integer i : Values.getList()){
        	sum += i;
        }
        return Integer.toString(sum) + '\n';
    }
}

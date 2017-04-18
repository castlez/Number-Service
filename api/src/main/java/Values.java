/* Values Class
 * authored by Jonathan Castle
 * April 14, 2017
 * 
 * This class is responsible for 
 * holding values inputed by the user
 * in a static list of integers
*/

package com.castle.rest;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;

// Values Class
@Entity
public class Values {
	
	// Holds the values   
	@Column(name="values")     
	public static ArrayList<Integer> values = new ArrayList();
	
	// Wrappers to manipulate the list

	public static void add(Integer v){
		values.add(v);
	}

	public static ArrayList<Integer> getList(){
		return values;
	}

	public static void clear(){
		values = new ArrayList();
	}
}

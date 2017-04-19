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
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

// Values Class
public class Values {

	// Parameters
	public static String filename = "values.txt";
	
	// Wrappers to manipulate the list

	public static void add(Integer v){
		try{
			File v_file = new File(filename);			
			FileWriter fw = new FileWriter(v_file, true);
			fw.append(Integer.toString(v) + '\n');
			fw.close();
		}catch(Exception e){
			System.out.println("Could not add to values");
		}
	}

	public static ArrayList<Integer> getList(){
		ArrayList<Integer> values = new ArrayList();
		try{
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String temp = "";
			while((temp=br.readLine())!=null){
				values.add(Integer.parseInt(temp));
			}
			br.close();
			return values;
		}catch(Exception e){
			System.out.println("Values could not be retrieved");
			return values; // empty
		}
	}

	public static void clear(){
		try{
			File v_file = new File(filename);
			v_file.delete();	
		}catch(Exception e){
			System.out.println("Failed to delete values");
		}
	}
}

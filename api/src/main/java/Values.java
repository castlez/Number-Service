package com.castle.rest;

import java.util.ArrayList;

public class Values {
	
	public static ArrayList<Integer> values = new ArrayList();
	
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

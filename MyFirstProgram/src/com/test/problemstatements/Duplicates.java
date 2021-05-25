package com.test.problemstatements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Duplicates {
	
	
	ArrayList<String> list = new ArrayList<String>();
	
	   @SuppressWarnings("unchecked")
	ArrayList<String> getdetails(){
		list.addAll((Collection<? extends String>) new A("Sai",12, "KNR"));
		list.addAll((Collection<? extends String>) new A("Sai",12, "KNR"));
		list.addAll((Collection<? extends String>) new A("Ravi",13, "HYD"));
		System.out.println("Before Removing duplicate elements:"+list);
		HashSet<String> hashset = new HashSet<String>();
		hashset.addAll(list);
		list.clear();
		list.addAll(hashset );
		System.out.println("After Removing duplicate elements:"+list);
		return list;	
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duplicates obj = new Duplicates();
		obj.getdetails();
	}

}

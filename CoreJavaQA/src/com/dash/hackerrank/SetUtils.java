package com.dash.hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SetUtils {
	public static void main(String[] args) {
		
		//List<? extends Number> foo3 = new ArrayList<Number>();  // Number "extends" Number (in this context)
		List<? extends Number> foo3 = new ArrayList<Integer>(); // Integer extends Number
		//List<? extends Number> foo3 = new ArrayList<Double>(); 
		foo3.get(0);
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        Set<String> setString=new HashSet<String>();
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
            /*setString.add(pair_left[i]+pair_right[i]);
            System.out.println(setString.size());*/
            
        }	
        for(int j=0;j<t;j++){
        	setString.add(pair_left[j]+" "+pair_right[j]);
        	System.out.println(setString.size());
        }
        
	}

}

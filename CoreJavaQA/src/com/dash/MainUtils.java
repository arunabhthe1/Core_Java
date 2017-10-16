package com.dash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashSet;

import java.util.TreeSet;

public class MainUtils implements I1,I2{
	
	public static void main(String ar[]){
		Set<Students> setStudents=new TreeSet<Students>();
		I1 obj=new MainUtils();
		obj.print();
		obj.show();
		Students studOne=new Students("arun","1000");
		Students studThree=new Students("raj","1000");
		Students studTwo=new Students("arun","1002");
		setStudents.add(studOne);
		setStudents.add(studTwo);
		setStudents.add(studThree);
		System.out.println(setStudents);	
		Set<Departments> setDept=new TreeSet<Departments>();
		Departments dept1=new Departments("IT",1001l);
		Departments dept2=new Departments("IT",1002l);
		Departments dept3=new Departments("IT",1001l);
		Departments dept4=new Departments("CSC",1001l);
		Departments dept5=new Departments("CSC",1002l);
		setDept.add(dept2);
		setDept.add(dept1);
		System.out.println(setDept);
		Students studFour=new Students("anki","1002",dept1);
		Students studFive=new Students("anki","1002",dept2);
		setStudents.add(studFour);
		setStudents.add(studFive);
		
		 
		
		System.out.println(setStudents);
		
		Map<Departments, String> deptMap=new TreeMap<Departments,String>();
		deptMap.put(dept1, "DEPT1");
		deptMap.put(dept2, "DEPT2");
		deptMap.put(dept3, "DEPT3");
		deptMap.put(dept4, "DEPT4");
		deptMap.put(dept5, "DEPT5");
		System.out.println(deptMap);
		
		Map<Departments, String> deptHashMap=new HashMap<Departments,String>();
		deptHashMap.put(dept1, "DEPT1");
		deptHashMap.put(dept2, "DEPT2");
		deptHashMap.put(dept3, "DEPT3");
		deptHashMap.put(dept4, "DEPT4");
		deptHashMap.put(dept5, "DEPT5");
		System.out.println(deptHashMap);
		
	}
	public void show(){
		I1.super.show();
	}
	@Override
	public void print() {
		System.out.println("THIS IS THE PRINT METHOD");
	}
}

interface I1{
	public void print();
	public default void show(){
		System.out.println(" THis is the default method for I1");
	}

}
interface I2{
	public void print();
	public default void show(){
		System.out.println(" THis is the default method for I2");
	}
	
}
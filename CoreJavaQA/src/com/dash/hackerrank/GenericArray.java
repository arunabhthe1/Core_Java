package com.dash.hackerrank;

public class GenericArray {

	public void printArray(Object[] obj){
		
		for(int i=0;i<obj.length;i++){
			if(obj[i] instanceof Integer){
				System.out.println(obj[i]);
			}
			else if (obj[i] instanceof String){
				System.out.println(obj[i]);
			}
		}
	}
	
	public static void main(String ar[]){
		GenericArray array=new GenericArray();
		array.printArray(new Integer[]{1,2,3});
		array.printArray(new String[]{"Hello","World"});
	}
}

class Printer<T>{
	public void printArray(T[] array){
		
		for(T obj:array){
			System.out.println(obj);
		}
	}
}

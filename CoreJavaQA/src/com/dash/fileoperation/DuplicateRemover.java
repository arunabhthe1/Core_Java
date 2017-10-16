package com.dash.fileoperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateRemover {
	
	public static void main(String ar[]){
		File file=new File("C:\\Users\\adash\\git\\Core_Java\\CoreJavaQA\\F1.txt");
		removeDuplicate(file);
		stringMatching("BANGALORE","BAZ");
		
		stringMatching("ARUNABHDASH","DZAUPQ");
	}
	
	/**
	 * 
	 * @param file
	 */
	public static void removeDuplicate(File file){
		Scanner scanner;
		Map<String,String> map=new HashMap<String,String>();
		try {
			 scanner= new Scanner(file);
			 while(scanner.hasNextLine()){
				 String line=scanner.nextLine();
				 String value[]=line.split(",");
				 if((!map.containsKey(value[0]+value[1]) ) && (!map.containsKey(value[1]+value[0]))){
					map.put(value[0]+","+value[1],null);
				 }
			 }
			 
			 System.out.println(map);
		} catch (FileNotFoundException e) {
			System.out.println(" Error while reading file"+ e);
		}
	}
	
	public static void stringMatching(String str1,String str2){
		char[] str1Char=str1.toCharArray();
		char[] str2Char=str2.toCharArray();
		for(int count=0;count<str1Char.length;count++){
			for(int nestedCount=0;nestedCount<str2Char.length;nestedCount++){
				if(str1Char[count]==str2Char[nestedCount]){
					str1Char[count]=' ';
					str2Char[nestedCount]=' ';
					break;
				}
			}
		}
		System.out.println("THIS IS THE UN MATCHED CHARACTER1"+new String(str1Char).trim());
		System.out.println("THIS IS THE UN MATCHED CHARACTER2"+new String(str2Char).trim());
	}

}

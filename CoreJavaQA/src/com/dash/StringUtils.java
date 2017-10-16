package com.dash;

import java.util.HashMap;
import java.util.Map;

public class StringUtils {

	public static void main(String ar[]) {
		System.out.println("Reverse String : "+reverseString("ARUNABHD"));
		reverseRecursive("DASHARUNABH");
		System.out.println("Uniqueness have to be checked for "+ar[0]);
		System.out.println("Uniqueness check : "+containsUniqueCharacter(ar[0]));
		
	}
	public static Boolean containsUniqueCharacter(String word) {
		char[] stringChar = word.toCharArray();
		if (stringChar.length == 0) {
			return false;
		} else {
			for (int count = 0; count < stringChar.length; count++) {
				
				for (int nesttedcount = count+1; nesttedcount < stringChar.length; nesttedcount++) {
					if (nesttedcount < stringChar.length && stringChar[count] == stringChar[nesttedcount]){
						return false;
					}
				}
			}
			return true;
		}
	}
	public static String reverseString(String originalStr){
		char[] original=originalStr.toCharArray();
		char[] reverse=new char[original.length];
		for(int revCount=0,originalCount=original.length-1;revCount<original.length;revCount++,originalCount--){
			reverse[revCount]=original[originalCount];
		}
		return new String(reverse);
	}
	public static String reverseRecursive(String originalStr){
		char[] original=originalStr.toCharArray();
		char[] reverse=new char[original.length];
		reverse=original;
		int revCount=0,originalCount=original.length-1;
		copy(reverse,originalCount,revCount);
		System.out.println("REVERSE:"+new String(reverse));
		return new String(reverse);
	}
	private static void  copy(char[] reverse,int originalCount,int revCount){
		char temp;
		if(revCount<originalCount){
			return ;
		}
		else{
			temp=reverse[originalCount];
			reverse[originalCount]=reverse[revCount];
			reverse[revCount]=temp;
			copy(reverse, --originalCount, ++revCount);
		}
	}
	
	private static Map<Character ,Integer> duplicateFinder(String stringOb){
		Map<Character ,Integer> duplicateMap=new HashMap<Character ,Integer>();
		char charArray[]=stringOb.toCharArray();
		for(int i=0;i<charArray.length;i++){
			if(duplicateMap.containsValue(charArray[i]))
			{
				duplicateMap.put(charArray[i],duplicateMap.get(charArray[i])+1);
			}
			else{
				duplicateMap.put(charArray[i],1);
			}
		}
		return duplicateMap;
	}
	
	
}

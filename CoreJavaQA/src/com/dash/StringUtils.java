package com.dash;

public class StringUtils {

	public static void main(String ar[]) {
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
}

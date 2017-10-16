package com.dash.hackerrank;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class SherlockString {
	
	static String isValid(String s){
		char[] charStr = s.toCharArray();
		int differencecount = 0;
		Map<Character, Integer> strmap = new TreeMap<Character, Integer>();
		for (Character ch : charStr) {
			if (strmap.containsKey(ch)) {
				strmap.put(ch, strmap.get(ch) + 1);
			} else {
				strmap.put(ch, 1);
			}
		}
		Integer first = strmap.get(strmap.keySet().iterator().next());
		for (Entry<Character, Integer> entry : strmap.entrySet()) {
			if (first != entry.getValue()) {
				if (Math.abs(first - entry.getValue()) > 1 && differencecount==1) {
					return "NO";
				} else if (Math.abs(first - entry.getValue()) == 1) {
					differencecount++;
					if(differencecount>1){
						return "NO";
					}
				}
			}
		}

		return "YES";
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}

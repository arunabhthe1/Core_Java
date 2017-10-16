package com.dash;

public class NumberUtils {
	
	public static void main(String ar[]){
		double dub=-13.456;
		int num1= (int)Math.floor(dub);
		
		int num2= (int)Math.abs(dub);
		System.out.println(num1+"::"+num2);
		System.out.println(reverseNumber(91131123));//843201
	}
	
	public static Integer reverseNumber(Integer num){
		Integer reverserNum=0;
		//reverserNum= (num%10)*10;
		while(num>0){
			reverserNum=reverserNum*10+ (num%10);
			num=num/10;
		}
		return reverserNum;
	}

}

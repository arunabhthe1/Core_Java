package com.dash;

public class ReverseUtil {
	public static Number reverseNumber( Number num){
		Number reverseNum=0;
		while((Integer)num>=1){
			if(num instanceof Integer){
				reverseNum=((Integer)num%10)+(Integer)reverseNum*10;
				num=((Integer)num/10);
			}
			else if(num instanceof Double){
				
			}
		}
		return reverseNum;
	}

	public static void main(String ar[]){
		System.out.println(reverseNumber(324567));
	}
}

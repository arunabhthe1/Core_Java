package com.dash.hackerrank;

import java.util.Scanner;

public class Staircase {

	public static void main(String ar[]){
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		for(int spaceCount=n-1,starCount=1;starCount<=n;spaceCount--,starCount++){
			for(int i=1;i<=spaceCount;i++){
				System.out.print(" ");
			}
			for(int i=1;i<=starCount;i++){
				System.out.print("#");
			}
			System.out.println("");
		}
	}
}

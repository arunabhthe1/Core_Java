package com.dash.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinMaxOfArray {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] arr = new Integer[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        minmax(arr);
    }
	public static void minmax(Integer[] array){
		List<Integer> list = Arrays.asList(array);	
		Collections.sort(list);
		long min,max=0,sum=0;
		for(Integer num:list){
			sum=sum+num;
		}
		max=sum-list.get(0);
		min=sum-list.get(list.size()-1);
		System.out.println(min + " " +max);
	}
}

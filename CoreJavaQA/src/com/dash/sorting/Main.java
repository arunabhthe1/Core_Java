package com.dash.sorting;

public class Main {
	
	public static void main(String ar[]){
		int array[]=QuickSortUtil.quickSort(new int[] {3,1,2,5,6,2,7}, 0, 6);
		for(int num:array){
			System.out.print(num);
		}
	}

}

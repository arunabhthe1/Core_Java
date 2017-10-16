package com.dash.sorting;

public class SortingUtils {
	
	public static void main(String ar[]){
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		input=bubbleSort(input);
		for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
	}
	
	public static int[] bubbleSort(int ar[]){
		int[] sortedArr=new int[ar.length];
		int temp=0;
		for(int count=0;count<sortedArr.length;count++){
			for(int innerCount=count;innerCount<sortedArr.length;innerCount++){
				if(sortedArr[count]<sortedArr[innerCount]){
					temp=sortedArr[innerCount];
					sortedArr[innerCount]=sortedArr[count];
					sortedArr[count]=temp;
				}
			}
		}
		return sortedArr;
	}

}

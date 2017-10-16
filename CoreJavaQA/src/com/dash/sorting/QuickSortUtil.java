package com.dash.sorting;

public class QuickSortUtil {
	/**
	 * Quick sort for sorting he elements in descending order 
	 * @param array
	 * @param start
	 * @param end
	 * @return
	 */
	public static int[] quickSort(int[] array,int start,int end){
		if(end>start){
			int pIndex=partitionAscending(array, start, end);
			quickSort(array, start, pIndex-1);
			quickSort(array,pIndex+1, end);
		}
		return array;
		
	}
	private static int partitionDescending(int[] array,int start,int end){
		int pIndex=start;
		int pivot=array[end];
		for(int count=start;count<=end-1;count++){
			if(array[count]>pivot){
				swap(array,count,pIndex);
				pIndex++;
			}
		}
		swap(array,pIndex , end);
		return pIndex;
	}
	private static int partitionAscending(int[] array,int start,int end){
		int pIndex=start;
		int pivot=array[end];
		for(int count=start;count<=end-1;count++){
			if(array[count]<pivot){
				swap(array,count,pIndex);
				pIndex++;
			}
		}
		swap(array,pIndex , end);
		return pIndex;
	}
	private static void swap(int[] array,int left,int right){
		int temp=0;
		temp=array[right];
		array[right]=array[left];
		array[left]=temp;
	}
}

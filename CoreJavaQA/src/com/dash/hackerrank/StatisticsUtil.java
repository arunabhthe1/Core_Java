package com.dash.hackerrank;

import java.io.BufferedInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StatisticsUtil {

	public static double getMean(int[] array){
		double mean=0d,sum=0;
		for(int counter=0;counter<array.length;counter++){
			sum=sum+array[counter];
		}
		mean=sum/array.length;
		return mean;
	}
	
	public static double getMedian(int[] array){
		double median=0;
		if(array.length>1){
			array=quickSort(array, 0, array.length-1);
			if(array.length%2==0){
				median=Double.valueOf((array[(array.length/2)]+array[(array.length/2)-1]))/2;
			}
			else{
				median=array[(int) Math.ceil(Double.valueOf(array.length)/2)]/2;
			}
		}else if(array.length==1){
			median=array[0]/2;
		}
		return median;
	}
	public static Integer getMode(int[] array){
		Map<Integer,Integer> mode=new TreeMap<Integer,Integer>();
		Map<Integer,Integer> finalmode=new TreeMap<Integer,Integer>();
		boolean modePresent=false;
		Integer modeNumber;
		for(int num:array){
			if(mode.containsKey(num)){
				modePresent=true;
				mode.put(num,mode.get(num)+1);
			}
			else{
				mode.put(num,1);
			}
		}
		if(modePresent){
			
			modeNumber=Collections.max(mode.values());
			Set<Integer> set=mode.keySet();
			for(Map.Entry<Integer, Integer> entry:mode.entrySet()){
				if(entry.getValue().equals(modeNumber)){
					finalmode.put(entry.getKey(), entry.getValue());
				}
			}
			return finalmode.keySet().iterator().next();
		}
		else{
			return mode.keySet().iterator().next();
		}
	}
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

	
	public static void main(String ar[]){

		Scanner stdin = new Scanner(new BufferedInputStream(System.in));
		int arraySize=stdin.nextInt();
		int array[]=new int[arraySize];
		for(int count=0;count<arraySize;count++){
			
			array[count]=stdin.nextInt();
			System.out.println(array[count]);
		}
		System.out.println(getMean(array));
		System.out.println(getMedian(array));
		System.out.println(getMode(array));
	}
}

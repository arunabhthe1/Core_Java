package com.dash;

public class PalindromChecker {

	    public static boolean isPalindrome(String word) {
	        char wordsChar[]=word.toLowerCase().toCharArray();
	        boolean isPalindrom=false;
	        if(wordsChar.length>0){
	        	for(int count=0;count<wordsChar.length/2;count++){
	        		if(wordsChar[count]==wordsChar[(wordsChar.length-1)-count]){
	        			isPalindrom=true;
	        		}
	        		else{
	        			isPalindrom=false;
	        		}
	        	}
	        }
	        return isPalindrom;
	    }
	    
	    public static void main(String[] args) {
	       
	        int[] indices = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
	        System.out.println(indices[0] + " " + indices[1]);
	    }
	    
	    public static int[] findTwoSum(int[] list, int sum) {
	    	int[] twoSum=new int[2];
	    	for(int count=0;count<(list.length-1);count++){
	    		for(int nestedCount=count;nestedCount<list.length;nestedCount++){
	    			if(sum-list[count]==list[nestedCount]){
	    				twoSum[0]=list[count];
	    				twoSum[1]=list[nestedCount];
	    				return twoSum;
	    			}
	    		}
	    	}
	    	return twoSum;
	    }
}

package com.interview.prep.sorting;


public class Quicksort1 {
	
	//targets :
	
	/*
	 * 1. swap the current element and the index element
	 * 2. move the point to the next element and, if the swapping occurs  move the index to the next location
	 */
	
	public void quicksort(int left , int right){
		
		
		if(left >= right)
			
            return;

	}
	
	
	public void sort(int []arr){
		
		int left =0;
		int right = arr.length-1;
		quicksort(left,right);
		
	}
	
	
	int[] createArray(){
		
		int [] arr = new int[6];
		arr[0] = 22;
		arr[1] = 2;
		arr[2] = 5;
		arr[3] = 1;
		arr[4] = 9;
		arr[5] = 8;
		return arr;
	}
	
	
	public static void main(String args[]){
		
		
		Quicksort1 sort = new Quicksort1();
		int a [] = sort.createArray();
		sort.sort(a);
	}

}

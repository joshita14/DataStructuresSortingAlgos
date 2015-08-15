package com.interview.prep.sorting;

public class MergeSort {
	
	/*
	 * Logic is :
	 * Divde the array into two halves
	 * After dividing sort each array
	 * after sorted array , start replacing the main array with elements
	 * by comparing the elements of the two arrays..
	 */
	int [] leftarray  = null;
	int [] rightarray = null;
	int [] mainarray  = null;
	
	public void splitMainArray(int[] mainarray){
		
		int middlePositionToSplitMainArray ;
		//Split the main array into two halves :
		int noOfElementsInMainArray = mainarray.length;
		middlePositionToSplitMainArray = (0+noOfElementsInMainArray)/2;
		
		leftarray  = new int[middlePositionToSplitMainArray];
		rightarray = new int[middlePositionToSplitMainArray];
		int noOfElementsInLeftArray = middlePositionToSplitMainArray;
		int noOfElementsInRightArray = noOfElementsInMainArray - noOfElementsInLeftArray; 
		
		
		// copy the first part of 'array' into 'arr1', causing arr1 to become full
				for(int i = 0; i < noOfElementsInLeftArray; i++)
					leftarray[i] = mainarray[i];
		
			for(int i=0;i<leftarray.length;i++){
				System.out.println(leftarray[i]);
			}	
				
				// copy the remaining elements of 'array' into 'arr2', causing arr2 to become full
				for(int i = noOfElementsInRightArray; i < noOfElementsInRightArray + noOfElementsInLeftArray; i++)
					rightarray[i - noOfElementsInRightArray] = mainarray[i];
				
				for(int i=0;i<leftarray.length;i++){
					System.out.println(rightarray[i]);
				}
			
				
				//calling the merge sort here
				mergeSort();
	}

	
	public void mergeSort(){
	
		int indexOfLeftArary =0;    //These are used for moving in the index of the arrays.
		int indexOfMainArray =0;
		int indexOfRightArray =0;
		
		//Logic is :
		
		while(leftarray[indexOfLeftArary] < rightarray[indexOfRightArray]){
			
			//shift the elements of ledt array to the main array
			mainarray[indexOfMainArray] = leftarray[indexOfLeftArary];
			//increment the index of left array
			indexOfLeftArary++;
			//incerement the index of main array
			indexOfMainArray++;
		}
		
		while(rightarray[indexOfRightArray] < leftarray[indexOfLeftArary] ){
			
			//shift the elements of left array to the main array
			mainarray[indexOfMainArray] = leftarray[indexOfRightArray];
			//increment the index of left array
			indexOfRightArray++;
			//increment the index of main array
			indexOfMainArray++;
			
		}
		
		
		
	}
	
	
	
	int[] createMainArray(){
		//for now i have considered this as sorted
	    mainarray = new int[8];
		
	    mainarray[0] = 1;
		mainarray[1] = 2;
		mainarray[2] = 4;
		mainarray[3] = 6;
		mainarray[4] = 3;
		mainarray[5] = 5;
		mainarray[6] = 7;
		mainarray[7] = 8;
		
		return mainarray;
	}
	
	
	public static void main(String args[]){
		
		MergeSort merge = new MergeSort();
		int [] mainarray= merge.createMainArray();
		merge.splitMainArray(mainarray);
	}
	
}

package com.interview.prep.sorting;

public class SelectionSort {
	
	static int [] array ;
	//idea is to traverse and find the minimum element, as the minium elemet is found then we replace the things
	void selectionSort(){
		
		/**
		 * PSEUDO CODE:
		 * take an index,lets say 0
		 * pick element at 0
		 * traverse that in the whole list, if that element is greater than anyone of the element , jump to the next index
		 * Now index =1, pick the element and traverse the array of elements
		 * If the element is the smallest shift the element to the next location in the list
		 */
		
		int lengthOfarray = array.length;
		int minimum ;
		int temp;
		for(int i =0;i < lengthOfarray-1 ;i++){
			minimum = i; //denotes index
			
			System.out.println("Shifting here");
			for(int j =i+1;j<array.length;j++){
				
				System.out.println("At : "+array[j]+"  and next is "+array[minimum]);
				if(array[j] < array[minimum]){
					
					System.out.println("This is "+array[j] +" this is  "+array[minimum]);
					minimum = j;
				}
			}
			
			if(i != minimum){
				temp = array[i];
				array[i] = array[minimum];
				array[minimum] = temp;
			}
			
		}
		
		//Now print the list
		System.out.println("This is sorted array");
		for(int sortedarray : array){
			System.out.print(sortedarray+"  ");
		}
	}
	
	//write a replace function
	void printArray(int [] array){
		
		//Print array :
		for(int arr : array){
			System.out.println(arr);
		}
	}
	
	
	public static void main(String args[]){
		
		array = new int [11];
		SelectionSort selectionsort = new SelectionSort();
		array[0] = 7;
		array[1] = 1;
		array[2] = 2;
		array[3] = 5;
		array[4] = 8;
		array[5] = 15;
		array[6] = 100;
		array[7] = 45;
		array[8] = 32;
		array[9] = 4;
		array[10] = 0;
		selectionsort.printArray(array);
		selectionsort.selectionSort();
	}
}


/**
 * Logic used
 * 1. Create a main loop, that will just change the index of the minimum element, i:e shift the minimum element to next--next
 * 2. Now increment the next loop inside, from the next index the one we on
 * 3. Now compare if the next element is less than the minimum element, then the current index has the minium element
 * 4. Also after the inner for loop we should have check that if , the main for loop index does not matches the minimum element index, then we have to swap the index with the current indec.
 */

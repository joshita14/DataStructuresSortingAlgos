package com.interview.prep.sorting;

public class BinarySearch {
	
	/**
	 * Get the array :sorted
	 * select a begin and a end value
	 * select a middle element
	 * eliminate the left or right part accordingly
	 */
	
	void sort(){
		
		int elementAtbeginning = 0;
		int elementATTheEnd ;
		int elementInMiddle;
		int numberToSearch = 117;
		int [] arr = getArray();
		int count = 0;
		
		elementATTheEnd = arr.length - 1;
		elementInMiddle = (elementAtbeginning + elementATTheEnd)/2;
		
		while(arr[elementAtbeginning] <= arr[elementATTheEnd]){
			
			count ++;
			System.out.println("This is count value : \n"+count);
			System.out.println("Now middle element  : \n"+arr[elementInMiddle]);
			System.out.println("Now at beginnning  : \n"+arr[elementAtbeginning]);
			System.out.println("Now element at last  : \n"+arr[elementATTheEnd]);
			
			if(arr[elementInMiddle] == numberToSearch){
				
				System.out.println("This is the middle element"+ arr[elementInMiddle] +"   and this is the number to be searched   "+numberToSearch);
				break;
			}else if (arr[elementInMiddle] < numberToSearch){
				//suppose middle element is 2, 2<3, then we have to add middle+1 to move that middle element to 3
			   elementAtbeginning = elementInMiddle+1;
			   //System.out.println(arr[elementInMiddle]);
				
			}else{
				//suppose middle element is 4, the 4>3 , we have to subtract one index to reach that to the nearest level
				elementATTheEnd = elementInMiddle-1;
				//System.out.println(arr[elementInMiddle]);
			}
			
			//System.out.println(arr[elementAtbeginning] +"      "+arr[elementATTheEnd]+ "     "+arr[elementInMiddle]);
			
			elementInMiddle = (elementAtbeginning + elementATTheEnd)/2;
		}
		
		if(arr[elementAtbeginning] > arr[elementATTheEnd]){
			//means that the list is not sorted
			System.out.println("\n List is not sorted cannot move ahead ");
		}
	}
	
	/*
	 * Get array
	 */
	int[] getArray(){
    int arr[] = null;
      try{
		arr = new int[16];
		arr[0]=4;
		arr[1]=5;
		arr[2]=56;
		arr[3]=77;
		arr[4]=77;
		arr[5]=87;
		arr[6]=97;
		arr[7]=107;
		arr[8]=117;
		arr[9]=127;
		arr[10]=137;
		arr[11]=147;
		arr[12]=157;
		arr[13]=167;
		arr[14]=177;
		arr[15]=187;
		 
      }catch(ArrayIndexOutOfBoundsException exception){
    	  
    	  System.out.println("There is error in array");
      }
		
		return arr;
	}
	
	
	public static void main(String args[]){
		
		BinarySearch search = new BinarySearch();
		search.sort();
	}
}


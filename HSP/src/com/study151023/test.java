package com.study151023;

public class test {

}

class Select{
	
	//select sort
	public void sort(int arr[]){
		
		int temp = 0;
		for(int j=0;j<arr.length-1;j++){
			
			int min = arr[0];
			int minIndex = 0;
			
			for(int k=j+1;k<arr.length;k++){
				
				if(min > arr[k]){
					
					min = arr[k];
					minIndex = k;
				}
			}
			
			temp = arr[j];
			arr[j]=arr[minIndex];
			arr[minIndex]=temp;
			
			
		}
		
		
	}
}

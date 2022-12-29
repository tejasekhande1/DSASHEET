/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void revArray(int arr[],int start,int end){
		if(start >= end)
			return;

		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;

		revArray(arr,start+1,end-1);
	}
	public static void main (String[] args) {
		int arr[] = {1,2,3,4,5};
		int start = 0;
		int end = arr.length-1;
		revArray(arr,start,end);

		for(int i=0 ; i<arr.length ; i++){
			System.out.print("|"+arr[i]+"|");
		}
		System.out.println();
	}
}

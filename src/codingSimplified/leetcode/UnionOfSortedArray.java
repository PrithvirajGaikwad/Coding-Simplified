package codingSimplified.leetcode;

import java.util.ArrayList;
import java.util.List;

public class UnionOfSortedArray {

	  public static void main(String[] args) {

		  UnionOfSortedArray a = new UnionOfSortedArray();
		    int arr1[] = {2, 2, 3, 4, 4, 4, 7, 8};
		    int arr2[] = {1, 2, 2, 2, 4, 6, 6, 6, 7, 8, 10};
		    List<Integer> finalUnion = new ArrayList<>();
		    
		    a.unionOfTwoSortedArray(arr1, arr2, finalUnion);
		    System.out.println(finalUnion);

		  }

	private void unionOfTwoSortedArray(int[] arr1, int[] arr2, List<Integer> finalUnion) {
	int i =0;
	int j =0;
		while(i<arr1.length && j<arr2.length) {
			while(i<arr1.length-1 && arr1[i]==arr1[i+1]) {
				i++;
			}
			while(j<arr2.length-1 && arr2[j]==arr2[j+1]) {
				j++;
			}
			if(arr1[i]<arr2[j]) {
				finalUnion.add(arr1[i]);
				i++;
			}
			else if (arr1[i]>arr2[j]) {
				finalUnion.add(arr2[j]);
				j++;
			}
			else {
				finalUnion.add(arr1[i]);
				i++;
				j++;
			}
		}
		
		while(i<arr1.length) {
			if(i<arr1.length-1 && arr1[i]==arr1[i+1]) {
				i++;
			}
			else {
				finalUnion.add(arr1[i]);
				i++;
			}
		}
		
		while(j<arr2.length) {
			if(j<arr2.length-1 && arr2[j]==arr2[j+1]) {
				j++;
			}
			else {
				finalUnion.add(arr2[j]);
				j++;
			}
		}
		
		
	}
	
}

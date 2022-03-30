package codingSimplified.leetcode;

import java.util.*;

public class IntersectionOfUnsortedArray {
	  public static void main(String[] args) {

		  IntersectionOfUnsortedArray a = new IntersectionOfUnsortedArray();
		    int arr1[] = {4, 2, 3, 5, 4, 2, 3};
		    int arr2[] = {9, 1, 7, 2, 4, 2, 1, 2};
		    Set<Integer> finalIntersection = new HashSet<>();
		    
		    a.intersectionOfTwoUnSortedArray(arr1, arr2, finalIntersection);
		    System.out.println(finalIntersection);
		  }

	private void intersectionOfTwoUnSortedArray(int[] arr1, int[] arr2, Set<Integer> finalIntersection) {
		// TODO Auto-generated method stub
		Set<Integer> temp = new HashSet<>();
		for(int i =0; i<arr1.length; i++) {
			temp.add(arr1[i]);
		}
		
		for(int j =0; j<arr2.length; j++) {
			if(temp.contains(arr2[j])) {
				finalIntersection.add(arr2[j]);
			}
		}
	}
}

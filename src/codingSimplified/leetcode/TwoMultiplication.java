package codingSimplified.leetcode;

import java.util.HashSet;

public class TwoMultiplication {

	  public static void main(String[] args) {

		  TwoMultiplication a = new TwoMultiplication();
		    int arr[] = { 4, 2, 3, 10, 4, 15, 3, 6, 5 };

		    System.out.println(a.checkIfProductOfPairMatchesValue(arr, 15));
		  }

	private boolean checkIfProductOfPairMatchesValue(int[] arr, int target) {
		HashSet<Integer> set = new HashSet<>();
		int div = 0;
		for(int i =0; i<arr.length;i++) {
			
			if(target%arr[i]==0 &&(set.contains(target/arr[i]))) {
				return true;
			}
			else {
				set.add(arr[i]);
			}
		}
		return false;
	}
	
}

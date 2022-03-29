package codingSimplified.leetcode;
import java.util.*;

public class LeadersInArray {
// here we have to find the element whos right side is less or equal to it
	/*
	 * Idea is to traverse from back and keep on finding the max element we encounter
	 */
	public ArrayList<Integer> leaders(int arr[], int n){
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = n-1; i>=0; i--){
            if(arr[i]>=max){
                max=arr[i];
                arrayList.add(max);
            }
            
        }
        Collections.sort(arrayList,Collections.reverseOrder());
        return arrayList;
    }
}

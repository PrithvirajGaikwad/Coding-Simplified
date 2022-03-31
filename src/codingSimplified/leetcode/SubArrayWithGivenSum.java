package codingSimplified.leetcode;

import java.util.*;

public class SubArrayWithGivenSum {
	//Function to find a continuous sub-array which adds up to a given number.
    public ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listEmpty = new ArrayList<>();
        int start  =0 ;
        int sum = 0;
        int end =0;
        while(start<=end && end<arr.length){
            sum = sum + arr[end];
            if(sum ==s){
                list.add(start+1);
                list.add(end+1);
                return list;
            }
            while(sum>s){
                    sum = sum - arr[start++];
                    
                    if(sum==s){
                       list.add(start+1);
                       list.add(end+1); 
                       return list;
                    }
                
            }
            end++;
        }
        listEmpty.add(-1);
        return listEmpty;
    }
}

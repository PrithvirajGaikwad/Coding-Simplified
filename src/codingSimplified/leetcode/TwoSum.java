package codingSimplified.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
// brute Force approach
	 public int[] twoSum(int[] nums, int target) {
	        int sum =0 ;
	        int[] intArr = new int[2];
	        for(int i =0; i<nums.length-1; i++){
	           for(int j = i+1; j< nums. length; j++){
	               sum = nums[i]+nums[j];
	               if(sum==target){
	                  int arrInt[] = {i,j};
	                   return arrInt;
	               }
	           } 
	        }
	        return intArr;
	    }
	 
	 //below approach is when only true or false is req.
	 /*
	  * Here we are sorting array
	  * then checking the sum of first and last
	  * if sum is less than req. then increasing the start or else decrease the end;
	  * */
	 public boolean twoSum1(int[] nums, int target) {
		    Arrays.sort(nums);
		        int start =0;
		        int end = nums.length-1;
		        int sum =0;
		        while(start<=end){
		            sum = nums[start]+nums[end];
		            if(sum==target){
		                return true;
		            }
		            if(sum>target){
		                end--;
		            }
		            else{
		                start++;
		            }
		        }
		        return false;
		    }
	 
	 
	 //below apporch is most optimum with O(n)
	 /*
	  * here we are first adding elemnrt in map 
	  * and then calculating th diff of value we looking for 
	  * and checking the same if its present int map or not
	  * */
	    public int[] twoSum2(int[] nums, int target) {
	        HashMap<Integer,Integer> map = new HashMap<>();
	            int diff =0;
	            int[] arr = new int[2];
	            for(int i =0; i< nums.length; i++){
	                map.put(nums[i],map.getOrDefault(nums[i],i));
	                diff = target - nums[i];
	                if(map.containsKey(diff) && map.get(diff)<i){
	                    int intArr[] = {map.get(diff),i};
	                    return intArr;
	                }
	            }
	            return arr;
	        }
}

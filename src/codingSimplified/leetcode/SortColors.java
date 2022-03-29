package codingSimplified.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SortColors {
	//below solution is brute force 
    public void sortColors(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int pos = 0;
        if(map.containsKey(0)){
        while(map.get(0)>0){
            nums[pos]=0;
            pos++;
            map.put(0,map.get(0)-1);
        }
        }
            if(map.containsKey(1)){
        while(map.get(1)>0){
            nums[pos]=1;
            pos++;
            map.put(1,map.get(1)-1);
        }
        }
        if(map.containsKey(2)){
        while(map.get(2)>0){
            nums[pos]=2;
            pos++;
            map.put(2,map.get(2)-1);
        }
        }
        
    }
    
    // below solution is O(n)
    public void sortColorsOptimum(int[] nums) {
        int low =0;
        int mid =0;
        int high = nums.length-1;
         while(mid<=high){
             if(nums[mid]==0){
                 if(nums[low]!=nums[mid]){
                     int p = nums[low];
                     nums[low] = nums[mid];
                     nums[mid]=p;
                 }
                 low++;
                 mid++;
             }
             else if(nums[mid]==1){
                 mid++;
             }
             else if(nums[mid]==2){
                 if(nums[mid]!=nums[high]){
                    int q = nums[high];
                     nums[high] = nums[mid];
                     nums[mid]=q; 
                 }
                 high--;
             }
         }
     }
}

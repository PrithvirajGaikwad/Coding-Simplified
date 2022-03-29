package codingSimplified.leetcode;

public class EquilibriumPoint {
	/*the idea is to get the total sum first the iterate through array 
	 * finding sum so far and decreaing from total sum
	point where u find total sum and sum so far equal is the point where equilibrium is 
	*/
	
	public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int sumSoFar = 0;
        for(int i =0 ; i<nums.length; i++){
            totalSum+=nums[i];
        }
    
        for(int j=0; j<nums.length; j++){
            totalSum = totalSum-nums[j];
            if(sumSoFar==totalSum){
                return j;
            }
            sumSoFar += nums[j]; 
        }
        return -1;
    }
}

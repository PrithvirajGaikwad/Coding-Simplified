package codingSimplified.leetcode;

import java.util.ArrayList;

public class MaxSumArrayOfSizeK {
	public int maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        int start = 0;
        int maxSum =0;
        int i;
        for ( i =0; i< K ; i++){
            maxSum +=Arr.get(i);
        }
        int sum =maxSum;
        for(int j =i; j<N ; j++){
            maxSum = maxSum + Arr.get(j) - Arr.get(start++);
            if(maxSum>sum){
                sum =maxSum;
            }
        }
        return sum;
    }
}

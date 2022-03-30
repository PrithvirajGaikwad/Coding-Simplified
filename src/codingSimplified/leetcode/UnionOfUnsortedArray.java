package codingSimplified.leetcode;

import java.util.*;

public class UnionOfUnsortedArray {
	//https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1
    public static int doUnion(int a[], int n, int b[], int m) 
    {
       Set<Integer> set = new HashSet<>();
       for(int i =0; i< a.length; i++){
           set.add(a[i]);
       }
       for(int j = 0; j < b.length; j++){
           set.add(b[j]);
       }
       return set.size();
    }

}

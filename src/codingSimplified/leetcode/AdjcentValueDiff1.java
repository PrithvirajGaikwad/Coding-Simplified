package codingSimplified.leetcode;

public class AdjcentValueDiff1 {
	// in this one we are directly juming to the next possible position
	public static void main(String[] args) {

		AdjcentValueDiff1 a = new AdjcentValueDiff1();
	    int arr1[] = {7, 6, 7, 6, 7, 6, 5, 4, 5, 4, 3, 2, 1, 2, 3};
	    int arr2[] = {2, 3, 2, 4, 5, 6, 7};
	  
	    System.out.println(a.findFirstOccurrenceIfAdjecentValueDifferBy1(arr1, 2));
	    System.out.println(a.findFirstOccurrenceIfAdjecentValueDifferBy1(arr2, 7));

	  }

	private int findFirstOccurrenceIfAdjecentValueDifferBy1(int[] arr1, int target) {
		// TODO Auto-generated method stub
		int start =0;
		int diff =0;
		while(start<=arr1.length){
		if(arr1[start]==target) {
			return start;
		}
		diff =Math.abs(arr1[start]-target);
		start = start + diff;
		}
		return -1;
	}
	
	

}

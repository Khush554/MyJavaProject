package com.arrayassignment;

public class FindMissingnumber {
   public static void check(int a[]) {
	int finddiff=0;
	int missing=0;
	for(int i=0;i<a.length-1;i++) {
		finddiff=a[i]-a[i+1];
		if(finddiff>0) {
			//System.out.println("dd");
			continue;
		}
		else {
			missing=a[i]+finddiff;
			
		}
	}
	System.out.println(missing);
	   
   }
   public static int getMissingNo(int[] nums, int n)
   {
       int sum = ((n + 1) * (n + 2)) / 2;
       for (int i = 0; i < n; i++)
           sum = sum-nums[i];
       return sum;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,5,6,1,4,2};
		//FindMissingnumber.check(a);
		int[] arr = { 7,5,6,1,4,2 };
        int N = arr.length;
        
        System.out.println(getMissingNo(arr, N));
		

	}

}

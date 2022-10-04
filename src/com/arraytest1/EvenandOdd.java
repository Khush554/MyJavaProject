package com.arraytest1;

public class EvenandOdd {
	public static void evenodd(int ar[]) {
		int counteven=1;
		int countodd=1;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				counteven++;
			}
			else {
				countodd++;
			}
		}
		System.out.println("even count="+counteven+" "+"odd count="+countodd);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7};
		EvenandOdd.evenodd(a);

	}

}

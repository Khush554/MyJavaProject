package com.TwoDArray;

public class TwoDArraycreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{1,2,3},{2,3,4},{4,5,7}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("..............");
		for(int x[]:a) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}

	}

}

package com.array26;

import java.util.Scanner;

public class CheckEveryNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		while (num > 0) {
			int rem = num % 10;
			num = num / 10;
			boolean isprime = false;
			for (int i = 2; i < rem; i++) {
				if (rem % i == 0) {
					isprime = true;
					break;
				}

			}
			if (isprime == false) {
				System.out.println("Prime " + rem);
			}

			else {
				System.out.println("Not prime" + rem);
			}
		}

	}

}

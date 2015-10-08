package com.CLC.test.ques11;

import java.util.Scanner;

public class FirstTwentyPrimeNo {
	static int num;
	static Scanner s = new Scanner(System.in);
	int j, i, count = 0;

	// int a[]=new int[30];
	void first() {

		for (j =2;;j++) {
			//j++;                       //even no won't be prime
			int flag = 0;
			if (count < num) {
				}
				if (flag == 0) {
					System.out.println(j);

					// if(count<=20){
					count++;
				}
				/*else{
					System.out.println(j);
				}*/
			
			}
		
		}
	

	public static void main(String[] args) {
		System.out.println("How many prime no u wanna print");
		num = s.nextInt();
		FirstTwentyPrimeNo ftp = new FirstTwentyPrimeNo();
		ftp.first();
	}
}

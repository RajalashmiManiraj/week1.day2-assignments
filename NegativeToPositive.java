package week1.day2;

import java.util.Scanner;

public class NegativeToPositive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int num=sc.nextInt();
		if(num<0) {
			num=num*-1;
			System.out.println(num);
		}
		else {
			System.out.println("This is positive number");
		}
	}

}

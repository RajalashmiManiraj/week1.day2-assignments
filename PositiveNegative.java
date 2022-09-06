package week1.day2;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println("This is a positive number");
		}
		else if(num<0) {
			System.out.println("This is a negative number");
		}
		else {
			System.out.println("The number is neither negative nor positive");
		}
		
		
	}

}

package week1.day2;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int Temp,Remainder,Reverse=0;
		System.out.println("Enter your number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(num);
		Temp=num;
		while(Temp>0) {
			Remainder=Temp%10;
			Reverse=Reverse*10+Remainder;
			Temp=Temp/10;
			}
		System.out.println("Reverse of entered number:");
		System.out.println(Reverse);
		if(num==Reverse) {
			System.out.println("This is a palindrome number");
		}
		else {
			System.out.println("This is not a palindrome number");
		}
}
}

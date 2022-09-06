package week1.day2;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter your number:");
    int num=sc.nextInt();
    System.out.println(num);
    if(num>=0 && num%2==0) {
    System.out.println("This is a EVEN NUMBER");
    }
    else  {
    	System.out.println("This is a PRIME NUMBER");
    }
}
}

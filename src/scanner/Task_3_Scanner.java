package scanner;

import java.util.Scanner;

public class Task_3_Scanner {
	public static void main(String[] args) {
		int num;
		Scanner a=new Scanner(System.in);
		System.out.println("enter the value: ");
		num=a.nextInt();
		
		if(num%2==0) {
			System.out.println("the given number is even");
		}
		else {
			System.out.println("the given number is odd");
		}
	}

}

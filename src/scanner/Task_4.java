package scanner;

import java.util.Scanner;

public class Task_4 {
	public static void main(String[] args) {
		int mark;
		Scanner ref=new Scanner(System.in);
		System.out.println("enter the mark");
		mark=ref.nextInt();
		
		if(mark>90) {
			System.out.println("mark should be grade a");
		}
		else if(mark>80) {
			System.out.println("mark should be grade b");
		}
			else if(mark>70) {
				System.out.println("mark should be grade c ");
	}
			else if(mark>60) {
				System.out.println("mark should be grade d");
				
			}
			else if(mark>50) {
				System.out.println("mark should be grade e");
			
			}
			else if (mark<50) {
				System.out.println("this mark is fail");
			}
	}
}

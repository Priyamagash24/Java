package scanner;
import java.util.Scanner;

public class Task_5 {
	public static void main(String[] args) {
		int num;
		Scanner a=new Scanner(System.in);
		System.out.println("enter the name");
		num=a.nextInt();
		
		if(num==1) {
			System.out.println(" hello");
		}
		else if(num==2) {
			System.out.println("namasthe");
		}
		else if(num==3) {
			 System.out.println("bonjour");
		 }
		else if(num==4) {
			System.out.println("vanakkam");
		}
		else if(num==5) {
		System.out.println("welcome");
		}
		else {
			System.out.println("invalid button");
		}
		 
	}

}

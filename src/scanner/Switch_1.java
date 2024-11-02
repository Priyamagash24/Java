package scanner;
import java.util.Scanner;

public class Switch_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the channel no: ");
		int i=sc.nextInt();
		switch(i)
		{
		case 1:
			System.out.println("sports");
			break;
		case 2:
			System.out.println("movies");
			break;
		case 3:
			System.out.println("web series");
			break;
		case 4:
			System.out.println("serial");
			break;
		default :
			System.out.println("invalid entry");
		}
		
		
	}

}

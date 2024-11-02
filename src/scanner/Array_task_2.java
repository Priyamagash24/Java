package scanner;

import java.util.Scanner;

public class Array_task_2 {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter array size");
	//datatype arrayname[]=new datatype[size];
		int size=a.nextInt();
		int arr[]=new int[size];
		System.out.println("enter data in array");
		for(int i=0;i<size;i++) {
			arr[i]=a.nextInt();
		}
			System.out.println("output array");
			for(int i=0;i<size;i++) {
				System.out.println(arr[i]);
			}
	
		
	}

}

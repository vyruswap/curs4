package curs4;

import java.util.Scanner;

public class ForEx1 {
	public static void main(String[] args) {
		
	int num;
	int sum =0;
	for(int i=0; i < 10; i++) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Please enter number " + i + ":" );
		num = scan.nextInt();
		sum += num;
	}	
		
	System.out.println("The sum of the number is: " + sum );
		
	}
}

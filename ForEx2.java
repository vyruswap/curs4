package curs4;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");

		int num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}
}

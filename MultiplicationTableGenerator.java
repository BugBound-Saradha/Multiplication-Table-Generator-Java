package day5Package;

import java.util.Scanner;

public class MultiplicationTableGenerator {

	public static void main(String[] args) {
		// Get input number from user
		System.out.println("Please enter a number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		System.out.println("Multiplication table for " + num);
		// Generate multiplication table using for loop
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}

	}

}

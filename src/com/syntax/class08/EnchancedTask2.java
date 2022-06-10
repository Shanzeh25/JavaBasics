package com.syntax.class08;

import java.util.Scanner;

public class EnchancedTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int secretNum = 1;
		int guessedNum;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Guess my secret number");
			guessedNum = scan.nextInt();
		} while (guessedNum != secretNum);
		
		System.out.println("You got it");
		scan.close();
	}

}

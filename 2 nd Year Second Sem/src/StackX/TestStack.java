package StackX;

import java.util.Scanner;

public class TestStack {

	public static void main(String[] args) {
		
		
		String input;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter String Containig Delemeters enter empty value for break");
		System.out.flush();
		//Read String from key board
		input = scan.nextLine();
		
		//Make a BracketChecker object
		BracketChecker thechecker =new BracketChecker(input);
		thechecker.check();
	}

}

package introduction;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = 24, y = 12;
		char operation;
		operation = in.next().charAt(0);

		if (operation == '+') {
			System.out.println(x + y);
		} else if (operation == '-') {
			System.out.println(x - y);
		} else if (operation == '*') {
			System.out.println(x * y);
		} else {
			System.out.println((double)(x / y));
		}
		
		in.close();

	}

}

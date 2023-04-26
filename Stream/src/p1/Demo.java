package p1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter a value");

		int x = scanner.nextInt();

		int divisby5 = x % 5;
		int divisby7 = x % 7;
		int divisby3 = x % 3;
		int divisby11 = x % 11;

		if (x > 100 || x < 999) { //if x is in bounds if true continue to nested conditional 
			
			if (divisby5 == 0 && divisby7 == 0) {//if true print
				System.out.println(x + " is divisible by 5 and 7");
			}
			else if (divisby3 == 0 && divisby11 == 0) { // else do this
				System.out.println(x + "is divisible by 3 and 117");
			}
		} 
		else {//x is out of bounds
			System.out.println("error");
		}

	}

}

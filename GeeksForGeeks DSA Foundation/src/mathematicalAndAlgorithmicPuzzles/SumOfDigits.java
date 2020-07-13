package mathematicalAndAlgorithmicPuzzles;

import java.util.Scanner;

public class SumOfDigits {

	static int sumDigits(int n) {

		if (n == 0) {

			return n;
		}

		return sumDigits(n / 10) + n % 10;

	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		char k;
		do {
			System.out.println("ENTER A NUMBER");
			int n = kb.nextInt();
			System.out.println("1.SUM OF DIGITS \n2.SINGLE DIGIT SUM \n Enter Your Choice ");

			int ch = kb.nextInt();

			switch (ch) {

			case 1:
				System.out.println(sumDigits(n));
				break;

			case 2:
				while (n > 9) {

					n = sumDigits(n);
				}

				System.out.println(n);

				break;

			default:
				System.out.println("Please enter a correct choice");

			}

			System.out.println("sum digits another number y/n ");
			k = kb.next().charAt(0);

		} while (k == 'y' || k == 'Y');

	}

}

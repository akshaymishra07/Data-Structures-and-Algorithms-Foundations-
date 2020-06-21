package stack;

import java.util.Scanner;
import java.util.Stack;

public class StringReverseUsingStack {

	public static void stringReverse(String str) {
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < str.length(); i++)
			st.push(str.charAt(i));

		str = "";

		while (!st.isEmpty()) {

			str += st.pop();

		}

		System.out.println(str);

	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		String str = kb.next();

		stringReverse(str);

	}

}

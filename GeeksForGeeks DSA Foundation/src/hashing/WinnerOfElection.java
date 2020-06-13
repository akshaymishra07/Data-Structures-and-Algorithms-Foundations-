/*  
 *     Given an array of names (consisting of lowercase characters) 
 *     of candidates in an election. A candidate name in array 
 *     represents a vote casted to the candidate. Print the name 
 *     of candidate that received Max votes. If there is tie, 
 *     print lexicographically smaller name.
 *     
 *     
 *     Solution : 
 *     
 *     An efficient solution is to use Hashing. We insert 
 *     all votes in a hash map and keep track of counts of 
 *     different names. Finally we traverse the map and print 
 *     the person with maximum votes.
 * 
 * 
 * */



package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WinnerOfElection {

	static int winCount = 0;

	static String findWinner(String arr[]) {

		Map<String, Integer> hm = new HashMap<>();
		String winner = new String();
		int count = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (hm.containsKey(arr[i])) {

				hm.put(arr[i], hm.get(arr[i]) + 1);

			} else
				hm.put(arr[i], 1);

		}

		for (Map.Entry entry : hm.entrySet()) {

			if ((int) entry.getValue() > count) {
				count = (int) entry.getValue();
				winner = (String) entry.getKey();
			}

			else if ((int) entry.getValue() == count && winner.compareTo((String) entry.getKey()) > 0) {

				winner = (String) entry.getKey();
			}

		}
		winCount = count;
		return winner;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		String arr[] = new String[n];

		for (int i = 0; i < n; i++) {

			arr[i] = kb.next();

		}

		String winner = findWinner(arr);

		System.out.println(winner + " " + winCount);

	}

}

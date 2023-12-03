package com.chandu.leetcode.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 1662. Check If Two String Arrays are Equivalent
 *
  https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/?envType=daily-question&envId=2023-12-01*/

public class ArrayStringsareEqual {

	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		int i = 0; // word1's index
		int j = 0; // word2's index
		int a = 0; // word1[i]'s index
		int b = 0; // word2[j]'s index
		
		while (i < word1.length && j < word2.length) {
		      if (word1[i].charAt(a) != word2[j].charAt(b))
		        return false;
		      if (++a == word1[i].length()) {
		        ++i;
		        a = 0;
		      }
		      if (++b == word2[j].length()) {
		        ++j;
		        b = 0;
		      }
		    }

		 return i == word1.length && j == word2.length;

	}

	public static void main(String[] args) throws IOException {
		ArrayStringsareEqual obj = new ArrayStringsareEqual();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the First String: ");
		String[] input1 = bufferedReader.readLine().split(",\\s*");
		System.out.println("Enter the Second String: ");
		String[] input2 = bufferedReader.readLine().split(",\\s*");
		if (obj.arrayStringsAreEqual(input1, input2)) {
			System.out.println("The two  Strings are equal");

		} else {
			System.out.println("The two  Strings are not equal ");
		}
	}

}

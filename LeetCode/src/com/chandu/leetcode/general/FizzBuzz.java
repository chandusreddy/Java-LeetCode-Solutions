/**
 * 
 */
package com.chandu.leetcode.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chandu
 * 
 *         Leetcode: #412 https://leetcode.com/problems/fizz-buzz/ Given an
 *         integer n, return a string array answer (1-indexed) where:
 * 
 *         answer[i] == "FizzBuzz" if i is divisible by 3 and 5. answer[i] ==
 *         "Fizz" if i is divisible by 3. answer[i] == "Buzz" if i is divisible
 *         by 5. answer[i] == i (as a string) if none of the above conditions
 *         are true.
 * 
 * 
 *         Example 1:
 * 
 *         Input: n = 3 Output: ["1","2","Fizz"] Example 2:
 * 
 *         Input: n = 5 Output: ["1","2","Fizz","4","Buzz"] Example 3:
 * 
 *         Input: n = 15 Output:
 *         ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 *
 */
public class FizzBuzz {

	public List<String> fizzBuzzLogic(int n) {

		List<String> result = new ArrayList<>(n);

		for (int i = 1; i <= n; i++) {
			boolean divisibleby3 = i % 3 == 0;
			boolean divisibleby5 = i % 5 == 0;

			String currentString = "";

			if (divisibleby3) {
				currentString += "Fizz";
			}
			if (divisibleby5) {
				currentString += "Buzz";
			}
			if (currentString.isEmpty()) {
				currentString += String.valueOf(i);
			}

			result.add(currentString);
		}

		return result;

	}

	public static void main(String[] args) {

		FizzBuzz fb = new FizzBuzz();
		
		System.out.println("Output with the logic of FizzBuzz Leetcode problem with n as 5. ");
		
		List<String> fbstring = fb.fizzBuzzLogic(5);
		
		System.out.println("The List of String is as follows: " + fbstring);
	}
}

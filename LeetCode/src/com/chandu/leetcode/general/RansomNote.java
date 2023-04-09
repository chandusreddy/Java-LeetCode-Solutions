/**
 * 
 */
package com.chandu.leetcode.general;

import java.util.HashMap;

/**
 * @author swathireddyy
 * 
 *         LeetCode # 383 - Ransom Note
 * 
 *         Given two strings ransomNote and magazine, return true if ransomNote
 *         can be constructed by using the letters from magazine and false
 *         otherwise.
 * 
 *         Each letter in magazine can only be used once in ransomNote.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: ransomNote = "a", magazine = "b" Output: false 
 *         
 *         Example 2:
 * 
 *         Input: ransomNote = "aa", magazine = "ab" Output: false
 * 
 *         Example 3:
 * 
 *         Input: ransomNote = "aa", magazine = "aab" Output: true
 */
public class RansomNote {

	// Approach 1 usingt the for Loop
	public boolean canConstruct(String ransomNote, String magazine) {

		for (int i = 0; i < ransomNote.length(); i++) {
			char r = ransomNote.charAt(i);

			int matchingIndex = magazine.indexOf(r);

			if (matchingIndex == -1) {
				return false;
			}

			magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex + 1);
		}

		return true;
	}

	public Boolean canConstructHash(String ransomNote, String magazine) {
		// TODO Auto-generated method stub

		HashMap<Character, Integer> magazineLetters = new HashMap<>();
		for (int i = 0; i < magazine.length(); i++) {
			char m = magazine.charAt(i);

			int currentCount = magazineLetters.getOrDefault(m, 0);
			magazineLetters.put(m, currentCount + 1);
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			char r = ransomNote.charAt(i);

			int currentCount = magazineLetters.getOrDefault(r, 0);

			if (currentCount == 0) {
				return false;
			}
			magazineLetters.put(r, currentCount - 1);

		}

		return true;

	}

	public static void main(String[] args) {

		RansomNote rn = new RansomNote();
		System.out.println("Testing the logic:");
		String ransomeNote = "aa";
		String magazine = "aab";

		boolean result1 = rn.canConstruct(ransomeNote, magazine);
		System.out.println("Testing the logic with Approach 1: using For Loop: " + result1);
		boolean result2 = rn.canConstructHash(ransomeNote, magazine);
		System.out.println("Testing the logic with Approach 1: using HashMap : " + result2);
	}

}

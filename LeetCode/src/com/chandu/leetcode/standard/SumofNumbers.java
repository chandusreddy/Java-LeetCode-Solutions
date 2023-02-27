package com.chandu.leetcode.standard;

public class SumofNumbers {

	public static void main(String[] args) {
		double now = System.currentTimeMillis();

		SumofNumbers obj = new SumofNumbers();
		System.out.println(obj.findSum1(99999));
		//System.out.println(obj.findSum2(99999));

		System.out.println("Time taken - " + (System.currentTimeMillis() - now) + "milliseconds");

	}

	// TimeComplexity of Sum of Natural Numbers for below logic - less compared with below
	public int findSum1(int n) {
		return n * (n + 1) / 2;

	}
	// TimeComplexity of Sum of Natural Numbers for below logic - more compared with above
	public int findSum2(int m) {
		int sum = 0;
		for (int i = 0; i <= m; i++) {
			sum = sum + i;
		}
		return sum;
	}
}

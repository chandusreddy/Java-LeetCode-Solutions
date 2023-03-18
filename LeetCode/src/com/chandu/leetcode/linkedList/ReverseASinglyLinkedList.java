package com.chandu.leetcode.linkedList;

import java.util.LinkedList;

/***
 * 
 * 
 * @author Chandu Leetcode 206:
 *         https://leetcode.com/problems/reverse-linked-list/
 * 
 **/
public class ReverseASinglyLinkedList {

	ListNode head;

	static class ListNode {
		private int data; // Generic Type
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;

		}
	}

	// Method for displaying the values in the Singly Linked List Nodes
	public void Display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");

	}

	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;

		}
		return previous;
	}

	public static void main(String[] args) {
		ReverseASinglyLinkedList rsl = new ReverseASinglyLinkedList();

		rsl.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(9);

		System.out.println("Printing the values of the SinglyLinkedList : ");
		rsl.Display();
		System.out.println();
		ListNode reverse = rsl.reverseList(second);
		System.out.println("The reverse of the Linked List : " +reverse.data );

	}
}

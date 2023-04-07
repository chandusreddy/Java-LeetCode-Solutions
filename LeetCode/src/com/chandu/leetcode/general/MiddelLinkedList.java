/**
 * 
 */
package com.chandu.leetcode.general;

import java.util.ArrayList;

/**
 * @author Chandu Leet code # 876 - Middle of the Linked List
 * 
 *         https://leetcode.com/problems/middle-of-the-linked-list/
 * 
 *         Given the head of a singly linked list, return the middle node of the
 *         linked list.
 * 
 *         If there are two middle nodes, return the second middle node.
 * 
 * 
 * 
 *         Example 1:
 * 
 * 
 *         Input: head = [1,2,3,4,5] Output: [3,4,5] Explanation: The middle
 *         node of the list is node 3.
 *
 */
public class MiddelLinkedList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {

		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

	}
	
	

	// Approach 1
	public ListNode middleNode(ListNode head) {

		ArrayList<ListNode> array = new ArrayList<>();

		int length = 0;
		while (head != null) {
			array.add(head);
			head = head.next;
			length++;
		}

		return array.get(length / 2);

	}

	// Approach 2
	public ListNode middleNode2(ListNode head) {

		ListNode middle = head;
		ListNode end = head;
		while (end != null && end.next != null) {
			middle = middle.next;
			end = end.next.next;

		}
		return middle;

	}
	


}

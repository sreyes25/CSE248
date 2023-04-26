package MergeTwoSortedList;

public class Solution {

	public static void main(String[] args) {
		ListNode a = new ListNode(5);
		ListNode b = new ListNode(2, a);
		ListNode l1 = new ListNode(1, b);// 1,2,4

		ListNode c = new ListNode(4);
		ListNode d = new ListNode(3, c);
		ListNode l2 = new ListNode(1, d);// 1,2,4

		l2 = mergeTwoLists(l1, l2);
		System.out.print("[");
		while(l2 != null) {
			System.out.print(l2.val);
			if(l2.next != null) {
			System.out.print(",");
			}
			l2 = l2.next;
		}
		System.out.print("]");
		
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode();
		ListNode tail = dummy;
		
		while(l1 != null && l2 != null) {
			
			if(l1.val < l2.val) {
				tail.next = l1;
				l1 = l1.next;
			}
			else {
				tail.next = l2;
				l2 = l2.next;
			}
			tail = tail.next;
		}
		
		if(l1 != null) {
			tail.next = l1;
		}
		else if(l2 != null) {
			tail.next = l2;
		}

		return dummy.next;

	}

	public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {

		ListNode list;
		ListNode newNode;
		ListNode current;

		if (l1 == null && l2 == null) {
			return null;
		} else if (l2 != null & l1 == null) {
			return l2;
		} else if (l1 != null & l2 == null) {
			return l1;
		}

		if (l2.val < l1.val) {
			newNode = new ListNode(l1.val);
			list = new ListNode(l2.val, newNode);
		} else {
			newNode = new ListNode(l2.val);
			list = new ListNode(l1.val, newNode);
		}

		current = newNode;
		l1 = l1.next;
		l2 = l2.next;

		if (l1 == null && l2 == null) {
			return list;
		}

		while (l1 != null && l2 != null) {
			if (l1.val > l2.val) {
				newNode = new ListNode(l2.val);
				current.next = newNode;
				current = newNode;
				l2 = l2.next;
			} else {
				newNode = new ListNode(l1.val);
				current.next = newNode;
				current = newNode;
				l1 = l1.next;
			}
		}

		if (l1 == null) {
			while (l2 != null) {
				newNode = new ListNode(l2.val);
				current.next = newNode;
				current = newNode;
				l2 = l2.next;
			}

		} else {
			while (l1 != null) {
				newNode = new ListNode(l1.val);
				current.next = newNode;
				current = newNode;
				l1 = l1.next;
			}
		}

		return list;
	}

}

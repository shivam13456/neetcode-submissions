/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return null;
        }

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        int count = 1;
        ListNode reversedList = prev;
        ListNode currNode = reversedList;
        if(n == 1) {
            reversedList = reversedList.next;
        }
        else {
            while (currNode != null && currNode.next != null) {
                if (count == n - 1) {
                    currNode.next = currNode.next.next;
                }
                count = count + 1;
                currNode = currNode.next;
            }
        }
        
        ListNode newNode = reversedList;
        ListNode a1 = null;
       
        while (newNode != null) {
            ListNode t = newNode.next;
            newNode.next = a1;

            a1 = newNode;
            newNode = t;
        }

        return a1;
    }
}

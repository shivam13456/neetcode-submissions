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
    public ListNode mergeTwoLists (ListNode list1, ListNode list2) {
        ListNode f = list1;
        ListNode s = list2;

        ListNode ans = null;
        ListNode head = null;
        ListNode tail = null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        while (f != null && s != null) {
            if (f.val < s.val) {
                if(tail == null) {
                    ans = new ListNode(f.val);
                    ans.next = head;
                    head = ans;
                    tail = ans;
                    f = f.next;
                }

                else {
                    ans = new ListNode(f.val);
                    tail.next = ans;
                    tail = ans;
                    f = f.next;
                }
            }

            else {
                if(tail == null) {
                    ans = new ListNode(s.val);
                    ans.next = head;
                    head = ans;
                    tail = ans;
                    s = s.next;
                }

                else {
                    ans = new ListNode(s.val);
                    tail.next = ans;
                    tail = ans;
                    s = s.next;
                }
            }
        }

        while (f != null) {
            ans = new ListNode(f.val);
            tail.next = ans;
            tail = ans;
            f = f.next;
        }

        while (s != null) {
            ans = new ListNode(s.val);
            tail.next = ans;
            tail = ans;
            s = s.next;
        }
        return head;
    }
}
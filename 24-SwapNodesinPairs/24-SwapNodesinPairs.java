// Last updated: 7/21/2026, 9:24:43 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode swapPairs(ListNode head) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15
16        ListNode prev = dummy;
17
18        while (head != null && head.next != null) {
19            ListNode first = head;
20            ListNode second = head.next;
21
22            // swap
23            prev.next = second;
24            first.next = second.next;
25            second.next = first;
26
27            // move forward
28            prev = first;
29            head = first.next;
30        }
31
32        return dummy.next;
33    }
34}
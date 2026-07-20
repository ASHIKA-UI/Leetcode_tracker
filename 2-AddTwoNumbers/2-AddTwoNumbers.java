// Last updated: 7/20/2026, 11:02:23 AM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode dummy = new ListNode(0);
14        ListNode current = dummy;
15        
16        int carry = 0;
17
18        while (l1 != null || l2 != null || carry != 0) {
19            int sum = carry;
20
21            if (l1 != null) {
22                sum += l1.val;
23                l1 = l1.next;
24            }
25
26            if (l2 != null) {
27                sum += l2.val;
28                l2 = l2.next;
29            }
30
31            carry = sum / 10;
32            current.next = new ListNode(sum % 10);
33            current = current.next;
34        }
35
36        return dummy.next;
37    }
38}
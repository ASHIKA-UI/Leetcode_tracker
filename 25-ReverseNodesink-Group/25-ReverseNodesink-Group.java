// Last updated: 7/22/2026, 11:53:46 AM
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
12    public ListNode reverseKGroup(ListNode head, int k) {
13        if (head == null || k == 1) return head;
14
15        ListNode dummy = new ListNode(0);
16        dummy.next = head;
17
18        ListNode prevGroup = dummy;
19
20        while (true) {
21            // Step 1: Check if k nodes exist
22            ListNode kth = getKthNode(prevGroup, k);
23            if (kth == null) break;
24
25            ListNode nextGroup = kth.next;
26
27            // Step 2: Reverse k nodes
28            ListNode prev = nextGroup;
29            ListNode curr = prevGroup.next;
30
31            while (curr != nextGroup) {
32                ListNode temp = curr.next;
33                curr.next = prev;
34                prev = curr;
35                curr = temp;
36            }
37
38            // Step 3: Connect
39            ListNode temp = prevGroup.next; // will become end after reverse
40            prevGroup.next = kth;
41            prevGroup = temp;
42        }
43
44        return dummy.next;
45    }
46
47    private ListNode getKthNode(ListNode curr, int k) {
48        while (curr != null && k > 0) {
49            curr = curr.next;
50            k--;
51        }
52        return curr;
53    }
54}
// Last updated: 7/20/2026, 11:42:28 AM
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
11import java.util.PriorityQueue;
12
13class Solution {
14    public ListNode mergeKLists(ListNode[] lists) {
15        // Edge case
16        if (lists == null || lists.length == 0) return null;
17
18        // Min heap based on node value
19        PriorityQueue<ListNode> pq = new PriorityQueue<>(
20            (a, b) -> a.val - b.val
21        );
22
23        // Add first node of each list
24        for (ListNode node : lists) {
25            if (node != null) {
26                pq.offer(node);
27            }
28        }
29
30        // Dummy head
31        ListNode dummy = new ListNode(0);
32        ListNode current = dummy;
33
34        while (!pq.isEmpty()) {
35            ListNode minNode = pq.poll();
36            current.next = minNode;
37            current = current.next;
38
39            if (minNode.next != null) {
40                pq.offer(minNode.next);
41            }
42        }
43
44        return dummy.next;
45    }
46}
// Last updated: 7/15/2026, 2:15:04 PM
1import java.util.*;
2
3class Solution {
4    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
5        
6        Set<String> wordSet = new HashSet<>(wordList);
7        
8        if (!wordSet.contains(endWord)) {
9            return 0;
10        }
11        
12        Queue<String> queue = new LinkedList<>();
13        queue.offer(beginWord);
14        
15        int level = 1;
16        
17        while (!queue.isEmpty()) {
18            int size = queue.size();
19            
20            for (int i = 0; i < size; i++) {
21                String word = queue.poll();
22                
23                if (word.equals(endWord)) {
24                    return level;
25                }
26                
27                char[] arr = word.toCharArray();
28                
29                for (int j = 0; j < arr.length; j++) {
30                    char original = arr[j];
31                    
32                    for (char c = 'a'; c <= 'z'; c++) {
33                        arr[j] = c;
34                        String newWord = new String(arr);
35                        
36                        if (wordSet.contains(newWord)) {
37                            queue.offer(newWord);
38                            wordSet.remove(newWord);
39                        }
40                    }
41                    
42                    arr[j] = original;
43                }
44            }
45            
46            level++;
47        }
48        
49        return 0;
50    }
51}
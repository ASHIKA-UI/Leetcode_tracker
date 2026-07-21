// Last updated: 7/21/2026, 9:01:39 AM
import java.util.*;

class Solution {

    public static List<Integer> getRow(int rowIndex) {

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {

            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                int val = res.get(i-1).get(j-1) + res.get(i-1).get(j);
                row.add(val);
            }

            if (i > 0)
                row.add(1);

            res.add(row);
        }

        return res.get(rowIndex);
    }

    public static void main(String[] args) {

            int rowIndex = 3;  

            List<Integer> row = getRow(rowIndex);

            System.out.println(row);
    }
}

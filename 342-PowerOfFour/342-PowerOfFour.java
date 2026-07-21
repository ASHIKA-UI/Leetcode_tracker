// Last updated: 7/21/2026, 9:00:26 AM
class Solution {
    public boolean isPowerOfFour(int n) {
         if(n <= 0){
            return false;
        }
        while ( n % 4 == 0){
            n = n/4;
        }
        return n == 1;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution s = new Solution();
        boolean result = s.isPowerOfFour(n);
        System.out.println(result);
    }
}
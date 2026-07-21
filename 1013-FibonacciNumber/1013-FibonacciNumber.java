// Last updated: 7/21/2026, 8:59:34 AM
class Solution {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        else if( n == 1){
            return 1;
        }
        else{
            return fib(n - 1) + fib(n - 2);       
             }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution s = new Solution();
        int result = s.fib(n);
        System.out.println(result);
    }
}
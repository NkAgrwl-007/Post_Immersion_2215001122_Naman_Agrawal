public class Code_2 {
    public static void main(String[] args) {
        int digit = 345;
        int ans = sumofDigits(digit);
        System.out.println(ans);
    }  
    public static int sumofDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumofDigits(n / 10);
    } 

    
}

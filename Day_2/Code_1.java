public class Code_1{
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n * fact(n - 1);
    }
    public static int ques2(int n){
        if(n<=1){
            return n;
        }
        int ans = 0;
        if(n%2==0){
            ans = n + ques2(n/2);
        }else{
            ans = ques2((n+1)/2) + ques2((n-1)/2);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 6;
        // int ans = fact(n);
        int ans2 = ques2(n);

        System.out.println( ans2);
    }
}

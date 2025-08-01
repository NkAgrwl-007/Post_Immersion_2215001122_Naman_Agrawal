public class Code_3 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println(fun(x , y));
    }
    public static int fun(int x, int y) {
        if(y==0 || y==x) {
            return 1;
        }

        return fun(x-1 , y) + fun(x-1 , y-1);
    }
}

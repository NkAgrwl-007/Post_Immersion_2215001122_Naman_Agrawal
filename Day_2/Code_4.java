public class Code_4 {
    public static void main(String[] args) {
        int x = 2;
        int y = 7;
        System.out.println(fun(x , y));
    }
    public static int fun(int x, int y) {
        if(x==y) {
            return x*y;
        }

        return fun(x , (x+y)/2 ) + fun((x+y)/2+1 , y);
    }
}

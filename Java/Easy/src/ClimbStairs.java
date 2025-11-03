public class ClimbStairs {
    public static int climbStairs(int num) {
        if (num <= 2) return num;

        int a = 1;
        int b = 2;

        for (int i = 3; i <= num; i++) {
            int temp = a + b; // f(n) = f(n-1) + f(n-2)
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("" + climbStairs(5));
    }
}
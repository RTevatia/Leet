public class MySqrt {

    public static int sqrt(int x) {
        if ( x < 2) return x;

        int left = 0;
        int right = x;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (middle * middle == x) return middle;
            else if (middle * middle > x) right = middle - 1;
            else left = middle + 1;
        }

        return right;
    }

    public static void main(String[] args) {
        // Examples
        System.out.println(sqrt(4));
        System.out.println(sqrt(8));
    }
}

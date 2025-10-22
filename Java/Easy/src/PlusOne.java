
import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;
        for (int i = 0; i < digits.length; i++)
            newArr[i + 1] = digits[i];

        return newArr;
    }

    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        int[] digits1 = {1, 2, 3};
        int[] digits2 = {4, 3, 2, 1};
        int[] digits3 = {9};
        System.out.println(Arrays.toString(po.plusOne(digits1)));
        System.out.println(Arrays.toString(po.plusOne(digits2)));
        System.out.println(Arrays.toString(po.plusOne(digits3)));
    }

}

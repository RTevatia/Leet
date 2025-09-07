public class PalindromeNumber {

    public boolean isPalindromeStr(int num) {
        String numStr = Integer.toString(num);
        String reversed = "";
        for (int i = numStr.length() - 1 ; i >= 0; i--)
            reversed += numStr.charAt(i);

        return numStr.equals(reversed);
    }

    public boolean isPalindromeInt(int num) {
        if (num < 0)
            return false;

        int originial = num;
        int reversedInt = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedInt = (reversedInt * 10) + digit;
            num /= 10;
        }
        return originial == reversedInt;
    }

    public static void main() {
        PalindromeNumber pn = new PalindromeNumber();
        int num1 = 121;
        int num2 = 125;
        
        System.out.println(pn.isPalindromeStr(num1)); // true
        System.out.println(pn.isPalindromeStr(num2)); // false
        System.out.println(pn.isPalindromeInt(num1)); // true
        System.out.println(pn.isPalindromeInt(num2)); // false
    }
}

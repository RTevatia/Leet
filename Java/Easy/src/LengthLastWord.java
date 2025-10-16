public class LengthLastWord {

    private int lengthLastWord(String s) {
        int i = s.length() - 1;
        int length = 0;

        // Skip trailing spaces
        while ( i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Skip trailing spaces
        while ( i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        LengthLastWord length = new LengthLastWord();

        String s1 = "Hell0 world";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";
        System.out.println(length.lengthLastWord(s1));
        System.out.println(length.lengthLastWord(s2));
        System.out.println(length.lengthLastWord(s3));
    }
}

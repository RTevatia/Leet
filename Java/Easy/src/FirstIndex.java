public class FirstIndex {

    public int firstIndex(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        FirstIndex fi = new FirstIndex();
        // Example 1
        String haystack1 = "sadbutsad";
        String needle1 = "but";
        System.out.println(fi.firstIndex(haystack1, needle1));

        // Example 2
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println(fi.firstIndex(haystack2, needle2));
    }
}

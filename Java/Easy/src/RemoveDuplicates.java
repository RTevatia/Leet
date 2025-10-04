import java.util.Arrays;

public class RemoveDuplicates {
     
    /**
     * Removes duplicates from sorted array in-place using two-pointer technique
     * Time: O(n), Space: O(1)
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null) return 0;
        if (nums.length == 0) return 0;
        
        int k = 1; // Position for next unique element
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
    
    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        
        // Test cases
        int[][] testCases = {
            {1, 1, 3},
            {0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4},
            {1},
            {},
            {1, 2, 3, 4, 5},
            {1, 1, 1, 1}
        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[] original = testCases[i].clone();
            int[] nums = testCases[i].clone();
            
            System.out.println("Test " + (i + 1) + ": " + Arrays.toString(original));
            
            int k = removeDuplicates.removeDuplicates(nums);
            int[] result = Arrays.copyOfRange(nums, 0, k);
            
            System.out.println("Output: " + k + " unique elements -> " + Arrays.toString(result));
            System.out.println();
        }
    }
}


import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null) return 0;

        int k = 0; // Pointer to track the values that aren't equal to val
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != val)
                nums[k++] = nums[i];

        return k;
    }

    public static void main(String[] args) {
        RemoveElement remove = new RemoveElement();
        // Example 1
        int[] nums1 = {3,2,2,3};
        System.out.println("Nums = " + Arrays.toString(nums1) + " and val = " + 3);
        int k1  = remove.removeElement(nums1, 3);
        int[] output1 = Arrays.copyOfRange(nums1, 0, k1);
        System.out.println("k = " + k1 + ", Output = " + Arrays.toString(output1));

        System.out.println("");

        //Example 2
        int[] nums2 = {0,1,2,2,3,0,4,2};
        System.out.println("Nums = " + Arrays.toString(nums2) + " and val = " + 2);
        int k2 = remove.removeElement(nums2, 2);
        int[] output2 = Arrays.copyOfRange(nums2, 0, k2);
        System.out.println("k = " + k2 + ", Output = " + Arrays.toString(output2));
    }
}

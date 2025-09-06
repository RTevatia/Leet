
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            for (int j = i+1; j < nums.length; j++)
                if (nums[i] + nums[j] == target)
                    return new int[] {i, j};
        return new int[] {};
    }

    public int[] twoPassHash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], i);

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i)
                return new int[] {i, map.get(complement)};
        }

        return new int[] {};   
    }

    public int[] onePassHash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement))
                return new int[] {map.get(complement), i};

            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public void main() {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println(Arrays.toString(bruteForce(nums1, target1)));
        System.out.println(Arrays.toString(twoPassHash(nums1, target1)));
        System.out.println(Arrays.toString(onePassHash(nums1, target1)));
    }
}
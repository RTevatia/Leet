public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums == null) return 0;

        int first_index = 0;
        int last_index = nums.length - 1;

        while (first_index <= last_index) {
            int middle_index = (first_index + last_index) / 2;

            if (nums[middle_index] == target) return middle_index;
            else if (nums[middle_index] < target) first_index = middle_index + 1;
            else last_index = middle_index - 1;
        }

        return first_index;
    }

    public static void main(String[] args) {
        SearchInsertPosition search = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;
        System.out.println(search.searchInsert(nums, target1));
        System.out.println(search.searchInsert(nums, target2));
        System.out.println(search.searchInsert(nums, target3));
    }
}

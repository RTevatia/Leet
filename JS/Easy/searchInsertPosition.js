var searchInsert = function(nums, target) {
    if (nums === null) return 0;

    var first_index = 0;
    var last_index = nums.length - 1;

    while (first_index <= last_index) {
        var middle_index = Math.floor((first_index + last_index) / 2);
        if (nums[middle_index] === target) return middle_index;
        else if (nums[middle_index] < target) first_index = middle_index + 1;
        else last_index = middle_index - 1;
    }

    return first_index;
}

nums = [1,3,5,6];

console.log(searchInsert(nums, 5));
console.log(searchInsert(nums, 2));
console.log(searchInsert(nums, 7));
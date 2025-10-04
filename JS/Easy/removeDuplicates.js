let removeDuplicates = function(nums) {
    if (nums === null) return 0;
    let k = 1;
    for (let i = 1; i < nums.length; i++) {
        if (nums[i] !== nums[i-1]) {
            nums[k++] = nums[i];
        }
    }
    return k;
}

// Example 1
nums1 = [1,1,2];
k1 = removeDuplicates(nums1);
console.log(`output = ${k1}, nums = ${nums1.splice(0, k1)}`)

// Example 2
nums2 = [0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4];
k2 = removeDuplicates(nums2);
console.log(`output = ${k2}, nums = ${nums2.splice(0, k2)}`)
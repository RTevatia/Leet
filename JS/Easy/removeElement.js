let removeElement = function(nums, val) {
    if (nums == null) return 0;

    let k = 0;

    for (let i = 0; i < nums.length; i++) {
        if (nums[i] != val) {
            nums[k++] = nums[i];
        }
    }

    return k;
}

let main = function() {
    // Example 1
    let nums1 = [3,2,2,3];
    console.log(`original nums = ${nums1}, val = 3`);
    let k1 = removeElement(nums1, 3);
    console.log(`k = ${k1} nums = ${nums1.splice(0, k1)}`);
    // Example 2
    let nums2 = [0,1,2,2,3,0,4,2];
    console.log(`original nums = ${nums2}, val = 2`);
    let k2 = removeElement(nums2, 2);
    console.log(`k = ${k2} nums = ${nums2.splice(0, k2)}`);
}

main();

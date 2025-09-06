/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

// Approach 1 - Brute Force
var twoSumBruteForce = function(nums, target) {
    for (let i = 0; i < nums.length; i++)
        for (let j = i + 1; j < nums.length; j++)
            if (nums[i] + nums[j] == target)
                return [i, j];
    return [];
};

// Approach 2- Two pass hash 
var twoSumTwoPassHash = function (nums, target) {
    const map = new Map();

    for (let i = 0; i < nums.length; i++)
        map.set(nums[i], i);

    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];

        if (map.has(complement) && map.get(complement) !== i)
            return [i, map.get(complement)];
    }

    return [];
};

// Approach 3-One pass hash

var twoSumOnePassHash = function(nums, target) {
    const map = new Map();

    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        if (map.has(complement))
            return [map.get(complement), i]
        map.set(nums[i], i);
    }
    return [];
}

const bruteForce = twoSumBruteForce([2, 7, 11, 13], 9);
console.log(bruteForce);

const twoHash = twoSumTwoPassHash([2, 7, 11, 13], 9);
console.log(twoHash); 

const oneHash = twoSumOnePassHash([2, 7, 11, 13], 9);
console.log(oneHash);
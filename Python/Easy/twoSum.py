
class Solution:
    # Approach 1 - Brute Force
    # Time complexity - O(n^2)
    # Space complexity - O(1)
    def twoSum1(self, nums: list[int], target: int) -> list[int]:
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if (nums[i] + nums[j] == target):
                    return [i, j]
        return []

    # Approach 2 - Two-pass Hash Table
    # Time complexity: O(n)
    # Space complexity: O(n)
    def twoSum2(self, nums: list[int], target: int) -> list[int]:
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hashmap = {}
        for i in range(len(nums)):
            hashmap[nums[i]] = i

        for i in range(len(nums)):
            complement = target - nums[i]
            if complement in hashmap and hashmap[complement] != i:
                return [i, hashmap[complement]]

        return []

    # Appraoch 3 - One-pass hash table
    # Time complexity - O(n)
    # Space complexity - O(n)

    def twoSum3(self, nums: list[int], target: int) -> list[int]:
        hashmap = {}

        for i in range(len(nums)):
            complement = target - nums[i]
            if complement in hashmap:
                return [hashmap[complement], i]
            hashmap[nums[i]] = i
        return []


def main():
    solution = Solution()
    print(solution.twoSum3([2, 7, 11, 15], 9))
    print(solution.twoSum3([3, 3], 6))
    print(solution.twoSum3([1, 2, 3, 4], 100))
    print(solution.twoSum3([3, 2, 4], 6))


if __name__ == "__main__":
    main()

class Solution:
    def removeDuplicates(self, nums):
        if not nums:
            return 0
        
        # Two pointer technique
        k = 1 # position for next unique element
        
        for i in range(1, len(nums)):
            if nums[i] != nums[i - 1]:
                nums[k] = nums[i]
                k +=1
                
        return k
    
def main():  
    solution = Solution()

    # Example 1
    nums1 = [1,1, 2]
    k1 = solution.removeDuplicates(nums1)
    print(f"Output = {k1}, nums = {nums1[:k1]}")

    # Example 2
    nums2 = [0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
    k2 = solution.removeDuplicates(nums2)
    print(f"Output = {k2}, nums = {nums2[:k2]}")
    
if __name__ == "__main__":
    main()
                
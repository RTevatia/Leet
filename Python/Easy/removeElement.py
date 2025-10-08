def removeElement(nums, val):
    if not nums:
        return 0
    
    # Pointer for the non-val element
    k = 0

    for i in range(len(nums)):
        if nums[i] != val:
            nums[k] = nums[i]
            k += 1

    return k

    
def main():
    # Example 1
    nums1 = [3,2,2,3]
    val1 = 3
    k1 = removeElement(nums1, val1)
    print(k1)
    print(nums1[:k1])

    # Example 2
    nums2 = [0,1,2,2,3,0,4,2]
    val2 = 2
    k2 = removeElement(nums2, val2)
    print(k2)
    print(nums2[:k2])


if __name__ == "__main__":
    main()
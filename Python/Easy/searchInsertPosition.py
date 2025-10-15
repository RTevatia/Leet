def searchInsert(nums, target):
    if not nums: return 0

    first_index, last_index = 0, len(nums) - 1

    while first_index <= last_index:
        middle_index = (first_index + last_index) // 2
        if nums[middle_index] == target:
            return middle_index
        elif nums[middle_index] < target:
            first_index = middle_index + 1
        else:
            last_index = middle_index - 1
            
    return first_index
    

def main():
    # Example 1
    nums = [1,3,5,6]
    target1 = 5
    print(searchInsert(nums, target1))

    # Example 2
    target2 = 2
    print(searchInsert(nums, target2))

    # Example 3
    target3 = 7
    print(searchInsert(nums, target3))

if __name__ == "__main__":
    main()
    
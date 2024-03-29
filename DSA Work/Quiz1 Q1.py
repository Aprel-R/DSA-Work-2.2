def removeDuplicates(nums):
    i = 0  
    for j in range(1, len(nums)): 
        if nums[i] != nums[j]:  
            i += 1  
            nums[i] = nums[j] 
    return i + 1  

# Example:
nums = [1, 1, 2, 3, 3, 4]
length = removeDuplicates(nums)
print(nums[:length])  # Output: [1, 2, 3, 4]

def singleNumber(nums):
    # Initialize the result to 0
    result = 0
    
    # XOR all elements in the array
    for num in nums:
        result ^= num

    # The result now contains the single number
    return result

# Example usage
nums = [1, 2, 3, 4, 1, 2, 3]
print(singleNumber(nums))  # Output: 4

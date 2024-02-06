def containsDuplicate(nums):
    seen = set()
    for num in nums:
        if num in seen:
            return True
        seen.add(num)
    return False

# Example usage
nums = [1, 2, 3, 3]
print(containsDuplicate(nums))  # Output: True

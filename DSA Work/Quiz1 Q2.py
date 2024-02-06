def rotate_array(nums, k):
    n = len(nums)
    k %= n  # Handle cases where k is larger than or equal to the array length

    def reverse(start, end):
        # Reverse the elements in the given range
        while start < end:
            nums[start], nums[end] = nums[end], nums[start]
            start += 1
            end -= 1

    reverse(0, n - 1)  # Reverse the entire array
    reverse(0, k - 1)  # Reverse the first k elements
    reverse(k, n - 1)  # Reverse the remaining elements

# Example:
nums = [1, 2, 3, 4, 5, 6, 7]
rotate_array(nums, 3)
print(nums)  # Output: [5, 6, 7, 1, 2, 3, 4]

def summation(array):
    total = 0
    for num in array:
        total += num
    return total

def maximum(array):
    if not array:  
        return None
    largest = array[0]
    for num in array:
        if num > largest:
            largest = num
    return largest

def main():
    n = int(input("Enter the number of integers: "))
    array = []
    for i in range(n):
        num = int(input(f"Enter integer {i+1}: "))
        array.append(num)

    sum_result = summation(array)
    max_result = maximum(array)

    print("The sum is:", sum_result)
    print("The largest integer is:", max_result)

if __name__ == "__main__":
    main()

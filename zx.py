def calculate_average_divisible_by_three_and_even(arr):
    sum_divisible_by_three_and_even = 0
    count_divisible_by_three_and_even = 0

    for num in arr:
        if num % 3 == 0 and num % 2 == 0:
            sum_divisible_by_three_and_even += num
            count_divisible_by_three_and_even += 1

    if count_divisible_by_three_and_even == 0:
        return 0

    average = sum_divisible_by_three_and_even / count_divisible_by_three_and_even
    return average

def main():
    try:
        n = int(input("Enter the size of the array: "))
        arr = []

        print("Enter the elements of the array:")
        for _ in range(n):
            arr.append(int(input()))

        average = calculate_average_divisible_by_three_and_even(arr)
        print("Average of numbers divisible by 3 and even:", average)

    except ValueError:
        print("Invalid input. Please enter valid integers.")

if __name__ == "__main__":
    main()

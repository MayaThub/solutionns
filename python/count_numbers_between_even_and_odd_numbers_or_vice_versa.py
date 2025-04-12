def count_between_even_odd(arr,n):
    count = 0
    for i in range(1, n - 1):
        if (arr[i - 1] % 2 == 0 and arr[i + 1] % 2 != 0) or (arr[i - 1] % 2 != 0 and arr[i + 1] % 2 == 0):
            count += 1
    return count

n = int(input())
arr = list(map(int, input().split()))

print(count_between_even_odd(arr,n))

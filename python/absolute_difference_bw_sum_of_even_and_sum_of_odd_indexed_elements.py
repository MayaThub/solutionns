n = int(input())
arr = list(map(int, input().split()))
evp = sum(arr[::2])
print(abs(sum(arr) - 2 * evp))

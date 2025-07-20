n = int(input())
arr = list(map(int, input().split()))

half1 = arr[n//2:]
half2 = arr[:n//2]

print(sum(half2))
print(sum(half1))


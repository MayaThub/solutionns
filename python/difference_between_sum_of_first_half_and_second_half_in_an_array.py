n = int(input())
arr = list(map(int, input().split()))

half1 = arr[n//2:]
half2 = arr[:n//2]

diff = abs(sum(half1) - sum(half2))

print(diff)

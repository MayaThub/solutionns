n = int(input())
arr = list(map(int, input().split()))
k = int(input())

sum = 0

for num in arr:
    sum += num
    if num == k:
        break

print(sum)

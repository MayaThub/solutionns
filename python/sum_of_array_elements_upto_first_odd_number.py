n = int(input())
arr = list(map(int, input().split()))

sum = 0

for num in arr:
    if num & 1:
        break
    sum += num

print(sum)

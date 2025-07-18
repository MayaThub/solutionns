n = int(input())
arr = list(map(int, input().split()))

count = 0

for i in range(n):
    prev = arr[i - 1]
    next = arr[(i + 1) % n] 

    if (prev % 2 == 0 and next % 2 != 0) or (prev % 2 != 0 and next % 2 == 0):
        count += 1

print(count)

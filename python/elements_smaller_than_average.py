n = int(input())
arr = list(map(int, input().split()))

avg = sum(arr)//n

c = 0

for i in range(0,n):
    if arr[i] <= avg:
        c = c + 1
print(c)

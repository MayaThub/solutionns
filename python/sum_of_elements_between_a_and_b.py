n = int(input())
arr = list(map(int, input().split()))
a,b = map(int,input().split())

sum = 0

for num in arr:
    if a<= num <= b:
        sum += num

print(sum)

n = int(input())
arr = list(map(int, input().split()))
a,b = map(int,input().split())

min = b + 1

for num in arr:
    if num >= a and num <= b and num < min:
        min = num
if min == b +1 :
    print(-1)
else:
    print(min)

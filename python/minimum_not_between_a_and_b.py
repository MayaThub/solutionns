n = int(input())
arr = list(map(int, input().split()))
a,b = map(int,input().split())

min = float('inf')
flag = False

for num in arr:
    if (num < a or num > b) and num < min:
        min = num
        flag = True
if  flag :
    print(min)
else:
    print(-1)

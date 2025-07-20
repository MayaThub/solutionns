n = int(input())
arr = list(map(int, input().split()))
a,b = map(int,input().split())

res = []

for num in arr:
    if a<= num <= b:
        res.append(num)
if res:
    print(*res)
else:
    print(-1)

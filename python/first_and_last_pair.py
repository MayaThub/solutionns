n = int(input())
arr = list(map(int,input().split()))
res = []
for i in range(n//2):
    res.append(arr[i])
    res.append(arr[n - i - 1])
if n & 1 :
    res.append(arr[(n//2)])
    res.append(0)
print(*res)



n = int(input())
arr = list(map(int,input().split()))
res = max(filter(lambda x : x[1] % 2 == 0,enumerate(arr)))[1]
print(res)

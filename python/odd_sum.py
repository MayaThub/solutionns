n = int(input())
arr = list(map(int, input().split()))
print(sum(filter(lambda x : x % 2 != 0,arr)))

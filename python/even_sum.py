n = int(input())
arr = list(map(int, input().split()))
even_sum = sum(filter(lambda x : x % 2 == 0,arr))
print(even_sum)

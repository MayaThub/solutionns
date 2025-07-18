n = int(input())
arr = list(map(int, input().split()))
a, b = map(int, input().split())

total = sum(x for x in arr if x < a or x > b)

print(total)

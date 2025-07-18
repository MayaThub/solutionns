n = int(input())
arr = list(map(int, input().split()))
a, b = map(int, input().split())

low = min(a, b)
high = max(a, b)

result = [x for x in arr if x < low or x > high]

if result:
    print(*result)
else:
    print(-1)

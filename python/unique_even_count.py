n = int(input())
arr = list(map(int, input().split()))

unique_odds = set()
for num in arr:
    if num & 1 == 0:
        unique_odds.add(num)

print(len(unique_odds))

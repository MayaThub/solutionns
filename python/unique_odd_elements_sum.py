n = int(input())
arr = list(map(int, input().split()))

unique_odds = set()

for num in arr:
    if num % 2 & 1:
        unique_odds.add(num)

print(sum(unique_odds))

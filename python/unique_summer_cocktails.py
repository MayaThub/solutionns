from collections import Counter

n = int(input())
arr = list(map(int,input().split()))
total = 0
frequencies = Counter(arr)

for elem,freq in frequencies.items():
    total += elem
print(total)


from collections import Counter

n = int(input())
arr = list(map(int,input().split()))
c = 0
frequencies = Counter(arr)

for elem,freq in frequencies.items():
    if elem & 1 and freq == 1:
        c += 1
print(c)


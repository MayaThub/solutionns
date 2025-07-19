from collections import Counter

def getRes(arr):
    frequency = Counter(arr)
    count = 0
    
    for elem,freq in frequency.items():
        if elem == freq:
            count += 1
    return count


n = int(input())  
arr = list(map(int, input().split()))

print(getRes(arr))

from collections import Counter

def getRes(arr):
    frequency = Counter(arr)
    stas_elem = []
    
    for elem,freq in frequency.items():
        if elem == freq:
            stas_elem.append(elem)
    if not stas_elem:
        return -1
    return min(stas_elem),max(stas_elem)

n = int(input())  
arr = list(map(int, input().split()))

result = getRes(arr)

if result == -1:
    print(result)
else:
    print(result[0], result[1])

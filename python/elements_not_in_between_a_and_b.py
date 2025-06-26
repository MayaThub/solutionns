import numpy as np 

n = int(input())

arr = np.array(list(map(int, input().split())))

a, b = map(int, input().split())

low = min(a, b)
high = max(a, b)

mask = (arr < low) | (arr > high)

if arr[mask].size > 0:
    print(*arr[mask])
else:
    print(-1)

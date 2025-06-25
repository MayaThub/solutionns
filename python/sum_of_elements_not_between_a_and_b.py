import numpy as np 

n = int(input())

arr = np.array(list(map(int,input().split())))

a,b = map(int,input().split())

mask = (arr < a) | (arr > b)

print(arr[mask].sum())

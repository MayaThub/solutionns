n = int(input())

arr = list(map(int,input().split()))

arre = []
arro = []

for i in range(n) :
    if arr[i] % 2 == 1 :
        arro.append(arr[i])
    else:
        arre.append(arr[i])

print(*(arro+arre))
        

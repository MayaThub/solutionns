n = int(input())
arr = list(map(int,input().split()))
num = 0
m2 = 2**n
for i in range(n):
    m2 = m2 // 2
    num = num + (arr[i] * m2)
print(num)

def isPrime(n):
    if n == 2 or n == 3:
        return True
    if n == 4 or n == 1:
        return False
    i = 2
    while i * i <= n :
        if n % i == 0:
            return False
        i += 1
    return True

n = int(input())
arr = list(map(int,input().split()))
k = int(input())
c = 0

for num in arr:
    if isPrime(num) and num >= k:
        c += 1

print(c)

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
primes = []

for num in arr:
    if isPrime(num):
        primes.append(num)

print(f"{sum(primes)/len(primes):.2f}")

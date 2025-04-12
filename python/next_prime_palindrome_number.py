import math

def isPrime(n):
    if n <= 1:
        return False
    if n <= 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    for i in range(5, int(math.sqrt(n)) + 1, 6):
        if n % i == 0 or n % (i + 2) == 0:
            return False
    return True

def isPD(n):
    return n == int(str(n)[::-1])

def getNPPN(n):
    n += 1
    while isPrime(n) == False or isPD(n) == False:
        n += 1
    return n

n = int(input())
print(getNPPN(n))

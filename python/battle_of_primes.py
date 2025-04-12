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


def getNPN(n):
    n += 1
    while isPrime(n) == False :
        n += 1
    return n

n1 = int(input())
n2 = int(input())
s = n1 + n2
print(getNPN(s) - s)

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


a = int(input())
b = int(str(a)[::-1])
if isPrime(a):
    if isPrime(b):
        print("circular prime")
    else:
        print("prime but not a circular prime")
else:
    print("not prime")

def isDN(n):
    wn = 0
    i = 1
    for digit in str(n):  
        d = int( digit )
        wn = wn + ( d ** i)
        i = i + 1
    return True if n == wn else False

n = int(input())
print(isDN(n))

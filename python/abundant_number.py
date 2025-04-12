def isAN(n):
    fs = 0
    i = 1
    for i in range(1,n):
        if n % i == 0 :
            fs = fs + i
    return True if n <= fs else False

n = int(input())
print(isAN(n))

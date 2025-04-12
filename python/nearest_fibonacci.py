def getNumFebRngs(n):
    if n == 0:
        return 0,1
    if n == 1:
        return 1,1
    a = 0
    b = 1
    while n > b:
        c = a + b
        a = b
        b = c
    return a,b

n = int(input())
a,b = getNumFebRngs(n)
if (n-a) < (b-n):
    print(a)
elif (n-a) == (b-n):
    print(a,b)
else:
    print(b)


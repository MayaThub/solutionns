def isFib(n):
    if n == 0 or n == 1:
        return True
    a = 0
    b = 1
    while n > a :
        c = a + b
        a = b
        b = c
    if n == a or n == b :
        return True
    else:
        return False

n = int(input())
if isFib(n):
    print(True)
else:
    print(False)

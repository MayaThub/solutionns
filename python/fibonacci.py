def Fib(n):
    if n == 0 or n == 1:
        print(n)
        return
    a = 0
    b = 1
    print(a,b,end = " ")
    for i in range(0,n-2):
        c = a + b
        a = b
        b = c
        print(c,end=" ")
n = int(input())
Fib(n)

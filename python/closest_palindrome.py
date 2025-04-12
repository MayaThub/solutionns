n = int(input())
a = n + 1
b = n - 1
while ( int(str(a)[::-1]) != a ) and ( int(str(b)[::-1]) != b ):
    a = a + 1
    b = b - 1
if int(str(b)[::-1]) == b :
    print(b,end = " ") 
if int(str(a)[::-1]) == a :
    print(a) 

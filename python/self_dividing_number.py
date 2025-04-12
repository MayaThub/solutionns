def is_SDN(n):
    for digit in str(n):
        dig = int(digit)
        if dig == 0 or n%dig != 0 :
            return False
    return True

a = int(input()) 
b = int(input()) 

for i in range(a,b+1):
    if is_SDN(i):
        print(i,end=" ") 

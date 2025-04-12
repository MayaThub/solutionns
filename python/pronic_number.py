def isPN(n):
    for i in range(1,int(n**0.5)+1):
        if i * (i+1) == n :
            return True
    return False

print("YES") if isPN(int(input())) else print("NO")

def isTrue():
    n = int(input())
    arr = list(map(int,input().split()))

    for i in range(n):
        if arr[i] & 1 == 0 and i & 1:
            return False
    return True
print(isTrue())

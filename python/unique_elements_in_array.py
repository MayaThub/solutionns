def isTrue():
    n = int(input())
    arr = list(map(int,input().split()))
    seen = set()
    result = []

    for num in arr:
        if num not in seen :
            seen.add(num)
            result.append(num)
            
    return result
print(*isTrue())

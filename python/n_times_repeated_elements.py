from collections import Counter

def main():
    n = int(input())
    arr = list(map(int,input().split()))
    k = int(input())
    satis = []

    frecuencies = Counter(arr)

    for elem,freq in frecuencies.items():
        if freq == k:
            satis.append(elem)
    return satis if satis else -1

res = main()
if res == -1:
    print(-1)
else:
    print(*res)


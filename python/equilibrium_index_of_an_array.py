def main():
    n = int(input())
    arr = list(map(int,input().split()))
    right = sum(arr)
    left = 0

    for i in range(n):
        present = arr[i]
        right -= present
        if left == right :
            return i
        left += present
    return -1

t = int(input())

while t > 0 :
    print(main())
    t -= 1

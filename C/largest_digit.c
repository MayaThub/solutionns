#include <stdio.h>

int main(){
    int max = 0,n,sc;
    scanf("%d",&n);
    
    while (n > 0)
    {
        int l = n % 10;
        n /= 10;
        max = (max > l) ? (max) : (l);
    }
    printf("%d",max);
}

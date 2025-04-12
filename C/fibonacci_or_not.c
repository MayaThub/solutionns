#include <stdio.h>

int fibOrNot(int n){
    int a = 0,b = 1;
    while ( a <= n)
    {
        if ( a == n)
            return 1;
        b = a+b -(a=b);
        a = a + b;
    }
    return 0;
}

int main(){
    int n;
    scanf("%d",&n);
    
    if (fibOrNot(n) == 1)
        printf("True");
    else
        printf("False");
}

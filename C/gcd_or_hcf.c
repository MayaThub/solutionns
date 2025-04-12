#include <stdio.h>

int main(){
    int min = 0,gcd = 0,i,a,b,sc;
    scanf("%d%d",&a,&b);

    min = (a < b) ? (a) : (b);
    
    for ( i = 1; i <= min; i++)
    {
        if (a % i == 0 && b % i == 0)
        {
            gcd = i;
        }
    }
    printf("%d",gcd);
}

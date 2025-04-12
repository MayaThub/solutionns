#include<stdio.h>
int main(){
    int a,b,;
    scanf("%d%d",&a,&b);
    if ( (a == 1 && b == 10) || (a == 10 && b == 1))
        printf("Yes");
    else if( b == (a+1) || a == (b+1))
        printf("Yes");
    else
        printf("No");
}

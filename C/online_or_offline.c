#include<stdio.h>
int main(){
    int a,b;
    scanf("%d%d",&a,&b);
    a = a - (a/10);
    if( a < b )
    	printf("ONLINE");
    else if(b < a)
        printf("DINING");
    else
        printf("EITHER");


}

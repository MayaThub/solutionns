#include<stdio.h>
int main(){
    int a,b;
    scanf("%d%d",&a,&b);
    float p = (b*100)/a;
    if( p >=75 )
    	printf("ELIGIBLE");
    else
        printf("NOT ELIGIBLE");


}

#include<stdio.h>
int main(){
    int u;
    float sc;
    scanf("%d",&u);
    if( u < 200 )
    	sc = u * 1.2;
    else if( u < 400 )
        sc = u * 1.5;
    else if( u < 600 )
        sc = u * 1.8;
    else
        sc = u * 2.00;
    
    if ( sc > 400 )
        printf("%.2f", sc + (sc * 3) / 20);
    else
        printf("%.2f", sc + 100);

}

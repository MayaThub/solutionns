#include<stdio.h>

int main(){
    int x1,y1,x2,y2;
    scanf("%d%d%d%d",&x1,&y1,&x2,&y2);

    int c1 = x1 + y1 ,c2 = x2 + y2 ;
    if(c1 < c2)
        printf("%d",c1);
    else
        printf("%d",c2);
        
}

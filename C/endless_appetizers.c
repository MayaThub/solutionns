#include <stdio.h>
#include <math.h>

int main(){
    int x,y,r;
    scanf("%d%d%d",&x,&y,&r);
    int e = r/30;
    x += e;
    printf("%d",(int)ceil((double) x/ y));
    
}

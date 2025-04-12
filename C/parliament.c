#include<stdio.h>
#include<math.h>
int main(){
    int x,n;
    scanf("%d%d",&n,&x);
    if (x >= ceil(n/2.0))
        printf("YES");
    else
        printf("NO");
}

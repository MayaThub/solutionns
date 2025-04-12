 #include<stdio.h>
int main(){
    int a,b,c,d,cnt = 0;
    scanf("%d%d%d%d",&a,&b,&c,&d);
    if (b > a)
        cnt++;
    if (c > a)
        cnt++;
    if (d > a)
        cnt++;
    printf("%d",cnt);
}

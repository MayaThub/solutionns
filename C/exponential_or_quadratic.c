 #include<stdio.h>
 #include<math.h>
int main(){
    int n;
    scanf("%d",&n);
    if (pow(2,n) > (n * n))
        printf("Yes");
    else
        printf("No");
}

#include<stdio.h>
int main()
{
    int n;
    
    printf("Input the number \n");
    scanf("%d",&n);

    for(int i =1;i<=10;i++)
    {
        int a=i*n;
        printf("%d X %d = %d \n",i,n,a);
    }
}
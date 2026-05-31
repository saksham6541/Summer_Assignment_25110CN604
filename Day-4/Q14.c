#include<stdio.h>

int fibo(int n);

int main()
{
    int n;
    printf("Input the number \n");
    scanf("%d",&n);
    int a =fibo(n);
    printf("%dth fibonacci term is %d",n,a);
}

int fibo(int n)
{
    if(n==0)
    {
        return 0;
    }
    else if(n==1)
    {
        return 1;
    }
    else
    {
        return (fibo(n-1)+fibo(n-2));
    }
}
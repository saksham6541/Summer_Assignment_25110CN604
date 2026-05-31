#include<stdio.h>
int fibo(int n);
int main()
{
    int n;
    printf("Input the number");
    scanf("%d",&n);

    for(int i=1;i<=n;i++)
    {
        int a =fibo(i);

        printf("%d",a);
    }
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

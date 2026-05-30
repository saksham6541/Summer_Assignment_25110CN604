#include<stdio.h>
int gcd(int m,int n);
int main()
{
    int a,b;

    printf("Input the two numbers: \n");
    scanf("%d%d",&a,&b);

    int result=gcd(a,b);
    printf("GCD of %d and %d is %d",a,b,result);
}
int gcd(int m,int n)
{
    if(n==0)
    {
        return m;
    }
    else
    {
        return gcd(n,m%n);
    }
}
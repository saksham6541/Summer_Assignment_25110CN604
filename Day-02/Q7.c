#include<stdio.h>
int main()
{
    int n;
    printf("Input the number \n");
    scanf("%d",&n);

    int product=1;

    int temp =n;

    while(temp!=0)
    {
        int r=temp%10;
        product*=r;
        temp/=10;
    }

    printf("Product of digits of %d is %d",n,product);

}
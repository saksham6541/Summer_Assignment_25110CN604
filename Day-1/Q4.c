#include<stdio.h>
int main()
{
    int n;
    printf("Input the number \n");
    scanf("%d",&n);

    int c=0;

    int temp =n;

    while(temp!=0)
    {
        c++;
        temp/=10;
    }

    printf("The number of digits in %d is %d",n,c);
}
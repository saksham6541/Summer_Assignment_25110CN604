#include<stdio.h> 
#include<math.h>

int main()
{
    int n;
    printf("Input the number \n");
    scanf("%d",&n);

    int rev=0;
    int temp =n;

    while(temp!=0)
    {
        int r=temp%10;
        rev=(rev*10+r);
        temp/=10;
    }

    printf("The reverse of the %d is %d",n,rev);

}
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

    if(n==rev)
    {
        printf("The number is palindrome");
    }
    else 
    {
        printf("The number is not palindrome");
    }

}
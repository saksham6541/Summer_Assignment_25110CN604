#include<stdio.h>
int main()
{
    int n;
    printf("Input the number \n");
    scanf("%d",&n);

    printf("Factors of %d are \n");

    for(int i=1;i<=n/2;i++)
    {
        if(n%i ==0)
        {
            printf("%d \n",i);
        }
    }
}
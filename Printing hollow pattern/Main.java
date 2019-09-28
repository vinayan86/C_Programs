#include<stdio.h>
int main()
{
	int n,c=0 ,f=0;
    scanf("%d",&n);
	for(int i=1;i<=n;i++)
    {
     
      printf("*");
	}
	printf("\n");
		for(int i=1;i<n-1;++i)
    {
     for(int j=1;j<=n;j++)
     {
      if(j==1||j==n)
      printf("*");
      else
      printf(" ");
     }
     	printf("\n");
	}
		for(int i=1;i<=n;i++)
    {
     
      printf("*");
	}
	printf("\n");
	return 0;
}
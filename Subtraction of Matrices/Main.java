#include<stdio.h>
int main()
{
  int i,j,r,c;
scanf("%d",&r);
  scanf("%d",&c);
  int arr[r][c],arr1[r][c],temp[r][c];

          for(i=0;i<r;i++)
          {
            for(j=0;j<c;j++)
              scanf("%d",&arr[i][j]);
          }
    for(i=0;i<r;i++)
          {
            for(j=0;j<c;j++)
              scanf("%d",&arr1[i][j]);
          }
  
  
            for(i=0;i<r;i++)
          {
            for(j=0;j<c;j++)
            {
              temp[i][j]=arr[i][j]- arr1[i][j];
                 printf("%d ",temp[i][j]);
            }
              printf("\n");
            }
  
  return 0;
}
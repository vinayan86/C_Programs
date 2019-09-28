#include <stdio.h>
int main()
{
int m,n,f=0;
scanf("%d",&m);
  scanf("%d",&n);

int mat[m][n],mat1[m][n];
int i, j,k;
for(i = 0; i < m; i++)
{
  for(j = 0; j < n; j++)
       scanf("%d",&mat[i][j]);
}
  for(i = 0; i < m; i++)
{
  for(j = 0; j < n; j++)
       scanf("%d",&mat1[i][j]);
}
for(i = 0; i < m; i++)
{
  for(j = 0; j < n; j++)
  {
    if(mat[i][j]!=mat1[i][j])
    {
      f=1;
      break;
    }
  }
  
}
if(f==0)
  printf("Yes");
  else
     printf("No"); 
return 0;
}

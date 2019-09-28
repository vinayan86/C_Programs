#include <stdio.h>
int main()
{
int m,n;
scanf("%d",&m);
  scanf("%d",&n);

int mat[m][n];
int i, j,k;
for(i = 0; i < m; i++)
{
  for(j = 0; j < n; j++)
       scanf("%d",&mat[i][j]);
}

 for(i = n-1; i >=0 ; i--)
        {
              for(j =0; j < n ; j++)
              {
            printf("%d ", mat[j][i]);
              }
   printf("\n");
        }

return 0;
}

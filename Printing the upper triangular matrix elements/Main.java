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

 for(i = 0; i < n; i++)
        {
              for(j = 0, k = i; k < n ; j++, k++)
            printf("%d ", mat[j][k]);
        }

return 0;
}

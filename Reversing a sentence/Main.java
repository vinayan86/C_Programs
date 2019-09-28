#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 
int main()
{
    char st1[MAX_SIZE], r[MAX_SIZE];
    int l, i, f, m, n;
       // scanf("%[^\n]s",st1);

   fgets(st1, MAX_SIZE, stdin); 
    l =strlen(st1);
    f = 0;
    m = l - 1;
    n = l- 1;
    while(m > 0)
    {
        if(st1[m] == ' ')
        {
            i = m + 1;
            while(i <= n)
            {
                r[f] = st1[i];
                i++;
                f++;
            }
            r[f++] = ' ';
           n = m - 1;
        }
     m--;
    }
    for(i=0; i<=n; i++)
    {
        r[f] = st1[i];
        f++;
    }

    r[f] = '\0'; 
    printf("%s", r);
    return 0;
}

#include<stdio.h>
int insertion_sort(int n,int a[]);
int main()
{
    int n;
	scanf("%d",&n);
    int a[n];
    for(int i = 0;i < n; i++)
    {
        scanf("%d",&a[i]);   
    }
for (int j = 1; j < n/2; j++) 
        {
            int key = a[j];
            int k = j - 1;
            while((k >= 0) && (a[k] > key)) 
            {
                a[k + 1] = a[k];
                k--;
            }
            a[k + 1] = key;
        }
        for (int j = n/2; j < n; j++) 
        {
            int key = a[j];
            int k = j - 1;
            while((k >= n/2) && (a[k] < key)) 
            {
                a[k + 1] = a[k];
                k--;
            }
            a[k + 1] = key;
        }
        for(int i = 0; i < n; i++)
        {
            printf("%d ", a[i]);
        }
 
    return 0;

}

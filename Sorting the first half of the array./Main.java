#include<stdio.h>
int main()
{
  int n;
    scanf("%d",&n);
 int i, key, j,arr[n]; 
      for (i = 0; i < n; i++) 
      {
        scanf("%d",&arr[i]);
      }
    for (i = 1; i < n/2; i++) { 
        key = arr[i]; 
        j = i - 1; 
        while (j >= 0 && arr[j] > key) { 
            arr[j + 1] = arr[j]; 
            j = j - 1; 
        } 
        arr[j + 1] = key; 
    } 

for (i = 0; i < n; i++) 
        printf("%d ", arr[i]); 
	return 0;
}
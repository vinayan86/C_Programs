#include<stdio.h>
int main()
{

    int year;
   
    scanf("%d",&year);
    if(year%4 == 0)
    {
        if( year%100 == 0)
        {
            // year is divisible by 400, hence the year is a leap year
            if ( year%400 == 0)
                printf("Leap year");
            else
                printf("Not Leap year");
        }
        else
            printf("Leap year" );
    }
    else
        printf("Not Leap year");
  return 0;
}
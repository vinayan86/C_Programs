import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main
{
    public static void main(String args[]) throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
      int a=0,b=1,count=2;
      if(n==1)
        System.out.println("0");
      else if(n==2)
        System.out.println("1");
      else
      {
        for(int i=2;i<=n;i++)
        {
          int s=a+b;
          count++;
          if(count==n)
          {
            System.out.println(s);
            break;
          }
          else
          {
            a=b;
            b=s;
          }
        }
      }
    }
}
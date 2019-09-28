import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {

	
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
      int a=0,b=0,c=1;
      int k=3;
      System.out.print(a+" "+b+" "+c+" ");
      while(k!=n)
      {
        int s=a+b+c;
        System.out.print(s+" ");
        a=b;b=c;c=s;
        k++;
      }
    }
}
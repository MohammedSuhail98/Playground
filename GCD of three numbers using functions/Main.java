import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in =new Scanner (System.in);
      int n1= in.nextInt();
       int n2= in.nextInt();
       int n3= in.nextInt();
      int ans= gcd(n1,n2,n3);
      System.out.print(ans);
    }
  public static int gcd(int a,int b, int c)
  {
    int min,gcd=0;
    for(int i=1; i<=2; i++)
    {
    if(a<b)
      min=a;
    else
      min=b;
    while(min>=1)
    {
      if(a%min==0 && b%min==0)
      {
gcd=min;
        break;
      }
      min--;
    }
    a=gcd;
      b=c;
    }
    return gcd;
	}
}
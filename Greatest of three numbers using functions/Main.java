import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1= in.nextInt();
         int n2= in.nextInt();
         int n3= in.nextInt();
     int ans= largest(n1,n2,n3);
      System.out.print(ans);
    }
  
    public static int largest(int a, int b, int c)
    {
        int d=0;
      if(a>b)
      {
        d=a;
      }
      else
      {
        d=b;
      }
      if(d>c)
      {
        d=d;
      }
      else
      {
        d= c;
      }
return d;
	}
}
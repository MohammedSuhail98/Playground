import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      for( int i=1; i<=n; i++)
      {
        for( int j=1;j<=n;j++)
        {
          if(i==1 && j==1||j==n && i==n || i==1 && j==n || i==n &&j==1)
               System.out.print("*");
          
          else if(i+j==n+1||i==j)
               System.out.print("*");
          
          else
               System.out.print(" ");
        }
           System.out.print("\n");
      }

	}
}
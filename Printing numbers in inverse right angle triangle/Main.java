import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int i,j;
      int num=n;
      for ( i=0; i<n; i++)      
      {
        
        for ( j=0; j<(n-i); j++)
        {
          System.out.print(num);
          num= num-1;
        }
System.out.print("\n");
num=n-i-1;
        
	}}
}
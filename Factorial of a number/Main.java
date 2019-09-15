import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int fact,a=1;
      for( fact=n;fact>0;fact--)
      {
        a=fact*a;
                            
	}
      System.out.println(a);
}}
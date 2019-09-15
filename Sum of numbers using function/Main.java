import java.util.Scanner;
class Main{
  public static int sum(int n)
  {
    int add=0;
    for(int i=n; i>0; i--)
    {
     add=i+add;
    }
    return add;
  }
      
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner (System.in);
      int num= in.nextInt();
      int ans= sum(num);
      System.out.print(ans);
	}
}
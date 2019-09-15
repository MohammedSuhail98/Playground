import java.util.Scanner;
class Main
{
  public static int sqr(int n)
  {
    int ans = n*n;
    return ans;
  }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner in =new Scanner (System.in);
      int num= in.nextInt();
      int answer= sqr(num);
      System.out.print(answer);
                      
	} 
}
import java.util.Scanner;
class Main
{
public static int pow(int a, int b)
{
  int product=1;
  for( int i=1; i<=b; i++)
  {
   
    product=product *a;
  }
  return product;
}
  public static void main(String args[])
  {
    Scanner in = new Scanner (System.in);
    int a= in.nextInt();
    int b=in.nextInt();
    int c= pow(a,b);
      System.out.print(c);
  }
}

import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      double r=0;
      switch(n)
      {
        case 1:int t= in.nextInt();
          r= t*t;
          break;
        case 2: int a= in.nextInt();
          int b = in.nextInt();
          r = a *b ;
          break;
        case 3: int p = in.nextInt();
          int h= in.nextInt();
          r= .5f * p * h;
          break;
        case 4: int rad = in.nextInt();
          r = rad * rad * 3.14 - .00000000000001;
          break;
      }
      System.out.print(r);
    }
}
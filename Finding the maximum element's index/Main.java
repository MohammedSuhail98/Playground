import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
     Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int[] list = new int[n];
    for (int i=0 ; i<n ; i++)
    {
      list[i] = in.nextInt();
    }
    int i,j,max=0;
    for(  i=0; i <n; i++)
    {
       max = i;
      for ( j=1; j<n; j++)
      {
        if(list[i] < list[j])
         max = j;
      }
     
    }
    System.out.print(max);
  }
}
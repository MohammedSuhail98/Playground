import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n; i++)
      {
        arr[i] = in.nextInt();
      }
      int pal[] = new int[n];
      int x=0;
      for(int i=n-1; i>=0; i--)
      {
        pal[i] = arr[x];
        x++;
      }
      boolean isPal = true;
      for(int i=0; i<n; i++)
      {
        if(arr[i]!= pal[i])
        {
          isPal = false;
          break;
        }
      }
      if(isPal == false)
      {
        System.out.print("No");
      }
      else
      {
        System.out.print("Yes");
      }
        
    }
}
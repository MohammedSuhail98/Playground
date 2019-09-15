import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int k= in.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n; i++)
      {
        arr[i] = in.nextInt();
      }
      for(int j=1; j<=k; j++)
      {
        int count =0;
        for(int i=0; i<n; i++)
        {
          if( j == arr[i])
            count++;
        }
        System.out.println(j + " " + count);
      }
    }
}
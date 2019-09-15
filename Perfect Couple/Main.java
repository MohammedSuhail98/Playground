import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int arr[]= new int[n];
      for( int i=0; i<n; i++)
      {
        arr[i]=in.nextInt();
      }
      int value= in.nextInt();
      find(n,arr,value);
    }
  public static void find(int n, int arr[], int value)
  {
    int sum=0;
    for (int i=0; i<n; i++)
    {
      for( int j= i+1; j<n; j++)
      {
        sum= arr[i]+ arr[j];
        if(sum== value)
        {
          System.out.println(arr[i] + ", " + arr[j]);
        }
      }
    }
  }
}
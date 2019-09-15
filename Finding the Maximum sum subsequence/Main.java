import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int n= in.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++)
    {
      arr[i] = in.nextInt();
    }
    int sum=0;
    int ans =0;
    for(int i=0; i<n-1; i++ )
    {
      if(arr[i] < arr[i+1])
      {
        sum+=arr[i];
       if(i == n-2 && sum > ans) { ans = sum + arr[i+1]; }
      }
      else if(arr[i]  > arr[i+1])
      {
        sum+=arr[i];
        if(sum>ans){ ans = sum; }
        sum=0;
        
      }
    }
    System.out.print(ans);
  }
}
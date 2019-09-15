import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner in = new Scanner (System.in);
int n = in.nextInt();
  int arr[]= new int[n];
  for (int i=0; i<n; i++)
  {
arr[i] = in.nextInt();
  }
  int r = in.nextInt();
  rotate_left(n,arr,r);
}
  public static void rotate_left(int n, int arr[], int r)
  {
    int odd[] = new int[n];
    int odd_index = 0;
    int even[] = new int[n];
    int even_index = 0;
    for (int i=0; i<n; i++)
    {
      if(i%2 == 0)
      {
        odd[odd_index] = arr[i];
        odd_index++;
      }
      else
      {
        even[even_index] = arr[i];
        even_index++;
      }
    }
   
    
    for (int i=0; i<r; i++)
    {
      int temp = even[0];
      for (int j=0; j<even_index-1; j++)
      {
        even[j] = even[j+1];
      }
      even[even_index-1] = temp;
    }
    for (int i=0; i<r; i++)
    {
      int temp = odd[odd_index-1];
      for (int j=odd_index-1; j>0; j--)
      {
        odd[j] = odd[j-1];
      }
      odd[0] = temp;
    }
    int e=0, o=0;
    for(int i=0; i<n; i++)
    {
      
      if(i%2 == 0)
      {
        arr[i] = odd[o];
        o++;
      }
      else
      {
        arr[i] = even[e];
        e++;
      }
    }
   for (int i=0; i<n; i++)
   {
     System.out.print(arr[i] + " ");
   }
  }
}

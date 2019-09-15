import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
        Scanner in = new Scanner (System.in);
    int n= in.nextInt();
    int arr[]= new int[n];
    for(int i=0;i<n; i++)
    {
      arr[i]=in.nextInt();
    }
     move(n,arr);
      for(int i=0; i<n; i++)
      {
        System.out.print(arr[i] + " ");
      }
      
       
    }
  public static void move(int n, int arr[])
  {
    int count=0;
    int temp;
   for (int i = 0; i < n; i++) { 
    if ((arr[i] != 0)) { 
        temp = arr[count]; 
        arr[count] = arr[i]; 
        arr[i] = temp; 
        count = count + 1; 
    } 
}
  }
}
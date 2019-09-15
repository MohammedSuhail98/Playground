import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in =new Scanner (System.in);
      int n=in.nextInt();
      int arr[]= new int[n];
      for(int i=0; i<n; i++)
      {
        arr[i]= in.nextInt();
      }
      int a=in.nextInt();
      int b= in.nextInt();
      int l=0,m=0;
      for (int i=0; i<n; i++)
      {
         if(a==arr[i])
        {
         l=i;
           break;
         }
else
{
  l= -1;
  
       
         
         }}
       for (int i=0; i<n; i++)
      {
         if(arr[i]==b)
        {
         m=i;
           break;
        }
        else
        {
          m= -1;
        }
        }
     System.out.println(l);
      System.out.println(m);
    }
}
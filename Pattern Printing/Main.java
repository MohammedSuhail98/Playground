import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in = new Scanner (System.in);
      int a= in.nextInt();
      for(int i = 0; i < a; i++) 
{ 
int fill = a; 
System.out.print(fill); 
for(int j = 0; j < i; j++) 
{ 
fill--; 
System.out.print(fill); 
} 
for(int k = 0; k < a - 1 - i; k++) 
System.out.print(fill); 
System.out.println(); 
} 
    }
}
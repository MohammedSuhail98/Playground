import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str= in.nextLine();
      int n= str.length();
      String tmp = "";
      for (int i=n-1; i>=0; i--){
       tmp= tmp+ str.charAt(i);
      }
      if(str.equals(tmp))
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
        
    } 
}
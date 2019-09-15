import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner in=new Scanner(System.in).useDelimiter("\n");
      String str= in.nextLine();
      String rep=in.nextLine();
      String with= in.nextLine();
      System.out.print(str.replace(rep,with));
    }
}
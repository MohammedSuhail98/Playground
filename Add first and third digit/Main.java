import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in= new Scanner(System.in);
      int num=in.nextInt();
      int num_first=num/100;
      int num_last=num%10;
      int result= num_first+num_last;
      System.out.println(result);
	}
}
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int num_first=num/100;
    int num_sec=(num%100)/10;
      int num_third=num%10;
    int ans= num_third*100+num_sec*10+num_first;
    System.out.println(ans);
  }
}
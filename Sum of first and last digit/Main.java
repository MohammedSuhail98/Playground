import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int temp=n;
      int result;
      int sum=0;
      int r;
    
      while(n>0)
          {
        r=n%10;
          sum=sum*10+r;
        n=n/10;
      }
int first=sum%10;
      int last=temp%10;
      result=first+last;
        System.out.println(result);
    }
  
}
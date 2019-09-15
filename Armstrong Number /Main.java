import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in= new Scanner (System.in);
      int n=in.nextInt();
      int a;
      int r;
      int digit=1;
      int temp =n;
     
     a=0;
      while(n!=0)
      {
        r=n%10;
        a=(r*r*r)+a;
        n=n/10;
      }
      if(a==temp)
      System.out.println("Armstrong Number");
      else{
        
        System.out.println("Not a Armstrong Number");
    }}
      
}
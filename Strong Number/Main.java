import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int i, originalNum, lastDigit, sum;
      int fact;
originalNum=n;
       sum = 0;

    /* Find sum of factorial of digits */
    while(n > 0)
    {

        /* Get last digit of num */
        lastDigit = n % 10;

        /* Find factorial of last digit */
        fact = 1;
        for(i=1; i<=lastDigit; i++)
        {
            fact = fact * i;
        }

        /* Add factorial to sum */
        sum = sum + fact;

        n= n / 10;
    }
      if(originalNum==sum)
       System.out.println("Yes");
      else
        System.out.println("No");



	}
}
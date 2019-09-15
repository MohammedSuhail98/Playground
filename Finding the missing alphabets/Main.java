import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner in = new Scanner (System.in);
  String str1 = in.nextLine();
  String str = str1.toLowerCase();
  int n= str.length();
  char arr[] = str.toCharArray();
  int count[] = new int[27];
  for(int i=0; i<26; i++)
  {
    count[i] = 0;
  }
  for(int i=0; i<n; i++)
  {
    if(arr[i] ==' ')
    {
      count[26]++;
    }
  else if(arr[i]>='a' && arr[i] <= 'z')
   {
     int offset = arr[i] - 'a';
     count[offset] ++;
   }
 else if(arr[i]>='A' && arr[i] <= 'Z')
   {
     int offset = arr[i] - 'A';
     count[offset] ++;
   }
  }
  for(int i=0; i<26; i++)
  {
    if(count[i] == 0){
    char ch = (char)(i + 'a');
      System.out.print(ch + " ");
    }
  }
}
}

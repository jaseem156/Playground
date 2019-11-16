import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
      Scanner in= new Scanner(System.in);
      int n1= in.nextInt();
      int n2= in.nextInt();
      int n3= in.nextInt();
      int result= (gcd_no(n1,n2));
      System.out.println(result);
	    // Type your code here
	}
public static int gcd_no(int a, int b)
{
  int min;
  if(a<b)
  {
    min = a;
  }
  else{
  min = b;
}
  while(min>0)
  {
    if(min % a ==0|| min % b==0)
      return min;
  }
  min--;
  return min;
}
}

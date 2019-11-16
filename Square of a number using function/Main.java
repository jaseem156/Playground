import java.util.Scanner;
class Main
{
  public static int sqr(int n)
  {
    int square= n*n;
    return square;
  }
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n1= in.nextInt();
      int sqr1 = sqr(n1);
       System.out.println(sqr1);
	 // Type your code here   
	} 
}
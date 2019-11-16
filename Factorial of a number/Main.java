import java.util.Scanner;
class Main{
	public static void main (String[] args){
     Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int facto=1;
   for(int count=1;count<=n;count++)
      {
     facto=facto*count;
   }
      System.out.println(facto);   // Type your code here
	}
}
import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
	   int n = in.nextInt();
      for(int row = 1; row <=n ; row++)// Type your code here
      {
        for(int col = 1;col <= n; col++)
        {
          System.out.print(row);
        }
        System.out.print("\n");
      }  // Type your code here
	}
}
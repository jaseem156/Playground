import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
     int max;
    int arr_size=in.nextInt();
    int arr[]=new int[arr_size];
    for(int indx=0;indx<arr_size;indx++)
    {
      arr[indx]=in.nextInt();
    }
    if(arr[0]>arr[1])
    {
      max=0;
    }
    else
    {
      max=1;
    }
      for(int indx=2;indx<arr_size;indx++)
      {
      if(arr[max]<arr[indx])
      {
       max=indx;
      }
      }
      System.out.println(max);

  }
}
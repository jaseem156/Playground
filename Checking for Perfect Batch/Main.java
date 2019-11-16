import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in = new Scanner(System.in);
    int arr_size=in.nextInt();
    int arr[]=new int[arr_size];
    for(int indx=0;indx<arr_size;indx++)
    {
      arr[indx]=in.nextInt();
    }
    batch(arr,arr_size);
  }
  public static void batch(int list[],int n)
  {
    boolean sum=true;
    int sum_batch=list[0]+list[1]+list[2];
      for(int indx=3;indx<n;indx=indx+3)
      {
        int sum_current=(list[indx]+list[indx+1]+list[indx+2]);
    if(sum_batch!=sum_current)
    {
      sum=false;
    }
      }
    if(sum==true){
      System.out.println("Perfect Batch");}
        else
        {
          System.out.println("Not a Perfect Batch");
        }
      }
} 
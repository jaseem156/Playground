import java.util.Scanner;
class Main{
    public static void main(String args[]){
     Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int indx= 0; indx<= arr_size-1; indx++)
      {
        arr[indx]=in.nextInt();
      }
      int max_no;
      if(arr[0]>arr[1])
      {
        max_no=arr[0];
      }
      else
        max_no=arr[1];
      for(int indx=2;indx<=arr_size-1;indx++)
      {
        if(max_no<arr[indx])
        {
          max_no=arr[indx];}
      }
            System.out.println(max_no);
        
      }     // Type your code here
    }

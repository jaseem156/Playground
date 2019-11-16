import java.util.Scanner;
class Main{
    public static void main(String args[]){
  Scanner in = new Scanner(System.in); 
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int indx=0; indx<=arr_size-1; indx++)
      {
         arr[indx]=in.nextInt();
      }
      int search_elmnt1=in.nextInt();
      int search_elmnt2=in.nextInt();
      int indx_elmnt1=-1;
      int indx_elmnt2=-1;
      for(int indx=0; indx<=arr_size-1; indx++)
      {
        if(search_elmnt1==arr[indx])
          indx_elmnt1=indx;
        if(search_elmnt2==arr[indx])
          indx_elmnt2=indx;
      }
      System.out.println(indx_elmnt1);
       System.out.println(indx_elmnt2);
    }
}
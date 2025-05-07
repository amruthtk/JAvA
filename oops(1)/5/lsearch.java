import java.util.Scanner;
import java.util.Arrays;

public class lsearch {
	void define(int arr[],int n,int item)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
          if(arr[i]==item)
          {
          System.out.println("FOUND");
          }
          }
          System.out.println("NOT FOUND");
          }
  public static void main (String args[]){
  int i,item,n;
  Scanner sc=new Scanner(System.in);
        lsearch lin= new lsearch();
        System.out.println("Enter the number of Elments :");
        n=sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter "+n+" Elements :");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched : ");
        item=sc.nextInt();
        lin.define(arr,n,item);
    }
}

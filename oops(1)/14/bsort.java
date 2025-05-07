import java.util.*;
class bubblesort
{
public static <T> T[] bsort(T arr[], int limit)
	{
	String str,str2;
	int i,j;
	for(i=0;i<limit-1;i++)
	 for(j=0;j<limit-1;j++)
	 {
	 str=arr[j].toString();
	 str2=arr[j+1].toString();
	 if(str.compareTo(str2)>0)
	 {
	 T temp=arr[j];
	 arr[j]=arr[j+1];
	 arr[j+1]=temp;
	 }
	 }
	 return arr;
      }
   }
   class bsort
   {
   public static void main(String args[])
   {
   int n,i;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number of elements :");
   n=sc.nextInt();
   String s[]=new String[n];
   for(i=0;i<n;i++)
   {
   s[i]=sc.next();
   }
   bubblesort bubble= new bubblesort();
   s= bubble.<String>bsort(s,n);
   System.out.println("\n Elements after sorting:");
   for(i=0;i<n;i++)
   {
   System.out.print(s[i] +" ");
   }
   }
   }
   
   
   
   


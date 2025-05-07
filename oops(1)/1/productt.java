import java.util.Scanner;
class product
{
	int pcode,price;
	String pname;
	product(int code,String name,int pr)
	{	
		pcode=code;
		pname=name;
		price=pr;
	}
}	
class productt
{
public static void main(String args[])
{
product product1=new product(1001,"Jaseem",500);
int pcode,price;
String pname;
pcode=1002;
pname="sketch";
price=30;

product product2=new product(pcode,pname,price);
Scanner sc=new Scanner(System.in);
System.out.println("Enter product code: ");
pcode=sc.nextInt();
System.out.println("Enter Name: ");
pname=sc.next();
System.out.println("Enter price: ");
price=sc.nextInt();
product product3=new product(pcode,pname,price);
System.out.println("\nproduct 1\nproduct code:"+product1.pcode+"\nproduct name:"+product1.pname+"\nPrice:"+product1.price);
System.out.println("\nproduct 2\nproduct code:"+product2.pcode+"\nproduct name:"+product2.pname+"\nPrice:"+product2.price);
System.out.println("\nproduct 3\nproduct code:"+product3.pcode+"\nproduct name:"+product3.pname+"\nPrice:"+product3.price);
System.out.println("\nHavving lowest price ");
if(product1.price<product2.price &&product1.price<product3.price)
{
System.out.println("\nproduct 1\nproduct code:"+product1.pcode+"\nproduct name:"+product1.pname+"\nPrice:"+product1.price);
}
else if(product2.price<product1.price &&product2.price<product3.price)
{

System.out.println("\nproduct 2\nproduct code:"+product2.pcode+"\nproduct name:"+product2.pname+"\nPrice:"+product2.price);}
else 
System.out.println("\nproduct 3\nproduct code:"+product3.pcode+"\nproduct name:"+product3.pname+"\nPrice:"+product3.price);

}}


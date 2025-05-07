import java.util.Scanner;
class Cpu{
	int price;
	
	class Processor{
		String no_of_cores,manufacturer ;
		 void display(){
		 	System.out.print("Pocessor manufacturer :"+manufacturer +"\n");
		 	System.out.print("NO of cores :"+no_of_cores+"\n");
		 	}
		 	}
	 	static class Ram {
		 	int memory;
		 	String manufacturer ;
		 	
		 	void display(){
		 	System.out.println("RAM Memory:"+memory);
		 	System.out.println("RAM manufacturer :"+manufacturer );
		 	}
		 	}
	 	void display(){
	 		System.out.println("Price:"+price);
	 		}
	 		}
	 		public class Cpuinfo{
	 			public static void main(String args[]){
	 			Cpu ncpu=new Cpu();
	 			
	 			
	 		Cpu.Processor processor=ncpu.new Processor();
	 		Cpu.Ram ram=new Cpu.Ram();
	 		Scanner sc=new Scanner(System.in);
	 		
	 		System.out.println("Enter the Processor Manufacturer  name:");
	 		processor.manufacturer =sc.next();
	 		
	 		System.out.println("Enter the number of cores :");
	 		processor.no_of_cores=sc.next();
	 		System.out.println("Enter the Ram size");
	 		ram.memory=sc.nextInt();
	 		
	 		System.out.println("Enter the Ram Manufacturer :");
	 		ram.manufacturer =sc.next();
	 		
	 		System.out.println("Enter the Ram price :");
	 		ncpu.price=sc.nextInt();
	 		
	 		System.out.println("\nInformation of Processor and RAM:");
	 		processor.display();
	 		ram.display();
	 		ncpu.display();
	 		}
	 		}

import java.util.Scanner;
import java.util.Arrays;

class ArraySort {
void userDef(String[] str, int length) {
int i, j;
String temp;
for (i = 0; i < length - 1; i++) {
for (j = i + 1; j < length; j++) {
if (str[i].compareTo(str[j]) > 0) {
temp = str[i];
str[i] = str[j];
str[j] = temp;
}
}
}
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
ArraySort sorter = new ArraySort();

while (true) {
System.out.println("\nMenu:");
System.out.println("1. User-defined sort");
System.out.println("2. Built-in sort");
System.out.println("3. Exit");
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
scanner.nextLine(); // Consume newline

switch (choice) {
case 1:
System.out.print("Enter the number of strings: ");
int length = scanner.nextInt();
// Consume newline
String[] strings = new String[length];
for (int i = 0; i < length; i++) {
System.out.print("Enter string " + (i + 1) + ": ");
strings[i] = scanner.next();
}
sorter.userDef(strings, length);
System.out.println("Sorted strings (User-defined): " + Arrays.toString(strings));
break;
case 2:
System.out.print("Enter the number of strings: ");
length = scanner.nextInt();
scanner.nextLine(); // Consume newline
strings = new String[length];
for (int i = 0; i < length; i++) {
System.out.print("Enter string " + (i + 1) + ": ");
strings[i] = scanner.next();
}
Arrays.sort(strings);
System.out.println("Sorted strings (Built-in): " + Arrays.toString(strings));
break;
case 3:
System.out.println("Exiting...");
scanner.close();
return; // Exit the main method
default:
System.out.println("Invalid choice. Please try again.");
}
}
}
}

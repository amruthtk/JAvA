import java.util.Scanner;

class Multiplication extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " * 5 = " + (i * 5)); // Print multiplication table
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class Prime extends Thread {
    private int limit; // Declare limit as a member variable

    // Constructor to pass the limit value
    public Prime(int limit) {
        this.limit = limit;
    }

    public void run() {
        int j;
        try {
            int n = 2, i = 1;
            while (i <= limit) {
                int f = 1;
                for (j = 2; j < n; j++) {
                    if (n % j == 0) {
                        f = 0;
                        break;
                    }
                }
                if (f == 1) {
                    System.out.println("Prime Number: " + n);
                    i++;
                }
                n++;
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class Multiprime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit for prime numbers:");
        int limit = sc.nextInt(); // Get limit for prime numbers

        Multiplication m = new Multiplication(); // Start multiplication table
        Prime p = new Prime(limit); // Pass limit to Prime thread
        
        m.start(); // Start the multiplication thread
        try {
            m.join(); // Wait for the multiplication thread to finish
        } catch (InterruptedException e) {
            System.out.println("Multiplication thread interrupted");
        }
        
        p.start(); // Start the prime number thread
    }
}


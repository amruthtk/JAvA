import java.util.Scanner;

// Base class
class Publisher {
    String publisherName;

    Publisher(String publisherName) {
        this.publisherName = publisherName;
    }

    void displayPublisher() {
        System.out.println("Publisher: " + publisherName);
    }
}

// Derived class from Publisher
class Book extends Publisher {
    String title;
    String author;

    Book(String publisherName, String title, String author) {
        super(publisherName);
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        displayPublisher();
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Literature category
class Literature extends Book {
    Literature(String publisherName, String title, String author) {
        super(publisherName, title, author);
    }

    void displayDetails() {
        System.out.println("\n--- Literature Book Details ---");
        displayBook();
    }
}

// Fiction category
class Fiction extends Book {
    Fiction(String publisherName, String title, String author) {
        super(publisherName, title, author);
    }

    void displayDetails() {
        System.out.println("\n--- Fiction Book Details ---");
        displayBook();
    }
}

// Main class
public class BookDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // consume newline

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for book " + (i + 1));
            System.out.print("Enter publisher name: ");
            String publisher = scanner.nextLine();

            System.out.print("Enter title: ");
            String title = scanner.nextLine();

            System.out.print("Enter author: ");
            String author = scanner.nextLine();

            System.out.print("Enter category (literature/fiction): ");
            String category = scanner.nextLine().toLowerCase();

            if (category.equals("literature")) {
                books[i] = new Literature(publisher, title, author);
            } else if (category.equals("fiction")) {
                books[i] = new Fiction(publisher, title, author);
            } else {
                System.out.println("Unknown category. Skipping this book.");
                i--; // retry the same index
            }
        }

        System.out.println("\n======= Book Details =======");

        for (Book book : books) {
            if (book instanceof Literature) {
                ((Literature) book).displayDetails();
            } else if (book instanceof Fiction) {
                ((Fiction) book).displayDetails();
            }
        }

        scanner.close();
    }
}


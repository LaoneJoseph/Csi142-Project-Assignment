import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjectMain {

    public static void main(String[] args) {

         // Check command-line arg for "buy mode"
        boolean buyMode = false;
        if (args.length > 0 && args[0].equalsIgnoreCase("Buy")) {
            buyMode = true;
            System.out.println("[Buy Mode Enabled]");
        }
        
        Scanner in = new Scanner(System.in);
        
        // Create a list of products
        List<Products> products = new ArrayList<>();
        products.add(new Products("Garnier", "garnier.com", 10.0, 25.0, "Face Wash", "CompanyX", "USA", "12345", 15.50, "2024-01-15", "2026-01-15"));
        products.add(new Products("PortiaM", "portiaM.com", 5.0, 18.0, "Sunscreen", "CompanyY", "Canada", "67890", 12.00, "2024-02-20", "2026-02-20"));
        products.add(new Products("CeraVe", "cerave.com", 12.0, 30.0, "Moisturizer", "CompanyZ", "UK", "13579", 22.75, "2024-03-25", "2026-03-25"));
        products.add(new Products("CetaPhil", "cetaphil.com", 8.0, 20.0, "Toner", "CompanyX", "USA", "24680", 9.99, "2024-04-30", "2026-04-30"));
        products.add(new Products("Nivea", "nivea.com", 11.0, 28.0, "Cleanser", "CompanyW", "France", "98765", 18.25, "2024-05-05", "2026-05-05"));


        System.out.println("\n--- Initial Product List ---");
        printProducts(products);
      
        List<Products> sortedByPrice = new ArrayList<>(products); 
        Sorter.selectionSortByPrice(sortedByPrice);
        System.out.println("\n--- Products Sorted by Price (Selection Sort) ---");
        printProducts(sortedByPrice);

        List<Products> sortedByName = new ArrayList<>(products);  
        Sorter.selectionSortByName(sortedByName);
        System.out.println("\n--- Products Sorted by Name (Selection Sort) ---");
        printProducts(sortedByName);


        int choice;
        do {
            // Display menu
            System.out.println("\n=== Skin car online store Menu ===");
            System.out.println("1. Display all products");
            System.out.println("2. Exit");
            if (buyMode) {
                // A feature only accessible in buy mode
                System.out.println("3. Place order");
            }
            System.out.print("Enter your choice: ");

            choice = in.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("--- All Products ---");
                    printProducts(products);
                    break;

                case 2:
                    System.out.println("Exiting Skin Care Online store...");
                    break;

                case 3:
                    // This case is only relevant if buyMode is true
                    if (buyMode) {
                        // Get order details from the user
                        System.out.print("Enter the product brand: ");
                        String brand = in.next();  // Assuming single word for brand
                        System.out.print("Enter the product product name: ");
                        String name = in.next();   // Assuming single word for product name
                        System.out.print("Enter the product price: ");
                        double price = in.nextDouble();
                        System.out.print("Enter the product Name of the buyer: ");
                        String payerName = in.next(); // Assuming single word for buyer name
                        System.out.print("Enter the product Email: ");
                        String payerEmail = in.next();
                        System.out.print("Enter the product cardHolder: ");
                        String cardHolder = in.next(); // Assuming single word for card holder
                        System.out.print("Enter the product cardNumber: ");
                        String cardNumber = in.next();

                        System.out.println("Order placed successfully!");  // Just a placeholder for now
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while(choice != 2);  // Changed to exit on 2

        in.close();
        System.out.println("Have reached the end. Have a great day!");
    
    private  printProducts(List<Products> products) {
        for (int i = 0; i < products.size(); i++) {
            Products product = products.get(i);
            System.out.println((i + 1) + ". " + product.getName() + " - Price: " + product.getPrice() + " - Brand: " + product.getBrand());
        }
    }
}

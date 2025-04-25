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

        // Create a list of products with correct constructor parameters
        List<Products> products = new ArrayList<>();
        try {
            products.add(new Products("Garnier", 1, 10.0, 25.0, "Face Wash", 12345, "CompanyX", "USA", "12345", 15.50,
                    "2024-01-15", "2026-01-15"));
            products.add(new Products("PortiaM", 2, 5.0, 18.0, "Face cotton pads", 67890, "CompanyY", "Canada", "67890", 12.00,
                    "2024-02-20", "2026-02-20"));
            products.add(new Products("CeraVe", 3, 12.0, 30.0, "Moisturizer", 13579, "CompanyZ", "UK", "13579", 22.75,
                    "2024-03-25", "2026-03-25"));
            products.add(new Products("CetaPhil", 4, 8.0, 20.0, "Face cream", 24680, "CompanyX", "USA", "24680", 9.99,
                    "2024-04-30", "2026-04-30"));
            products.add(new Products("Clicks", 5, 11.0, 28.0, "Face bar soap", 98765, "CompanyW", "France", "98765", 18.25,
                    "2024-05-05", "2026-05-05"));
        } catch (Exception e) {
            System.out.println("Error creating products: " + e.getMessage());
            in.close();
            return;
        }

        System.out.println("\n--- Initial Product List ---");
        printProducts(products);

        // Convert List to array for sorting and searching
        Products[] productsArray = products.toArray(new Products[0]);

        // Selection sort by price
        Products[] sortedByPrice = productsArray.clone();
        SC_sorter.selectionSortByPrice(sortedByPrice);
        System.out.println("\n--- Products Sorted by Price (Selection Sort) ---");
        printProducts(sortedByPrice);

        // Selection sort by name
        Products[] sortedByName = productsArray.clone();
        SC_sorter.selectionSortByName(sortedByName);
        System.out.println("\n--- Products Sorted by Name (Selection Sort) ---");
        printProducts(sortedByName);

        int choice;
        do {
            // Display enhanced menu
            System.out.println("\n=== Skin Care Online Store Menu ===");
            System.out.println("1. Display all products");
            System.out.println("2. Search product by ID (Binary Search)");
            System.out.println("3. Search product by brand (Linear Search)");
            System.out.println("4. Exit");
            if (buyMode) {
                System.out.println("5. Place order (Buy Mode Only)");
            }
            System.out.print("Enter your choice: ");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("--- All Products ---");
                    printProducts(products);
                    break;

                case 2:
                    System.out.print("Enter product ID to search: ");
                    int searchId = in.nextInt();
                    int foundIndex = SC_sorter.binarySearchRecursiveByProductID(
                            sortedByPrice, searchId, 0, sortedByPrice.length - 1);

                    if (foundIndex != -1) {
                        System.out.println("Product found:");
                        System.out.println(sortedByPrice[foundIndex]);
                    } else {
                        System.out.println("Product with ID " + searchId + " not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter brand to search: ");
                    in.nextLine(); 
                    String searchBrand = in.nextLine();
                    int linearIndex = linearSearchByBrand(productsArray, searchBrand);

                    if (linearIndex != -1) {
                        System.out.println("Product found:");
                        System.out.println(productsArray[linearIndex]);
                    } else {
                        System.out.println("Brand '" + searchBrand + "' not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Skin Care Online store...");
                    break;

                case 5:
                    if (buyMode) {
                        // Get order details from the user
                        System.out.print("Enter the product brand: ");
                        String brand = in.next(); 
                        System.out.print("Enter the product name: ");
                        String name = in.next(); 
                        System.out.print("Enter the product price: ");
                        double price = in.nextDouble();
                        System.out.print("Enter the buyer's name: ");
                        String payerName = in.next(); 
                        System.out.print("Enter the buyer's email: ");
                        String payerEmail = in.next();
                        System.out.print("Enter the card holder name: ");
                        String cardHolder = in.next(); 
                        System.out.print("Enter the card number: ");
                        String cardNumber = in.next();

                        System.out.println("Order placed successfully!");
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        in.close();
        System.out.println("Thank you for using our system!");
    }

    // Linear search by brand
    public static int linearSearchByBrand(Products[] arr, String targetBrand) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getBrand().equalsIgnoreCase(targetBrand)) {
                return i;
            }
        }
        return -1;
    }

    // Print products method overloaded for List and array
    private static void printProducts(List<Products> products) {
        for (int i = 0; i < products.size(); i++) {
            Products product = products.get(i);
            System.out.println((i + 1) + ". " + product.getName() + " - Price: " + product.getPrice() + " - Brand: "
                    + product.getBrand());
        }
    }

    private static void printProducts(Products[] products) {
        for (int i = 0; i < products.length; i++) {
            Products product = products[i];
            System.out.println((i + 1) + ". " + product.getName() + " - Price: " + product.getPrice() + " - Brand: "
                    + product.getBrand());
        }
    }
}

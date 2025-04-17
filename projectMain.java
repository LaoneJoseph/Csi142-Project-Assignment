import java.util.ArrayList;
import java.util.List;

public class ProjectMain {

    public static void main(String[] args) {
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

    }
    private static void printProducts(List<Products> products) {
        for (int i = 0; i < products.size(); i++) {
            Products product = products.get(i);
            System.out.println((i + 1) + ". " + product.getName() + " - Price: " + product.getPrice() + " - Brand: " + product.getBrand());
        }
    }
}

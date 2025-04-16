import java.util.Date;

public class Products extends FaceProductsBrands {
    private String name;
    private int productID;
    private String productionCompany;
    private String productionPlace;
    private String barcode;
    private double price;
    private String productionDate;
    private String expiry;

    public Products(String brand, String portalPage, double lowestPrice, double highestPrice,
                    String name, int productID, String productionCompany, String productionPlace, String barcode,
                    double price, String productionDate, String expiry) throws NegativePriceException {
        super(brand, portalPage, lowestPrice, highestPrice);
        this.name = name;
        this.productID = productID;
        this.productionCompany = productionCompany;
        this.productionPlace = productionPlace;
        this.barcode = barcode;
        setPrice(price);
        this.productionDate = productionDate;
        this.expiry = expiry;
    }

    // Getters
    public String getName() {
        return name;
    }
 
    public int getProductID(){
        return productID;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public String getProductionPlace() {
        return productionPlace;
    }

    public String getBarcode() {
        return barcode;
    }

    public double getPrice() {
        return price;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public String getExpiry() {
        return expiry;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setProductID(int productID){
        this.productid = productID;
    }
    
    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    public void setProductionPlace(String productionPlace) {
        this.productionPlace = productionPlace;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setPrice(double price) throws NegativePriceException {
        if (price < 0) {
            throw new NegativePriceException("Product price cannot be negative: " + price);
        }
        this.price = price;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    @Override
    public String toString() {
        return "Product{" +
               "brand='" + getBrand() + '\'' +
               ", name='" + name + '\'' +
               ", price=" + price +
               '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Products product = (Products) obj;
        return Double.compare(product.price, price) == 0 &&
               java.util.Objects.equals(name, product.name) &&
               java.util.Objects.equals(barcode, product.barcode);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, barcode, price);
    }
}

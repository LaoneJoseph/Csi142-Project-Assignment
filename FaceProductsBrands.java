

    public class FaceProductsBrands{
         private String brand;
         private int portalPage;
         private double LowestPrice;
         private double HighestPrice;

         public FaceProductsBrands(String brand, int portalPage, double LowestPrice, double HighestPrice){
            this.brand = brand;
            this.portalPage = portalPage;
            this.LowestPrice = LowestPrice;
            this.HighestPrice = HighestPrice;
         }

         public String getBrand(){return brand;}
         public int getPortalPage(){return portalPage;}
         public double getLowestPrice(){return LowestPrice;}
         public double getHighestPrice(){return HighestPrice;}

         public void setBrand(String brand){this.brand = brand;}
         public void setPortalPage(int portalPage){this.portalPage = portalPage;}
         public void setLowestPrice(double LowestPrice){this.LowestPrice = LowestPage;}
         public void setHighestPrice(double HighestPrice){this.HighestPrice = HighestPrice;}

         @Override
         public String toString(){
            return brand +" "+ portalPage +" "+LowestPrice +" - "+ HighestPrice +".\n";
         }
    }

  

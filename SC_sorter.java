public class SC_sorter {
    
    //selection sort by name
    public static void selectionSortByNameProducts(Products[] arr) {
        for (int i = 0; i < products.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < products.length; j++) {
                if (products[j].getName().compareToIgnoreCase(products[minIndex].getName()) < 0) {
                    minIndex = j;
                }
            }
            Product temp = products[minIndex];
            products[minIndex] = products[i];
            products[i] = temp;
        }
    }

    //selection sort by price
    public static void selectionSortByPriceProducts(Products[] arr) {
        for (int i = 0; i < products.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < products.length; j++) {
                if (products[j].getPrice() < products[minIndex].getPrice()) {
                    minIndex = j;
                }
            }
            Product temp = products[minIndex];
            products[minIndex] = products[i];
            products[i] = temp;
        }
    }

    //insertion sort by expiryDate
    public static void insertionSortByExpiryDateProducts(Products[] arr) {
        for (int i = 1; i < products.length; i++) {
            Product key = products[i];
            String keyDate = key.getExpDate();
            int j = i - 1;
            
            while (j >= 0 && products[j].getExpDate().compareTo(keyDate) > 0) {
                products[j + 1] = products[j];
                j = j - 1;
            }
            products[j + 1] = key;
        }
    }

    //linear search by brand
    public static int linearSearchByBrand (Products[]arr, String targetBrand){
        
        for( int i=0; i < arr.length; i++){

            if(arr[i].getBrand().equals(targetBrand)){
                return i;
            }
        }
        return -1;
    }

    //recursive binary search by productID
    public static int binarySearchRecursiveByProductID(Products []arr, int targetproductID, int low, int high){
        if (low > high ){
          return -1 ;
        }
  
        int mid = (low + high)/2;
  
        if(arr[mid].get() == targetproductID){
          return mid;
        }else if (arr[mid].getproductID() < targetproductID){
          return binarySearchRecursiveByProductID(arr, targetproductID, mid + 1, low);
        }else{
          return binarySearchRecursiveByProductID(arr, targetproductID, mid - 1,high);
        }
      }
}
  



          

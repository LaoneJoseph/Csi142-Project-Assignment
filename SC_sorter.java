public class SC_sorter {
    
    //selection sort by name
    public static void selectionSortByNameProducts(Products[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].getName().compareToIgnoreCase(arr[minIndex].getName()) < 0) {
                    minIndex = j;
                }
            }
            Product temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    //selection sort by price
    public static void selectionSortByPriceProducts(Products[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].getPrice() < arr[minIndex].getPrice()) {
                    minIndex = j;
                }
            }
            Product temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    //insertion sort by expiryDate
    public static void insertionSortByExpiryDateProducts(Products[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Product key = arr[i];
            String keyDate = keyDate.getExpiryDate();
            int j = i - 1;
            
            while (j >= 0 && arr[j].getExpiryDate().compareTo(keyDate) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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
  
        if(arr[mid].getProductID() == targetproductID){
          return mid;
        }else if (arr[mid].getProductID() < targetproductID){
          return binarySearchRecursiveByProductID(arr, targetproductID, mid + 1, high);
        }else{
          return binarySearchRecursiveByProductID(arr, targetproductID, mid - 1,high);
        }
      }
}
  



          

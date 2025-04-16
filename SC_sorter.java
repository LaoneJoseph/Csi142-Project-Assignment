public class SC_sorter {
    
    public static void selectionSortByName(Products[] arr) {
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

    public static void selectionSortByPrice(Products[] arr) {
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

    public static void insertionSortByExpiryDate(Products[] arr) {
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

    public static int binarySearchByName(Product[] products, int left, int right, String name) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getName().compareToIgnoreCase(name);
            
            if (comparison == 0) {
                return mid;
            }

            if (comparison > 0) {
                return binarySearchByName(products, left, mid - 1, name);
            }

            return binarySearchByName(products, mid + 1, right, name);
        }
        return -1;
    }

    public static int linearSearchByBrand(Products[] arr, String targetBrand) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getBrand().equals(targetBrand)) {
                return i;
            }
        }
        return -1;
    }    

    public static void selectionSortByStoreBrand(OnlineStore[] stores) {
        for (int i = 0; i < stores.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < stores.length; j++) {
                if (stores[j].getBrandName().compareToIgnoreCase(stores[minIndex].getBrandName()) < 0) {
                    minIndex = j;
                }
            }
            OnlineStore temp = stores[minIndex];
            stores[minIndex] = stores[i];
            stores[i] = temp;
        }
    }

    public static int linearSearchByStoreBrand(OnlineStore[] stores, String brandName) {
        for (int i = 0; i < stores.length; i++) {
            if (stores[i].getBrandName().equalsIgnoreCase(brandName)) {
                return i;
            }
        }
        return -1;
    }
    
    public static int binarySearchByStoreName(OnlineStore[] stores, int left, int right, String brandName) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            int comparison = stores[mid].getBrandName().compareToIgnoreCase(brandName);
            
            if (comparison == 0) {
                return mid;
            }

            if (comparison > 0) {
                return binarySearchByStoreName(stores, left, mid - 1, brandName);
            }

            return binarySearchByStoreName(stores, mid + 1, right, brandName);
        }
        return -1;
    }
}
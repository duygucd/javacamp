public class ProductManager {
    private Product Product;

    public  void Add(Product product) {
        Product  = new Product(1, "laptop", "Asus Laptop", 5000, 3, "siyah");
        System.out.println("ürün eklendi"+ product.get_name());


        }



    }


import java.util.List;

public class Main {
    public static void main(String[] args) {

       ProductService service = new ProductService();

       //Hey service, add the products..
       // Product p = new Product( "Asus Vivobook", "Laptop", "Brown Table",2022);

        service.addProduct(new Product( "Asus ", "Laptop", "Brown Table",2022));
        service.addProduct(new Product( "Ayush ", "cpu", "Red Table",2024));
        service.addProduct(new Product( "Magu ", "Camera", "Brown Table",2025));
        service.addProduct(new Product( "Haha ", "Top", "Brown Table",2025));
        service.addProduct(new Product( "Yoyo", "Monitor", "Yellow Table",2021));
        service.addProduct(new Product( "Watee", "pen drive", "Blue Table",2027));
        service.addProduct(new Product( "Jak", "Laptop", "pink Table",2028));

// Using for loop
        List<Product> products =service.getAllProducts();
         for(Product p : products){
             System.out.println(p);
         }
         System.out.print("===================================================");
    }
}

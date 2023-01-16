public class Main {
    public static void main(String[] args) {
        ProductManagers productManagers = new ProductManagers();
        Product product = new Product();
        product.id = 2;
        product.price = 45;
        product.name = "deneme";

        productManagers.add(product);
    }
}
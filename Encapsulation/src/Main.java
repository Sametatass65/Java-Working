public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.id = 1;
        product.name = "televizyon";
        product.description = "Son teknoloji";
        product.price = 12999.99;

        System.out.println(product.getKod());
    }
}
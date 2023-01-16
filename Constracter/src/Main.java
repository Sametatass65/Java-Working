public class Main {
    public static void main(String[] args) {
        Product product = new Product(12,"deneme","bu bir deneme", 12356995);

       /* Product product1 = new Product();
        product1.id = 13;
        product1.name = "telefon";
        product1.description = "orjinal spot"*/;

        System.out.println(product.getKod());
    }
}
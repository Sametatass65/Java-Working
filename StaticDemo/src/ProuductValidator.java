public class ProuductValidator {
    public static boolean isValid(Product product)
    {
        if (!product.name.isEmpty() &&  product.price > 5)
            return true;
        else
            return false;
    }
}

public class ProductManagers {
    public void add(Product product)
    {
        /*ProuductValidator prouductValidator = new ProuductValidator();*/ // static olduğu için gerek newlemeye gerek kalmadı.
        if(ProuductValidator.isValid(product))
            System.out.println("veri tabanına eklenebilir");
        else
            System.out.println("validation kurallarını sağlamadığı işin işleminiz gerçekleşmedi");
    }

}

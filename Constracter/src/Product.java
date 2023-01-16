public class Product {

    public Product(int id, String name, String description, double price)
    {
        // class newlendiğinde çalışan ilk metottur
        this.id = id;
        this.description = description;
        this.name = name;
        this.price = price;
    }
    public Product()
    {

    } // bu yukarıdaki yapıya owerloading deniyor. - aşırı yüklenme.
    int id;
    String name;
    String description;
    double price;
    private String kod;

    public String getKod()
    {
        return name.substring(0,3) + id;
    }
}

public class Product {

    /*int id;
    String name;
    String description;  // böyle tanımlandığı zaman attributler public özellikte oluyor
    double price;*/

    int id;
    String name;
    String description;
    double price;
    String kod;

    public String getKod() {
        return name.substring(0,2) + id;
    }
}

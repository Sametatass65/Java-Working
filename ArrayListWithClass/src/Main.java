import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer samet = new Customer(1,"samet","atas");
        customers.add(samet);
        customers.add(new Customer(2,"berna", "düzgün" ));

        customers.remove(samet); // remove reference type'te bulunan değeeri silemez ancak bir değerdeli verileri silebilir
        for (Customer customer : customers)
        {
            System.out.println(customer._firstName);
        }

    }
}
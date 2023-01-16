import javax.swing.plaf.IconUIResource;

public class Main {
    public static void main(String[] args) {

        CustomerManagers customerManagers = new CustomerManagers(new MySqlDatabaseManager());
        customerManagers.getCustomer();
    }
}
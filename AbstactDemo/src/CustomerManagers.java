public class CustomerManagers{
    BaseDatabaseManager _baseDataBaseManagers;

    public CustomerManagers(BaseDatabaseManager baseDatabaseManager)
    {
        _baseDataBaseManagers = baseDatabaseManager;
    }

    public void getCustomer() {
        _baseDataBaseManagers.hesapla();
    }
}

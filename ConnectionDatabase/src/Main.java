import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        IsInsert();

    }
    public static  void IsInsert() throws SQLException {
        Connection connection = null;
        DatabaseHelper databaseHelper = new DatabaseHelper();
        PreparedStatement statement = null;

        try {
            connection = databaseHelper.connection();
            String sql = "insert into category (name) values (?)"; // update ve deketeda sadece sql kod çalışıyor
            statement = connection.prepareStatement(sql);
            statement.setString(1,"inş olur");
            int ok = statement.executeUpdate();
            System.out.println(ok);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            connection.close();
        }
    }
    public static  void IsSelected()throws SQLException
    {
        Connection connection = null;
        DatabaseHelper databaseHelper = new DatabaseHelper();
        ArrayList<Category> categories = new ArrayList<Category>();
        Statement statement = null; // bunu  amacı databassede bulunan her bir cümle
        ResultSet resultSet;// db de bulunan verilerin tamamı
        try {
            connection = databaseHelper.connection(); // bağlantıyı sağladık
            statement = connection.createStatement(); // bağlantıdan yeni cümleler oluşturuyorsun
            resultSet = statement.executeQuery("select name ,id from category"); // sql konunu çalıştırıyorsun
            while(resultSet.next())
            {
                categories.add(new Category(resultSet.getString("name")
                        ,resultSet.getInt("id")));
            }
            System.out.println(categories.size());

        } catch (SQLException e) {
            databaseHelper.showErrorMessage(e);
        }finally {
            connection.close();
        }
    }
}
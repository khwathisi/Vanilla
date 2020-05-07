import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductsAbove5 {
    public void productsAbove5(Connection connection)
    {
        try
        {
            Statement statement = connection.createStatement();
            String SQL = "select * from Products\n" +
                    "where Buyprice > 500";
            ResultSet set =  statement.executeQuery(SQL);

            while (set.next())
            {
                System.out.println(set.getString("productid")+" "+
                        set.getString("productname")+" "+
                        set.getString("description")+" "+
                        set.getString("buyprice"));
            }
        }catch (SQLException e){
            System.out.println("Error: " + e);
        }
    }
}

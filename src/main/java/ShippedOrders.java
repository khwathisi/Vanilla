import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShippedOrders {
    public void shippedOrders(Connection connection)
    {
        try
        {
            Statement statement = connection.createStatement();
            String SQL = "select DISTINCT status, count(*) as numberOfOrders from Orders\n" +
                    "where status = 'Shipped'\n" +
                    "group by status";
            ResultSet set =  statement.executeQuery(SQL);

            while (set.next())
            {
                System.out.println(set.getString("numberOfOrders"));
            }
        }catch (SQLException e){
            System.out.println("Error: " + e);
        }
    }
}

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniqueOrderStatusesAndCount {
    public void uniqueOrderStatusesAndCount(Connection connection)
    {
        try
        {
            Statement statement = connection.createStatement();
            String SQL = "select DISTINCT status, count(*) as \n" +
                    "numberOfOrders from Orders group by status";
            ResultSet set =  statement.executeQuery(SQL);

            while (set.next())
            {
                System.out.println(set.getString("status")+" "+
                        set.getString("numberOfOrders"));
            }
        }catch (SQLException e){
            System.out.println("Error: " + e);
        }
    }
}

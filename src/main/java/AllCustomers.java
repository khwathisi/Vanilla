import java.nio.channels.ScatteringByteChannel;
import java.sql.*;

public class AllCustomers {
    public void allCustomers(Connection connection)
    {
        try
        {
            Statement statement = connection.createStatement();
            ResultSet set =  statement.executeQuery("select * from customers order by customerid");

            while (set.next())
            {
                System.out.println(set.getString("customerid")+" "+
                set.getString("firstname")+" "+
                set.getString("lastname")+" "+
                set.getString("gender")+" "+
                set.getString("address")+" "+
                set.getString("phone")+" "+
                set.getString("email"));
            }
        } catch(SQLException e)
        {
            System.out.println("Error: " + e);
        }
    }
}

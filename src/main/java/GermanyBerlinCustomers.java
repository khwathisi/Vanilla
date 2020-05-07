import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GermanyBerlinCustomers {
    public void germanyBerlinCustomers(Connection connection)
    {
        try
        {
            Statement statement = connection.createStatement();
            String SQL = "select * from Customers\n" +
                    "        where Country = 'Germany' and City = 'Berlin'";
            ResultSet set =  statement.executeQuery(SQL);

            while (set.next())
            {
                System.out.println(set.getString("customerid")+" "+
                        set.getString("firstname")+" "+
                        set.getString("lastname")+" "+
                        set.getString("gender")+" "+
                        set.getString("address")+" "+
                        set.getString("phone")+" "+
                        set.getString("email")+" "+
                        set.getString("city")+" "+
                        set.getString("country"));
            }
        }catch (SQLException e){
            System.out.println("Error: " + e);
        }
    }
}

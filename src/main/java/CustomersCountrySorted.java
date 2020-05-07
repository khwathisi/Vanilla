import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomersCountrySorted {
    public void customersCountrySorted(Connection connection)
    {
        try
        {
            Statement statement = connection.createStatement();
            String SQL = "select * from Customers\n" +
                    "order by Country";
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

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerNames {
    public void customerNames(Connection connection){
        try
        {
            Statement statement = connection.createStatement();
            ResultSet set =  statement.executeQuery("select firstname from customers order by customerid");

            while (set.next())
            {
                System.out.println(set.getString("firstname"));
            }
        }catch (SQLException e){
            System.out.println("Error: " + e);
        }
    }
}

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerNameID1 {
    public void customerNameID1(Connection connection)
    {
        try
        {
            Statement statement = connection.createStatement();
            String SQL = "select firstname from Customers\n" +
                    "where CustomerID = 1";
            ResultSet set =  statement.executeQuery(SQL);

            while (set.next())
            {
                System.out.println(set.getString("firstname"));
            }
        }catch (SQLException e){
            System.out.println("Error: " + e);
        }
    }
}

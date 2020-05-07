import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateCustomerNameID1 {
    public void updateCustomerNameID1(Connection connection)
    {
        try
        {
            Statement statement = connection.createStatement();
            String SQL = "update Customers\n" +
                    "set Firstname = 'Lerato', Lastname = 'Mabitso'\n" +
                    "where CustomerID = 1";
            int affected = statement.executeUpdate(SQL);

            System.out.println("Affected row(s): " + affected);
        }catch (SQLException e){
            System.out.println("Error: " + e);
        }
    }
}

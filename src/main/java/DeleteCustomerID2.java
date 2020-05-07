import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteCustomerID2 {
    public void deleteCustomerID2(Connection connection)
    {
        try
        {
            Statement statement = connection.createStatement();
            String SQL = "delete from Customers\n" +
                    "where CustomerID = 2";
            int affected = statement.executeUpdate(SQL);

            System.out.println("Affected row(s): " + affected);
        }catch (SQLException e){
            System.out.println("Error: " + e);
        }
    }
}

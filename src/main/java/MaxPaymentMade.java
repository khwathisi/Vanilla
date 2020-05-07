import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MaxPaymentMade {
    public void maxPaymentMade(Connection connection)
    {
        try
        {
            Statement statement = connection.createStatement();
            String SQL = "select max(amount) as MaxPayment from Payments";
            ResultSet set =  statement.executeQuery(SQL);

            while (set.next())
            {
                System.out.println(set.getString("MaxPayment"));
            }
        }catch (SQLException e){
            System.out.println("Error: " + e);
        }
    }
}

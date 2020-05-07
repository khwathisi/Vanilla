import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PaymentsSum {
    public void paymentsSum(Connection connection)
    {
        try
        {
            Statement statement = connection.createStatement();
            String SQL = "select sum(amount) as re\n" +
                    "from payments\n";
            ResultSet set =  statement.executeQuery(SQL);

            while (set.next())
            {
                System.out.println(set.getString("re"));
            }
        }catch (SQLException e){
            System.out.println("Error: " + e);
        }
    }
}

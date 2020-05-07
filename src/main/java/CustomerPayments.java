import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerPayments {
    public void customerPayments(Connection connection)
    {
        try
        {
            Statement statement = connection.createStatement();
            String SQL = "select p.CustomerID as cus, p.PaymentID as pay, \n" +
                    "p.PaymentDate as dat, p.Amount as amo from Payments as p\n" +
                    "inner join Customers on p.CustomerID = Customers.CustomerID";
            ResultSet set =  statement.executeQuery(SQL);

            while (set.next())
            {
                System.out.println(set.getString("cus")+" "+
                        set.getString("pay")+" "+
                        set.getString("dat")+" "+
                        set.getString("amo"));
            }
        }catch (SQLException e){
            System.out.println("Error: " + e);
        }
    }
}

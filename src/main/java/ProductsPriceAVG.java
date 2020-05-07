import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductsPriceAVG {
    public void productsPriceAVG(Connection connection)
    {
        try
        {
            Statement statement = connection.createStatement();
            String SQL = "select productName, avg(Buyprice) as avgInRands\n" +
                    ", avg(Buyprice)/12 as avgInDollars from products\n" +
                    "group by productName";
            ResultSet set =  statement.executeQuery(SQL);

            while (set.next())
            {
                System.out.println(set.getString("avgInRands")+" "+
                        set.getString("avgInDollars"));
            }
        }catch (SQLException e){
            System.out.println("Error: " + e);
        }
    }
}

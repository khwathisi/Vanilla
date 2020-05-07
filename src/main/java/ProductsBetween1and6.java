import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductsBetween1and6 {
    public void productsBetween1and6(Connection connection)
    {
        try
        {
            Statement statement = connection.createStatement();
            String SQL = "select * from Products\n" +
                    "where Buyprice between 100.00 and 600.00";
            ResultSet set =  statement.executeQuery(SQL);

            while (set.next())
            {
                System.out.println(set.getString("productid")+" "+
                        set.getString("productname")+" "+
                        set.getString("description")+" "+
                        set.getString("buyprice"));
            }
        }catch (SQLException e){
            System.out.println("Error: " + e);
        }
    }
}

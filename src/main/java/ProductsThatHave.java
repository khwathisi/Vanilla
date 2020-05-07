import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductsThatHave {
    public void productsThatHave(Connection connection)
    {
        try
        {
            Statement statement = connection.createStatement();
            String SQL = "select * from Products\n" +
                    "where Description like 'Turnable front wheels%'";
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

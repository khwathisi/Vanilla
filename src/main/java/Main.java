import java.sql.*;
public class Main {
   public static void main(String args[]){
       AllCustomers allCustomers = new AllCustomers();
       try
       {
           //Class.forName("org.postgresql.Driver");
           String loginUser = "user";
           String loginPassword = "pass";
           String loginUrl = "jdbc:postgresql://Localhost:5432/umuzi";

           Connection connection = DriverManager.getConnection(loginUrl, loginUser, loginPassword);

           allCustomers.allCustomers(connection);

       }catch (SQLException e){
           System.out.println("Error");
           System.err.println(e.getClass().getName()+": "+e.getMessage());
           System.exit(0);
       }
       System.out.println("Opened database successfully");
   }
}

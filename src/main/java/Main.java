import java.sql.*;
public class Main {
   public static void main(String args[]){
       AllCustomers allCustomers = new AllCustomers();
       CustomerNames customerNames = new CustomerNames();
       CustomerNameID1 customerNameID1 = new CustomerNameID1();
       UpdateCustomerNameID1 updateCustomerNameID1 = new UpdateCustomerNameID1();
       DeleteCustomerID2 deleteCustomerID2 = new DeleteCustomerID2();
       UniqueOrderStatusesAndCount uniqueOrderStatusesAndCount = new UniqueOrderStatusesAndCount();
       MaxPaymentMade maxPaymentMade = new MaxPaymentMade();
       CustomersCountrySorted customersCountrySorted =new CustomersCountrySorted();
       ProductsBetween1and6 productsBetween1and6 = new ProductsBetween1and6();
       GermanyBerlinCustomers germanyBerlinCustomers = new GermanyBerlinCustomers();
       DurbanCapetownCustomers durbanCapetownCustomers = new DurbanCapetownCustomers();
       ProductsAbove5 productsAbove5 = new ProductsAbove5();
       PaymentsSum paymentsSum = new PaymentsSum();
       ShippedOrders shippedOrders = new ShippedOrders();
       ProductsPriceAVG productsPriceAVG = new ProductsPriceAVG();
       CustomerPayments customerPayments = new CustomerPayments();
       ProductsThatHave productsThatHave = new ProductsThatHave();
       try
       {
           String loginUser = "user";
           String loginPassword = "pass";
           String loginUrl = "jdbc:postgresql://Localhost:5432/umuzi";
           Connection connection = DriverManager.getConnection(loginUrl, loginUser, loginPassword);

           //Please uncomment what you want to run

           //allCustomers.allCustomers(connection);
           //customerNames.customerNames(connection);
           //customerNameID1.customerNameID1(connection);
           //updateCustomerNameID1.updateCustomerNameID1(connection);
           //deleteCustomerID2.deleteCustomerID2(connection);
           //uniqueOrderStatusesAndCount.uniqueOrderStatusesAndCount(connection);
           //maxPaymentMade.maxPaymentMade(connection);
           //customersCountrySorted.customersCountrySorted(connection);
           //productsBetween1and6.productsBetween1and6(connection);
           //germanyBerlinCustomers.germanyBerlinCustomers(connection);
           //durbanCapetownCustomers.durbanCapetownCustomers(connection);
           //productsAbove5.productsAbove5(connection);
           //paymentsSum.paymentsSum(connection);
           //shippedOrders.shippedOrders(connection);
           //productsPriceAVG.productsPriceAVG(connection);
           //customerPayments.customerPayments(connection);
           productsThatHave.productsThatHave(connection);

       }catch (SQLException e){
           System.out.println("Error");
           System.err.println(e.getClass().getName()+": "+e.getMessage());
           System.exit(0);
       }
   }
}

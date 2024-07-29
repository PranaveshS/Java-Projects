import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        //create DB connection
        Connection connect= null; // to establish 
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // to mention jar file import
            //to define connection
            connect =DriverManager.getConnection("jdbc:mysql://localhost:3306/custom", "root", "system"); 
        } catch (Exception e) {
        e.printStackTrace();
        }
        //to execute query
        try{
            //to create statement to execute
            Statement stmt = connect.createStatement();
            ResultSet rs=null; //to store output
            rs = stmt.executeQuery("select * from sample"); //input your own  query
            while(rs.next()){ 
                System.out.print(rs.getInt(1));
                System.out.println(" " + rs.getString(2));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

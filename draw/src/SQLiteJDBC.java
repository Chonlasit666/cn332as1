import java.sql.*;
import java.util.ArrayList;

public class SQLiteJDBC {

   String jdbcURL = "jdbc:sqlite:test.db";

   Connection c = null;
   Statement stmt = null;


   public SQLiteJDBC() {


      try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection(jdbcURL);
         stmt = c.createStatement();
         System.out.println("Opened database successfully");
   
      
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      System.out.println("Operation done successfully");
   }

   
   public ArrayList<String[]> Getquary() throws SQLException{

      ResultSet rs = stmt.executeQuery( "SELECT * FROM Geometry;" );

      ArrayList<String[]> result = new ArrayList<String[]>();
         
      while ( rs.next() ) {
         String[] q = {rs.getString("object") ,rs.getString("location") , rs.getString("shape") , rs.getString("param1") , rs.getString("param2") ,
         rs.getString("param3") , rs.getString("degree") , rs.getString("color") };

         result.add(q);
         /*
         String  object = rs.getString("object");
         String location  = rs.getString("location");
         String shape  = rs.getString("shape");
         String param1  = rs.getString("param1");
         String param2  = rs.getString("param2");
         String param3  = rs.getString("param3");
         String degree  = rs.getString("degree");
         String color  = rs.getString("color");

         System.out.println( "object = " + object );
         System.out.println( "location = " + location );
         System.out.println( "shape = " + shape );
         System.out.println( "param1 = " + param1 );
         System.out.println( "param2 = " + param2 );
         System.out.println( "param3 = " + param3 );
         System.out.println( "degree = " + degree );
         System.out.println( "color = " + color );
         System.out.println();*/
      }
      return result;

      
   }

   

      
   }


package hotel.management.system;

import java.sql.*;  
public class Conn {
    Connection c;
     Statement s;
    Conn(){
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
         c =DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem","root","Himani@0901"); 
             s =c.createStatement(); 
        }
        catch(Exception e){
           e.printStackTrace();
        }
    }
}

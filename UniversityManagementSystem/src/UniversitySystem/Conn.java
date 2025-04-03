
package UniversitySystem;

import java.sql.*;

public class Conn {
    Connection c ;
    Statement s ;
    
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root"); // database name , username , password
            s=c.createStatement();
            System.out.print("conn establish");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        new Conn();
    }
}

//Database Table Example:
//CREATE TABLE students(
//id INT PRIMARY KEY,
//name VARCHAR(50),
//marks INT
//);

//Java CRUD Program
// JDBC CRUD Operations Example

import java.sql.*;

public class JDBCExample {

    public static void main(String[] args) {

        try {

            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root",
                    "password");

            Statement stmt = con.createStatement();

            // CREATE
            stmt.executeUpdate("INSERT INTO students VALUES(1,'Alice',90)");

            // READ
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while(rs.next()){

                System.out.println(
                        rs.getInt("id")+" "+
                        rs.getString("name")+" "+
                        rs.getInt("marks")
                );
            }

            // UPDATE
            stmt.executeUpdate("UPDATE students SET marks=95 WHERE id=1");

            // DELETE
            stmt.executeUpdate("DELETE FROM students WHERE id=1");

            con.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

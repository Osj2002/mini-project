import java.sql.*;
public class createTable {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/student_database";
        String user = "root";
        String password = "DB_PASSWORD";

        try(Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement()){

            String sql = "CREATE TABLE students (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT," +
                    "name VARCHAR(50)," + "GPA DECIMAL(3,2)," + "Department VARCHAR(50),"+
                    "age INT)";

            stmt.executeUpdate(sql);
            System.out.println("Table created successfully");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}


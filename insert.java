
import java.sql.*;

public class insert {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/student_database";
        String user = "root";
        String password = "DB_PASSWORD";

        try(Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement()){

            String sql = "INSERT INTO students (name, GPA,Department,age) VALUES "
                    + "('Jone', 3.1,'Chemistry',22), "
                    + "('Alice', 2.9,'Maths',23), "
                    + "('Bob', 3.8,'Statistics',21)";
            int rows= stmt.executeUpdate(sql);

            System.out.println(" "+rows+ "records inserted");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

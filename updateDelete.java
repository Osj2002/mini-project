import java.sql.*;
public class updateDelete {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/student_database";
        String user = "root";
        String password = "DB_PASSWORD";

        try(Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement()){

            String updateSql = "UPDATE students SET age=24 WHERE name='Alice'";
            int update = stmt.executeUpdate(updateSql);
            System.out.println(" " + update + " record updated.");

            String deleteSql = "DELETE FROM students WHERE name='Bob'";
            int deleted = stmt.executeUpdate(deleteSql);
            System.out.println(" " + deleted + " records deleted");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/A";
        String user = "root";
        String pwd = "Abc#123as!";
        System.out.println("Connecting...");
        try(Connection connection = DriverManager.getConnection(url,user,pwd)){
            System.out.println("Connection sucessful!");
        }catch (SQLException e){
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/studentinfomanagement?serverTimezone=UTC&characterEncoding=utf8&useUnicode=true&useSSL=false";
        String user = "root";
        String password = "momo0918";
        //定义一个conn对象接收返回值
        Connection conn = DriverManager.getConnection(url,user,password);
        //如果返回的conn不是null则，打印连接成功，否则失败
        if (conn!=null){
            System.out.println("连接成功");
        }else
            System.out.println("连接失败");
    }

}

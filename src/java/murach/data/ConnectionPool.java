
package murach.data;
import java.sql.*;
import javax.sql.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;
public class ConnectionPool {
    
	  static final String DB_URL = "jdbc:mysql://localhost:3306/cart";
	  static final String USER = "root";
	  static final String PASS = "0987128494";

	  public static Connection getConnection()  throws SQLException
	  {
	     try {
	       Class.forName("com.mysql.jdbc.Driver");
	     } catch (ClassNotFoundException e) {
	       e.printStackTrace();
	     }
	    Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    return conn;
	  }

}

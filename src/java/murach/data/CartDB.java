package murach.data;

import java.sql.*;
import java.util.ArrayList;
import murach.business.Cart;

public class CartDB extends ConnectionPool {
    public static void insert(Cart cart){
                String query="insert into cart_table(code,des,price) values (?,?,?);";
 
    try (
      Connection connection = getConnection();
      PreparedStatement ps = connection.prepareStatement(query);
    ) {
            ps.setString(1, cart.getCode());
            ps.setString(2, cart.getDes());
            ps.setFloat(3, cart.getPrice());
            ps.executeUpdate();
    } catch (Exception e) {
      //TODO: handle exception
      e.printStackTrace();
    }
    }  

  public static ArrayList<Cart> getAll()
  {
    ArrayList<Cart> list = new ArrayList<>();
    String sql = "SELECT * FROM cart_table;";
    try (
      Connection connection = getConnection();
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
    ) {
      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next())
      {
        String code = resultSet.getString("code");
        String des = resultSet.getString("des");
        float price = resultSet.getFloat("price");
        Cart cart = new Cart(code,des,price);
        list.add(cart);
      }
    } catch (Exception e) {
      //TODO: handle exception
      e.printStackTrace();
    }
    return list;
  }
  
  
 public static Cart getCart(String sCode)
  {
    Cart tmpCart= new Cart();
    String sql = "SELECT * FROM cart_table where code = ?;";
    try (
      Connection connection = getConnection();
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
    ) {
      preparedStatement.setString(1, sCode);
      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next())
      {
        String code = resultSet.getString("code");
        String des = resultSet.getString("des");
        float price = resultSet.getFloat("price");
        Cart cart = new Cart(code,des,price);
        return cart;
      }
    } catch (Exception e) {
      //TODO: handle exception
      e.printStackTrace();
    }
    return tmpCart;
  }

 
    public static void update(Cart cart, String sCode){
                String query="update cart_table set code = ? , des = ? , price = ? where code =?";
 
    try (
      Connection connection = getConnection();
      PreparedStatement ps = connection.prepareStatement(query);
    ) {
        
            ps.setString(1, cart.getCode());
            ps.setString(2, cart.getDes());
            ps.setFloat(3, cart.getPrice());
            ps.setString(4, sCode);

            ps.executeUpdate();
    } catch (Exception e) {
      //TODO: handle exception
      e.printStackTrace();
    }
    }  

       public static void delete(String sCode){
                String query="delete from cart_table where code =?";
 
    try (
      Connection connection = getConnection();
      PreparedStatement ps = connection.prepareStatement(query);
    ) {
        

            ps.setString(1, sCode);

            ps.executeUpdate();
    } catch (Exception e) {
      //TODO: handle exception
      e.printStackTrace();
    }
    }  
  
}

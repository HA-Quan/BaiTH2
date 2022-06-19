
package murach.cart;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import murach.business.Cart;
import murach.data.CartDB;


@WebServlet(urlPatterns = "/edit")
public class EditServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Cart cart = CartDB.getCart( request.getParameter("code"));
        request.setAttribute("cart", cart);
        getServletContext()
                .getRequestDispatcher("/Update.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        String sCode = request.getParameter("code");
        String pCode = request.getParameter("pCode");
        String pDes = request.getParameter("pDes");
        float pPrice = Float.parseFloat(request.getParameter("pPrice"));
        Cart cart = new Cart(pCode,pDes,pPrice);
        CartDB.update(cart,sCode);
        response.sendRedirect(request.getContextPath()+"/show");
        
    }

}

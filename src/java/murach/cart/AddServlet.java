package murach.cart;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import murach.business.Cart;
import murach.data.CartDB;

@WebServlet(urlPatterns= "/add")
public class AddServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String pCode = request.getParameter("pCode");
        String pDes = request.getParameter("pDes");
        float pPrice = Float.parseFloat(request.getParameter("pPrice"));

        Cart cart = new Cart(pCode,pDes,pPrice);
        CartDB.insert(cart);
        
        response.sendRedirect(request.getContextPath()+"/show");
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
    getServletContext()
                .getRequestDispatcher("/Add.jsp")
                .forward(request, response);    
    }
}

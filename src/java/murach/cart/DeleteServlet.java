/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murach.cart;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import murach.business.Cart;
import murach.data.CartDB;

/**
 *
 * @author PC
 */
@WebServlet(urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cart cart = CartDB.getCart( request.getParameter("code"));
        request.setAttribute("cart", cart);
        getServletContext()
                .getRequestDispatcher("/Delete.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sCode = request.getParameter("code");
        CartDB.delete(sCode);
        response.sendRedirect(request.getContextPath()+"/show");
    }
}

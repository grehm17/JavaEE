package servlets;

import entities.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = 20;
        Product thisProd = new Product(id);
        getServletContext().setAttribute("prod", thisProd);
        getServletContext().getRequestDispatcher("/WEB-INF/pages/Product.jsp").forward(req,resp);
    }
}

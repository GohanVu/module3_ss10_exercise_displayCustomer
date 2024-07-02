package servlet;

import model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1, "Mai Văn Hoàn", "1983-08-20", "Hà Nội","/img/pic1.png"));
        customerList.add(new Customer(2, "Nguyễn Văn Nam", "1983-08-21", "Bắc Giang","/img/pic2.jpg"));
        customerList.add(new Customer(3, "Nguyễn Thùy Hoa", "1983-08-22", "Nam Định","/img/pic3.jpeg"));
        customerList.add(new Customer(4, "Trần Ngọc Mai", "1983-08-17", "Hà Tây","/img/pic4.jpg"));
        req.setAttribute("customerList", customerList);
        req.getRequestDispatcher("/customer.jsp").forward(req,resp);
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}

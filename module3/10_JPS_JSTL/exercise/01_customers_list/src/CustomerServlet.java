import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = {""})
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Mai Văn Hoàng", "1983-08-20", "Hà Nội", "https://cellphones.com.vn/sforum/wp-content/uploads/2020/04/LR-29-scaled.jpg"));
        customerList.add(new Customer("Nguyễn Văn Nam", "1983-08-20", "Hà Nội", "https://cellphones.com.vn/sforum/wp-content/uploads/2020/04/LR-29-scaled.jpg"));
        customerList.add(new Customer("Nguyễn Thái Hòa", "1983-08-20", "Hà Nội", "https://cellphones.com.vn/sforum/wp-content/uploads/2020/04/LR-29-scaled.jpg"));
        customerList.add(new Customer("Trần Văn Khoa", "1983-08-20", "Hà Nội", "https://cellphones.com.vn/sforum/wp-content/uploads/2020/04/LR-29-scaled.jpg"));
        customerList.add(new Customer("Nguyễn Đình Thi", "1983-08-20", "Hà Nội", "https://cellphones.com.vn/sforum/wp-content/uploads/2020/04/LR-29-scaled.jpg"));
        request.setAttribute("temp",customerList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("list.jsp");
        requestDispatcher.forward(request,response);
    }
}

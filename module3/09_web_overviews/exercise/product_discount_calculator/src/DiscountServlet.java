import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet",value = "/display-discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double discount_amount = Double.parseDouble(request.getParameter("product-price"));
        Double discount_price = Double.parseDouble(request.getParameter("product-discount"));
        Double result = discount_amount*discount_price* 0.01;
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>" +
                "<h2>Chiếc khấu là : "+result+"</h2>" +
                "</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

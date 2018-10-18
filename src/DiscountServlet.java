import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/display-discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("Description");
        double listprice = Double.parseDouble(request.getParameter("ListPrice")) ;
        double discount = Double.parseDouble(request.getParameter("Discount"));
        double Discount_Amount = listprice * discount * 0.1;
        double Discount_Price = Discount_Amount - listprice;

        PrintWriter writer = response.getWriter();

        writer.println("<html>");

        writer.println("<p>Product Description: " + description + "</p>");
        writer.println("<p>List Price: $" + listprice + "</p>");
        writer.println("<p>Dicount: " + discount + "%</p>");
        writer.println("<p>Discount Amount: $" + Discount_Amount + "</p>");
        writer.println("<p>Discount Price: $" + Discount_Price + "</p>");

        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

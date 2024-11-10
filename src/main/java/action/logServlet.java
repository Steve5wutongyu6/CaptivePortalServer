package action;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.Time;
import java.util.Date;

@WebServlet("/logServlet")
public class logServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String deviceIp = request.getParameter("deviceIp");
        //获取访问者IP
        deviceIp = request.getRemoteAddr();
        Date Time = new Date();
        System.out.println("IP: {"+deviceIp+"} LogTime: {"+Time+"}");
        response.sendError(204);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
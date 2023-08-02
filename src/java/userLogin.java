import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class userLogin extends HttpServlet 
{
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
        res.setContentType("text/html");
        PrintWriter pw1 = res.getWriter();
        String uname = null;
        String role = "user";
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            Statement stmt = con.createStatement();
            String q1 = "Select role from userDetails where username='"+username+"'";
            ResultSet usr = stmt.executeQuery(q1);
            while(usr.next())
                uname = usr.getString(1);
            String q2 = "Select * from userDetails where username='"+username+"' and password='"+password+"'";
            ResultSet rs=stmt.executeQuery(q2);
            if (rs.next())
            {
                if(uname.equals(role)) {
                    HttpSession ses = req.getSession();
                    ses.setAttribute("username", username);
                    res.sendRedirect("loginSuccess.html");
                }
                else {
                    HttpSession ses = req.getSession();
                    ses.setAttribute("username", username);
                    res.sendRedirect("loginSuccessAdmin.html");
                }
            }
            else
            {
                pw1.println("Login Failed...");
                pw1.println(uname);
                con.close();
            }
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
            
}
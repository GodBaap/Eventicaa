import java.io.*;
import java.sql.*;
import javax.servlet.*;//for getting the GenricServlet class
import javax.servlet.http.*;//for getting the HttpServlet class

public class userRegister extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String name=req.getParameter("name");
        String username=req.getParameter("username");
        String email=req.getParameter("email");
        String password=req.getParameter("password");
        String contact=req.getParameter("contact");
        String gender=req.getParameter("gender");
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            Statement stmt=con.createStatement();
            String q1="insert into userDetails values('"+name+"','"+username+"','"+email+"','"+password+"','"+contact+"','','','"+gender+"','user')";
            int x=stmt.executeUpdate(q1);
            if(x>0)
            {
                pw1.println("Registration Success!<body><a href=index.jsp> Please Login here</a></body>");
            }
            else
            {
                pw1.println("Insert Unuccess");
                con.close();
            }
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
}
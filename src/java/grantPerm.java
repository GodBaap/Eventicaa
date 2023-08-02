import java.io.*;
import java.sql.*;
import javax.servlet.*;//for getting the GenricServlet class
import javax.servlet.http.*;//for getting the HttpServlet class

public class grantPerm extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String uname = null;
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            Statement stmt=con.createStatement();
            
            String q0 = "Select username from eventDetails where status='pending'";
            ResultSet rs = stmt.executeQuery(q0);
            while(rs.next()){
                uname = rs.getString(1);
            }
            String q1 = "update eventDetails set status='granted' where username='" + uname + "'"; 
            int x = stmt.executeUpdate(q1);
            if(x>0){
                pw1.println("Permission Granted");
                pw1.println(uname);
            }
            else {
                pw1.println("Permission Not Granted");
                con.close();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
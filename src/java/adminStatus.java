import java.io.*;
import java.sql.*;
import javax.servlet.*;//for getting the GenricServlet class
import javax.servlet.http.*;//for getting the HttpServlet class

public class adminStatus extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            Statement stmt=con.createStatement();
            
            String q1 = "select * from eventDetails where status='pending'";
            
            ResultSet rs = stmt.executeQuery(q1);
            while(rs.next()){
                pw1.println("Username : " + rs.getString(1));
                pw1.println("Event : " + rs.getString(2));
                pw1.println("Date : " + rs.getString(3));
                pw1.println("Location : " + rs.getString(4));
                pw1.println("Occupancy : " + rs.getString(5));
                pw1.println("Cuisine : " + rs.getString(6));
                pw1.println("Theme : " + rs.getString(7));
                pw1.println("Status : " + rs.getString(8));
                pw1.println("<FORM METHOD =POST ACTION = grantPerm>" +
                            "<INPUT TYPE = SUBMIT VALUE = GRANT></FORM>");
            }
           
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
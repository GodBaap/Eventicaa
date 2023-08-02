import java.io.*;
import java.sql.*;
import javax.servlet.*;//for getting the GenricServlet class
import javax.servlet.http.*;//for getting the HttpServlet class

public class eventRegistration extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String event=req.getParameter("event");
        String event_date=req.getParameter("event_date");
        String location=req.getParameter("location");
        String occupancy=req.getParameter("occupancy");
        String cuisine=req.getParameter("cuisine");
        String theme=req.getParameter("theme");
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            Statement stmt=con.createStatement();
            
            HttpSession ses = req.getSession();
            String username = (String)ses.getAttribute("username");
            
            String q1="insert into eventDetails values('"+username+"','"+event+"','"+event_date+"','"+location+"','"+occupancy+"','"+cuisine+"','"+theme+"','pending')";
            int x=stmt.executeUpdate(q1);
            if(x>0)
            {
                pw1.println("Insert Success");
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
package com.ep.Display;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ep.Bean.StudentBean;
import com.ep.Connection.DBUtil;

public class StudentDisplay
{
public void StudentDisplay(StudentBean student) throws ClassNotFoundException, SQLException
{
Connection con1 = DBUtil.DBConnection();
     String query = " select * from StudentBean";
     PreparedStatement stmt = con1.prepareStatement(query);      
     ResultSet rs = stmt.executeQuery();
     while(rs.next())
     {
     System.out.println(rs.getLong(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " ");
     }
   
con1.close();
}

}
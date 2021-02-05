package com.ep.Updation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ep.Bean.StudentBean;
import com.ep.Connection.DBUtil;

public class StudentUpdation
{
public int StudentUpdate(StudentBean student) throws ClassNotFoundException, SQLException
{
Connection con1 = DBUtil.DBConnection();
   String query = " update StudentBean set name = ?, email = ?, location = ? where id = ?";
     PreparedStatement stmt = con1.prepareStatement(query);
   
     stmt.setLong(1, student.getId());
     stmt.setString(2, student.getName());
     stmt.setString(3, student.getEmail());
   int n = stmt.executeUpdate();
     
con1.close();
return n;
}

}
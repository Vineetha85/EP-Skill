package com.ep.Insertion;

import com.ep.Bean.*;
import com.ep.Insertion.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ep.Bean.StudentBean;
import com.ep.Connection.DBUtil;

public class StudentInsertion
{
public int StudentInsert(StudentBean student) throws ClassNotFoundException, SQLException
{
Connection con1 = DBUtil.DBConnection();
     String query = " insert into StudentBean (id, name, email, location)" + " values (?, ?, ?, ?)";
     PreparedStatement preparedStmt = con1.prepareStatement(query);
     
     preparedStmt.setLong (1, student.getId());
     preparedStmt.setString (2, student.getName());
     preparedStmt.setString  (3, student.getEmail());
     int n = preparedStmt.executeUpdate();
     
     con1.close();
   
return n;
}

}

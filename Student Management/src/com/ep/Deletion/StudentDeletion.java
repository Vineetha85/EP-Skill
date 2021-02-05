package com.ep.Deletion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ep.Bean.StudentBean;
import com.ep.Connection.DBUtil;

public class StudentDeletion {
	public int StudentDelete(StudentBean student) throws ClassNotFoundException, SQLException
	{
	Connection con1 = DBUtil.DBConnection();
	     String query = " delete from StudentBean where id = (?) ";
	     PreparedStatement preparedStmt = con1.prepareStatement(query);
	     preparedStmt.setLong (1, student.getId());
	     int n = preparedStmt.executeUpdate();
	     
	con1.close();
	return n;
	}

}

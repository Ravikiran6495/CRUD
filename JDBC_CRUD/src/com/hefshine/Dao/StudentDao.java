package com.hefshine.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hefshine.bean.Student;

public class StudentDao {

	String url = "jdbc:mysql://localhost:3306/hefshine";
	String username = "root";
	String password = "root";

	public List getRecords() {
		List studentsList = new ArrayList();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pst = con.prepareStatement("select * from student");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Student student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3));
				studentsList.add(student);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return studentsList;
	}

	public void saveRecord(Student student) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?)");
			pst.setInt(1, student.getRollnumber());
			pst.setString(2, student.getFirstname());
			pst.setString(3, student.getLastname());

			int rs = pst.executeUpdate();
			System.out.println("Added");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public void updateRecord(Student student) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pst = con
					.prepareStatement("update student set firstname=?, lastname=? where rollnumber=?");

			pst.setString(1, student.getFirstname());
			pst.setString(2,student.getLastname());

			pst.setInt(3, student.getRollnumber());
			
			int updatedRows = pst.executeUpdate();

			System.out.println(updatedRows + " record updated");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	public void deleteData(Student student) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pst = con
					.prepareStatement("delete from student where rollnumber=?");


			pst.setInt(1, student.getRollnumber());
			
			int updatedRows = pst.executeUpdate();

			System.out.println(updatedRows + " deleted");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}


}
package com.hefshine.Test;

import com.hefshine.Dao.StudentDao;
import com.hefshine.bean.Student;

public class UpdateRecord {

	
	
	public static void main(String[] args) {
		
		
		Student student=new Student(1,"sachin","hbj"); 
		StudentDao sd = new StudentDao();
		 sd.updateRecord(student);


	}
}

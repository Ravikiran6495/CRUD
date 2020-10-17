package com.hefshine.Test;

import java.util.List;

import com.hefshine.Dao.StudentDao;
import com.hefshine.bean.Student;

public class SaveTest {

	
	public static void main(String[] args) {
		
		
		Student student=new Student(2,"hk","nhkyg"); 
		StudentDao sd = new StudentDao();
		
		
		
		 sd.saveRecord(student);


	}
}

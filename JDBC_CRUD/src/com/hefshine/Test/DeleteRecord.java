package com.hefshine.Test;

import com.hefshine.Dao.StudentDao;
import com.hefshine.bean.Student;

public class DeleteRecord {

	public static void main(String[] args) {

		Student student = new Student(2);
		StudentDao sd = new StudentDao();

		sd.deleteData(student);

	}

}

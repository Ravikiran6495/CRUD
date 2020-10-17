package com.hefshine.Test;

import java.util.Iterator;
import java.util.List;

import com.hefshine.Dao.StudentDao;

public class Test {

	public static void main(String[] args) {

		StudentDao sd = new StudentDao();
		List studentsList = sd.getRecords();

		System.out.println("gkuyh");

		Iterator iterator = studentsList.iterator();

		while (iterator.hasNext()) {

			com.hefshine.bean.Student student = (com.hefshine.bean.Student) iterator.next();
			System.out.println(student);
		}

		System.out.println("Done");
	}

}

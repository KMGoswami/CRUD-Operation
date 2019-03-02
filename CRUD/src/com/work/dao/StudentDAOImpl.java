/**
 * @author : Kartavya Goswami
 */
package com.work.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.work.entity.Student;

@Repository("studentDao")
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveStudentObj(Student student) {
		sessionFactory.getCurrentSession().saveOrUpdate(student);
		
	}

	public List<Student> getAllStudents() {
		/*Change the name table according to your databse.*/
		return sessionFactory.getCurrentSession().createQuery("from Student").list();
	}

	public Student getStudentObbj(String studentName) {
		Student student = sessionFactory.getCurrentSession().get(Student.class, studentName);
		return student;
	}

	public void deleteStudentObj(Student student) {
		sessionFactory.getCurrentSession().delete(student);
	}
	

}

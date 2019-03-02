/**
 * @author kartavya goswami
 */
package com.work.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.dao.StudentDAO;
import com.work.entity.Student;

@Service
public class StudentServiceImplo implements StudentService{

	@Autowired
	private StudentDAO studentDAO;
	
	@Transactional
	public void saveStudentObj(Student student) {
		studentDAO.saveStudentObj(student);
	}

	@Transactional
	public List<Student> getAllStudents() {
		return studentDAO.getAllStudents();
	}

	@Transactional
	public Student getStudentObj(String studentName) {
		return studentDAO.getStudentObbj(studentName);
	}

	@Transactional
	public void deleteStudentObj(Student student) {
		// TODO Auto-generated method stub
		studentDAO.deleteStudentObj(student);
	}
	
	

}

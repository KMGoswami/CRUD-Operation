/**
 * @author : Kartavya Goswami
 */
package com.work.service;

import java.util.List;

import com.work.entity.Student;

public interface StudentService {

	public void saveStudentObj(Student student);

	public List<Student> getAllStudents();

	public Student getStudentObj(String studentName);

	public void deleteStudentObj(Student student);

}

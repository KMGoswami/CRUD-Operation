/**
 * @author : Kartavya Goswami
 */
package com.work.dao;

import java.util.List;

import com.work.entity.Student;

public interface StudentDAO {

	public void saveStudentObj(Student student);

	public List<Student> getAllStudents();

	public Student getStudentObbj(String studentName);

	public void deleteStudentObj(Student student);

}

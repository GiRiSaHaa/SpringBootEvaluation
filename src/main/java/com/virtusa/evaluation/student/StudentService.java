package com.virtusa.evaluation.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private List<Student> students = new ArrayList<> (Arrays.asList(
			new Student("1","test1","address1"),
			new Student("2","test2","address2"),
			new Student("3","test3","address3")
			));	
	
	public List<Student> getAllStudents(){
		return students;
	}

	public Student getStudent(String id) {
		return students.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void updateStudent(String id, Student student) {
		for (int i = 0; i < students.size(); i++) {
			Student t = students.get(i);
			if(t.getId().equals(id)) {
				students.set(i, student);
				return;
			}
		}
	}

	public void deleteStudent(String id) {
		students.removeIf(t -> t.getId().equals(id));
	}
}


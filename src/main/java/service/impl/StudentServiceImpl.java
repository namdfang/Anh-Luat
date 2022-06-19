package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Student;
import repository.StudentRepository;
import service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void createStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}
	
}

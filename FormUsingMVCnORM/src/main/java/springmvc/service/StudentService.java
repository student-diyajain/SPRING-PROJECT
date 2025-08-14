package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.StudentDao;
import springmvc.model.Student;

@Service
public class StudentService {
@Autowired
private StudentDao studentDao;

public int createStudent(Student student) {
	 int i=studentDao.insert(student);
	 return i;
}
	
}

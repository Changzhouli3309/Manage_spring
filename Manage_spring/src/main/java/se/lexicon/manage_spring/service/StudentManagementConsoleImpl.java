package se.lexicon.manage_spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.lexicon.manage_spring.data.StudentDao;
import se.lexicon.manage_spring.models.Student;
import se.lexicon.manage_spring.util.UserInputService;

@Service
public class StudentManagementConsoleImpl implements StudentManagement {
	private UserInputService input;
	private StudentDao stDao;

	@Autowired
	public StudentManagementConsoleImpl(UserInputService scannerService, StudentDao studentDaoListImp) {
		this.input = scannerService;
		this.stDao = studentDaoListImp;
	}

	@Override
	public Student create() {
		System.out.print("Name: ");
		return stDao.save(new Student(input.getNoEmptyString()));
		
	}
	
	@Override
	public Student save(Student s) {
		return stDao.save(s);
		
	}
	@Override
	public Student find(int id) {
		return stDao.find(id);
		
	}
	@Override
	public Student remove(int id) {
		Student re = stDao.find(id);
		stDao.delete(id);
		return re;
		
	}
	@Override
	public List<Student> findAll() {
		return stDao.findAll();
		
	}
	@Override
	public Student edit(Student student) {
		System.out.print("New name: ");
		student.setName(input.getNoEmptyString());
		return student;
	}

}

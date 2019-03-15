package se.lexicon.manage_spring.service;

import java.util.List;

import se.lexicon.manage_spring.models.Student;

public interface StudentManagement {

	Student create();

	Student save(Student s);

	Student find(int id);

	Student remove(int id);

	List<Student> findAll();

	Student edit(Student student);

}
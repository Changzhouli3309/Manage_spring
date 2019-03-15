package se.lexicon.manage_spring.models;

public class Student {
	private static int sequencer = 0;
	private final int id;
	private String name;
	
	public Student(String name) {
		id = ++sequencer;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

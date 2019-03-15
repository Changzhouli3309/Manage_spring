package se.lexicon.manage_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import se.lexicon.manage_spring.models.Student;
import se.lexicon.manage_spring.service.StudentManagement;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MConfig.class);

    	StudentManagement sM = context.getBean(StudentManagement.class); 
    	
    	sM.save(new Student("test1"));
    	sM.save(new Student("test2"));
    	sM.save(new Student("test3"));
 
    	System.out.println("find all");
    	sM.findAll().forEach(System.out::println);
    	
    	System.out.println("\nnew student");
    	System.out.println(sM.create());
    	
    	System.out.println("\nedit student id=1");
    	System.out.println(sM.edit(sM.find(1)));
    	
    	System.out.println("\nfind by id=2");
    	System.out.println(sM.find(2));
    	
    	System.out.println("\nremove id=2");
    	System.out.println(sM.remove(2));	
    	
    	System.out.println("\nresult");
    	sM.findAll().forEach(System.out::println);
    	
    	context.close();
    }
}

package esprit.tn.soa.repository;

import java.util.ArrayList;
import java.util.List;

import esprit.tn.soa.entity.Student;

public class StudentRepository {

	private final List<Student> students;
	 Student s = new Student("22551100","Mohamed ben salah","med.salah@esprit.tn");

	public StudentRepository() {
		students = new ArrayList();
		students.add(new Student("01234567780","Test ben TEST","test@esprit.tn"));
		students.add(new Student("22551100","Mohamed ben salah","med.salah@esprit.tn"));
	}
	public List<Student> getAllStudents(){
		return students;
	}
	public Student Recherche(String cin)
	{ for(int i=1;i<students.size();i++)
		if(students.get(i).getCin().equals(cin))
		return (students.get(i));
	return null;
		
	}
	public void saveStudent(Student student)
	{
		students.add(student);
	}

}
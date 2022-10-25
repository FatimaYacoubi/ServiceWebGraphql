package esprit.tn.soa.graphql;

import esprit.tn.soa.repository.StudentRepository;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import esprit.tn.soa.entity.Student;

public class Query implements GraphQLRootResolver {
	private final StudentRepository studentRepository;
	public Query(StudentRepository studentRepository)
	{
		this.studentRepository = studentRepository;

}
	public List<Student> allStudents(){
		return studentRepository.getAllStudents();
	}
	public Student Students(String cin){
		return studentRepository.Recherche(cin);
	}
}
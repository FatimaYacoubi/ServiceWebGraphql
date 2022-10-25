package esprit.tn.soa.graphql;
import esprit.tn.soa.graphql.Query;

import javax.servlet.annotation.WebServlet;
import esprit.tn.soa.repository.StudentRepository;

import com.coxautodev.graphql.tools.SchemaParser;

import esprit.tn.soa.repository.StudentRepository;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;

@WebServlet(urlPatterns="/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {
	public GraphQLEndpoint()
	{
		super(buildSchema());
	}
private static GraphQLSchema buildSchema()
{ StudentRepository studentRepository = new StudentRepository();
return SchemaParser .newParser()
		.file("schema.graphqls")
		.resolvers(new Query(studentRepository))
		.build()
		.makeExecutableSchema();
	}
}

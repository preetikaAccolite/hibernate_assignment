package JDBCpractice.hibernateprtc;

import java.util.Properties;

import Entity.Address;
import Entity.Author;
import Entity.Book;
import Entity.Emp;
import Entity.Employee;
import Entity.Project;
import Entity.Student;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;


public class HibernateUnit {

    public static SessionFactory getSessionFactory(){
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = null;

        Properties settings = new Properties();
        settings.put(Environment.DRIVER, "org.hsqldb.jdbc.JDBCDriver");
        settings.put(Environment.URL, "jdbc:hsqldb:mem:myDb");
        settings.put(Environment.USER, "sa");
        settings.put(Environment.PASS, "sa");
        settings.put(Environment.SHOW_SQL, "true");
        settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        settings.put(Environment.HBM2DDL_AUTO, "create-drop");

        configuration.setProperties(settings);
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(Address.class);
        configuration.addAnnotatedClass(Student.class);
        configuration.addAnnotatedClass(Book.class);
        configuration.addAnnotatedClass(Author.class);
        configuration.addAnnotatedClass(Emp.class);
        configuration.addAnnotatedClass(Project.class);
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();

        sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        return sessionFactory;
    }

}
package JDBCpractice.hibernateprtc;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Entity.Address;
import Entity.Author;
import Entity.Book;
import Entity.Emp;
import Entity.Employee;
import Entity.Project;
import Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee employee=new Employee();
        employee.setEmpName("Preetika Kandpal");
        employee.setEmpEmail("Preetika@gmail.com");
        Employee employee1=new Employee();
        employee1.setEmpName("Preetika khanna");
        employee1.setEmpEmail("Pree@gmail.com");
        SessionFactory sessionfactory=HibernateUnit.getSessionFactory();
        Session session=sessionfactory.openSession();
        session.beginTransaction();
        session.persist(employee);
        session.persist(employee1);
        //session.getTransaction().commit();
        session.createQuery("from Employee",Employee.class).list().forEach(System.out::println);
        Employee savedEmployee = session.get(Employee.class, 1L);
        System.out.println(savedEmployee);
        employee1.setEmpName("tanya sharma");
        session.merge(employee1);
        session.remove(employee1);
		 session.getTransaction().commit();
		 session.createQuery("from Employee",Employee.class).list().forEach(System.out::println);
//	        Employee savedEmployee1= session.get(Employee.class, 1L);
//	        System.out.println(savedEmployee1);
        session.close();
        SessionFactory factory=HibernateUnit.getSessionFactory();
        System.out.println(factory);
        Address adds=new Address();
        adds.setPermanentadd("cannaut place,new delhi");
        adds.setId(101);
        Student st=new Student();
        st.setStudentId(101);
        st.setStudentName("tanya");
        st.setStudentEmail("tkabc@gmail.com");
        st.setPermanentadd(adds);
        Session session1=factory.openSession();
        
        Transaction ts=session1.beginTransaction();
        session1.persist(adds);
        session1.persist(st);
        Student st1=(Student)session1.get(Student.class,101);
        System.out.println(st1);
        ts.commit();
        session1.close();
        factory.close();
        SessionFactory factory1=HibernateUnit.getSessionFactory();
        Book bk1=new Book(101,"rich dad poor dad","motivational");
        Book bk2=new Book(102,"me before you","rom-com");
        List<Book> list1=new ArrayList<Book>();
        list1.add(bk1);
        list1.add(bk2);
        Author a1=new Author();
        a1.setAid(101);
        a1.setAuthorname("kanika kumar");
        a1.setBookname(list1);
        Session session2=factory1.openSession();
        Transaction ts2=session2.beginTransaction();
        session2.persist(a1);
        session2.persist(bk1);
        session2.persist(bk2);
        Author st2=(Author)session2.get(Author.class,101);
        System.out.println(st2);
        
        ts2.commit();
        session2.close();
        factory1.close();
        SessionFactory factory2=HibernateUnit.getSessionFactory();
        Emp e1=new Emp();
        Emp e2=new Emp();
        e1.setEid(1);
        e1.setName("Anuj");
        e2.setEid(2);
        e2.setName("prayag");
        Project p1=new Project();
        Project p2=new Project();
        p1.setPid(111);
        p1.setProjectname("ATM system");
        p2.setPid(222);
        p2.setProjectname("Library system");
        List<Emp> list2=new ArrayList<Emp>();
        List<Project> list3=new ArrayList<Project>();
        list2.add(e1);
        list2.add(e2);
        list3.add(p1);
        list3.add(p2);
        e1.setProjects(list3);
        e2.setProjects(list3);
        p2.setEmps(list2);
        Session session3=factory2.openSession();
//        Transaction ts3=session3.beginTransaction();
        session3.beginTransaction();
        session3.persist(e1);
        session3.persist(e2);
        session3.persist(p1);
       session3.persist(p2);
       session3.getTransaction().commit();
       session3.createQuery("from Emp",Emp.class).list().forEach(System.out::println);
        
//        ts3.commit();
        session3.close();
        factory2.close();
    }
}

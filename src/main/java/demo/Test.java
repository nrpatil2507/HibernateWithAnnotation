package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		
	Emp e=new Emp();
	EmpName n=new EmpName();
	
	e.setId(1);
	n.setFname("nutan");
	n.setMname("ragho");
	n.setLname("patil");
	e.setName(n);
	e.setCmpname("axelor");
		
	Configuration cn=new Configuration().configure().addAnnotatedClass(Emp.class);
	SessionFactory sf=cn.buildSessionFactory();
	
	Session s=sf.openSession();
	Transaction tx=s.beginTransaction();

	s.save(e);
	tx.commit();
	
	}

}

package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		Emp data=new Emp();
		
		Configuration cn=new Configuration().configure().addAnnotatedClass(Emp.class);
		SessionFactory sf=cn.buildSessionFactory();
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		data=(Emp)s.get(Emp.class, 1);
	
		tx.commit();

		System.out.println(data);
	}

}

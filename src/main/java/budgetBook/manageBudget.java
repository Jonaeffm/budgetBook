package budgetBook;

import java.math.BigDecimal;
import java.sql.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.postgresql.Driver;


public class manageBudget {
	
	private static SessionFactory factory ;
	public void manage()
	{
		
		try {
		
			
			Configuration cfg=new Configuration();  //create Configuration object first

			cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
			factory=cfg.buildSessionFactory(); //then u can create session factory object and u can begin your transaction

		}catch (Throwable ex)
		{
			System.err.println("Failed to create sessionFactory object"+ex);
			throw new ExceptionInInitializerError(ex);
		}
		
		manageBudget MB = new manageBudget();
	
		Integer empID1 = MB.addBudget(Date.valueOf("2015-3-31"),"Soap",0.99);
	}
	
	public Integer addBudget(Date date,String product,Double price)
	{
		Session session =factory.openSession();
		Transaction tx = null;
		Integer budgetID = null;
		
		try
		{
			tx = session.beginTransaction();
			budget bud = new budget(date ,product,price);
			budgetID = (Integer) session.save(bud);
			tx.commit();
			
		}
		catch (HibernateException exc) {
			if(tx!=null) tx.rollback();
			exc.printStackTrace();
		}
		finally {
			session.close();
		}
		return budgetID;
		
	}
}

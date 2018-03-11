package org.springStarter.checker;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springStarter.beans.model.LoginModel;
import org.springStarter.dao.model.beans.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.scheduling.annotation.Scheduled;


public class SpringScheduler {
	
	private LoginModel loginModel;
	@Autowired
	private PersonModel pmodel;
	
	public PersonModel getPmodel() {
		return pmodel;
	}

	public void setPmodel(PersonModel pmodel) {
		this.pmodel = pmodel;
	}

	public LoginModel getLoginModel() {
		return loginModel;
	}

	public void setLoginModel(LoginModel loginModel) {
		this.loginModel = loginModel;
	}
	@Scheduled(fixedDelay=10000)
	public void insertData(){
		pmodel.setMailId("abc,.mail.com");
		pmodel.setpersonId("111");
		pmodel.setName("Mrinal");
		pmodel.setScore(90);
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.saveOrUpdate(pmodel);
		session.getTransaction().commit();
		System.out.println(System.currentTimeMillis());
	}
}

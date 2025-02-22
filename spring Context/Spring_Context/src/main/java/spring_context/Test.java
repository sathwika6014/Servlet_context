package spring_context;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component

public class Test {
	@Autowired
	EntityManager em;
	static ApplicationContext ac=new 	AnnotationConfigApplicationContext(Config.class);
	public static void main(String[] args) {
		System.out.println("Start");
		//Resource r= new ClassPathResource("config.xml");
		//BeanFactory bf= new XmlBeanFactory(r);
	//	ApplicationContext ac= new ClassPathXmlApplicationContext("config.xml");
		
		//ApplicationContext ac=new 	AnnotationConfigApplicationContext(Config.class);
		
		//EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		
		//EntityManager em= ac.getBean(EntityManager.class);
		
		Test test =ac.getBean(Test.class);
		test.insertUser();
		
		//ArrayList al=ac.getBean(ArrayList.class);

		//HashMap hm=ac.getBean(HashMap.class);
		//HashSet hs=ac.getBean(HashSet.class);
		//System.out.println(hs);
		//System.out.println(hm);
		//System.out.println(al);
		//System.out.println(al.size());
	
		
		
		///	ac.getBean("dev");
		///ac.getBean("lap");
		//ac.getBean("desk");
		
		
		System.out.println("End");
		
	}
	public void insertUser() {
		User u=ac.getBean(User.class);
		Test test =ac.getBean(Test.class);
		EntityTransaction et= test.em.getTransaction();
		et.begin();
		u=test.em.merge(u);
		et.commit();
		System.out.println(u);
		
	}

}

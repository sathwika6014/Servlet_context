package spring_context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"my_context","spring_context"})
public class Config {
	@Bean
	public ArrayList arrayList() {
		return new ArrayList() {{add(10);add(20);add(30);add(40);add(50);}};
		
	}
	@Bean
	public HashMap hashMap() {
		return new HashMap() {{put(1,1);put(1,2);put(2,3);put(1,4);}};
		
	}
	@Bean
	public HashSet hashSet() {
		return new HashSet() {{add(10);add(15);add(25);add(35);}};
		
	}
	
	@Bean
	public EntityManager entityManager() {
		return Persistence.createEntityManagerFactory("dev").createEntityManager();
		
	}

}

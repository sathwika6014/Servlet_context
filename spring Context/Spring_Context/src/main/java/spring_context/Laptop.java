package spring_context;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Laptop implements Computer {
	public Laptop() {
		System.out.println("Laptop object created");
	}
	
	@Override
	public void compile() {
		System.out.println("code compiled in laptop");
		
		
	}

}

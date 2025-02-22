package spring_context;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component

public class Desktop implements Computer{
	public Desktop() {
		System.out.println("Desktop object created");
	}
	
	@Override
	public void compile() {
		System.out.println("code compiled in Desktop");
		
	}

}

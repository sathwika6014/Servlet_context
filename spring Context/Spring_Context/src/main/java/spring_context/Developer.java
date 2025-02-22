package spring_context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Developer {
	@Autowired
	@Qualifier("laptop")
	private Computer c;
	
	public Developer() {
		System.out.println("Developer object created");
	}

	public Computer getC() {
		return c;
	}

	public void setC(Computer c) {
		this.c = c;
	}
}

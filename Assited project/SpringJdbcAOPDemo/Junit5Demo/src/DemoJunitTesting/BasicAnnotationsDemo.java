package DemoJunitTesting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicAnnotationsDemo {
    @BeforeEach
	public void setUp() {
		System.out.println("before");
	}
	@Test
	public void shouldTestThecase() {
		System.out.println("test the test case");
	}
	@Test
	public void shouldTestThecase1() {
		System.out.println("test the test case");
	}
	@AfterEach
	public void tearDown() {
		System.out.println("after");
	}
	
	 
	 
}

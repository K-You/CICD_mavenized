import com.cicd.util.Greeter;

import junit.framework.Assert;

public class GreeterTest {
	
	public void testGreeter(){
		Greeter greeter = new Greeter();
		Assert.assertEquals(greeter.sayHello(), "Hello utility library");
	}
}

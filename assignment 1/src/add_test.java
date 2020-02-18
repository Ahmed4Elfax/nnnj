import static org.junit.Assert.*;

import org.junit.Test;

public class add_test {

	@Test
	public void test() {
		calc test = new calc();
		int output = test.add(1, 3);
		assertEquals(4,output);
	}

}

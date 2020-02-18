import static org.junit.Assert.*;

import org.junit.Test;

public class divide_test {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		calc test = new calc();
		float output = test.divide(4, 2);
		assertEquals(2, output);
	}

}

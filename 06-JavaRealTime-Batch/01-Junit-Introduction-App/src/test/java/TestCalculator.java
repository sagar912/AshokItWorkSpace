import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.sagar.Calculator;



public class TestCalculator {

	
	private static Calculator c=null;

// ==============================  BEFORE CLASS LOADING ==============================//

	@BeforeClass
	public static void init() {
	c=new Calculator();
	}
	
// ============================== ADD TEST CASE-01  SUCCESS ==============================//
	@Test(timeout=100)
	public void testadd_01() {
	
	int exp=28;
	int result=c.add(12, 16);
	assertEquals(exp, result);
	}
// ============================== ADD TEST CASE-02  FAILURE ==============================//

	@Test
	public void testadd_02() {
		
      int expresult =38;
      int actualresult=c.add(20, 18);
      assertEquals(expresult,actualresult);
		
	}
	
// ============================== ADD TEST CASE-03  EROR ==============================//

	@Test
	public void testAdd_03() {
		Integer actual = c.add(100, 200);
		Integer expected = 300;
		assertEquals(expected, actual);
	}
	
// ============================== MULTIPLICATION  TEST CASE-01  SUCCESS ==============================//

	@Test
	public void testMul_01() {
		Integer actual = c.mul(2, 5);
		Integer expected = 10;
		assertEquals(expected, actual);
	}
	
//============================== AFTER CLASS ==============================//

	@AfterClass
	public static void destroy() {
		c=null;
	}


}

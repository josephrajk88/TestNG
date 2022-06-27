// The @before & @After methods will run based ion ASCII code format
// We can set the order also for methods
package MyPackage;

import java.util.Date;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class HooksClass {
	
	@Before (order = 3)
	public void startDate()
	{
		System.out.println("Start Date--"+new Date());
	}
	
	@After
	public void endDate()
	{
		System.out.println("End date--"+new Date());
	}

	@Before (order = 2)
	public void startDB()
	{
		System.out.println("start DB--");
	}
	
	@After
	public void endDB()
	{
		System.out.println("end DB--");
	}

	@Before
	public void startExcel()
	{
		System.out.println("Start Excel");
	}
	
	@After
	public void endExcel()
	{
		System.out.println("End Excel--");
	}

	@Before (order = 1)
	public void startEnv()
	{
		System.out.println("Start Env--");
	}
	
	@After
	public void endEnv()
	{
		System.out.println("End Env--");
	}
	
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("before Step--");
	}
	
	@AfterStep
	public void afterStep()
	{
		System.out.println("after Step--");
	}
	
	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("before All--");
	}
	
	@AfterAll
	public static void afterAll()
	{
		System.out.println("after All--");
	}
	


}

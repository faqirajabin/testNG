package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
	@Test

	public void maven() {
		System.out.println("hello");
		

	}
	@BeforeTest
	public void maven1() {
		System.out.println("hellow world");
	}
	@AfterTest
	public void maven2() {
		System.out.println("hellow hai");
	}
	

}

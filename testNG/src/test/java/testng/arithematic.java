package testng;

import org.testng.annotations.Test;

public class arithematic {
	int a=30;
	int b=6;
	@Test
	public void add() {
		
		int sum=a+b;
		System.out.println(sum);
	}
	@Test
	public void substract() {
		int sub=a-b;
		System.out.println(sub);
	}
	@Test
	public void multiplication() {
		int mul=a*b;
		System.out.println(mul);
	}
	@Test
	public void division() {
		int div=a/b;
		System.out.println(div);
	}
	@Test
	public void modulus() {
		int mod =a%b;
		System.out.println(mod);
	}

}

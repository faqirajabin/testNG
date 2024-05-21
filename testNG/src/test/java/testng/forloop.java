package testng;

import org.testng.annotations.Test;

public class forloop {
	@Test
	public void pattern() {
		int a=5;
		for(int i=a;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}

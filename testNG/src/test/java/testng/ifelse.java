package testng;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ifelse {
	@Test
	public void contition() {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18 && age<=50) {
			System.out.println("eligible for blood donate");
		}else
		{
			System.out.println("not eligible for blood donate");
		}
	
	}

}

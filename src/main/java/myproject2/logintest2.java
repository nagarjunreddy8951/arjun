package myproject2;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class logintest2 {
	@Test
	public void logintest () {
		ArrayList data = excelreader.getdata("C://Users//Himanth Reddy//Desktop//testdata3.xlsx");
		System.out.println(data);
	}

}

package qsp;

import java.io.File;
import java.io.FileInputStream;



import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class A {

	public static void main(String[] args) throws Exception{
		Workbook w = WorkbookFactory.create(new FileInputStream("./data/Book2.xlsx"));
		String s=w.getSheet("Sheet1").getRow(0).getCell(0).toString();
		System.out.println(s);
		
	}
}

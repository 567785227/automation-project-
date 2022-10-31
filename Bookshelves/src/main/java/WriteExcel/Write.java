package WriteExcel;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import home.Home;


public class Write {
	public static  void WriteExcel() throws IOException {

		String [] book=Home.WriteData();
		String Path = System.getProperty("user.dir") + "\\Excel\\\\bookshelves.xlsx";
		FileInputStream fis = new FileInputStream(Path);
		   XSSFWorkbook workbook=new XSSFWorkbook(fis);
		   XSSFSheet sheet=workbook.createSheet("Bookshelves");
		   for(int i=0;i<5;i++)
		   {
			   
			   sheet.createRow(i).createCell(0).setCellValue(book[i]);
		   }
		   FileOutputStream fos=new FileOutputStream(Path);
		   workbook.write(fos);
		   workbook.close();		   
	}

}

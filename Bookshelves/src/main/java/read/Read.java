package read;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static String ReadExcel() throws IOException
	{
		String data;
		String Path = System.getProperty("user.dir") + "\\Excel\\bookshelves.xlsx";
		FileInputStream readfile=new FileInputStream(Path);
	    XSSFWorkbook workbook=new XSSFWorkbook(readfile);
	    XSSFSheet sheet =workbook.getSheetAt(0);
	    data=String.valueOf(sheet.getRow(0).getCell(0));
	    workbook.close();
		return data;
	}	
}

package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Read_Excel {

	public static String getData(String sheet, int row, int cell) throws EncryptedDocumentException, IOException
	{
		String val = " ";
		
		try
		{
		FileInputStream fis = new FileInputStream("./excel/frame.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
		val = c.getStringCellValue();
		}
		
		catch(Exception e)
		{
			System.out.println("Unable to fetch data");
		}
		return val;
	}
}

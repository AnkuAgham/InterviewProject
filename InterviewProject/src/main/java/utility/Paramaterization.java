package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.bouncycastle.openssl.EncryptionException;

public class Paramaterization 
{
	public static String getData(String sheetname, int raw, int cell) throws EncryptionException, IOException
	{
		FileInputStream file1=new FileInputStream("D:\\INTERVIEW-SHUBHAMNAIK\\InterviewProject\\src\\test\\resources\\TestCaseData.xlsx");
		//FileInputStream is a class which accepts path of the file from which we want to fetch the data.
		String value =WorkbookFactory.create(file1).getSheet("Data").getRow(raw).getCell(cell).getStringCellValue();
		return value;
	}
}

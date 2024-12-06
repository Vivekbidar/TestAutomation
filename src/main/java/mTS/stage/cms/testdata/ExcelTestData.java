package mTS.stage.cms.testdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTestData {

	public static String testDataFilePath = ".\\src\\main\\java\\mTS\\stage\\cms\\testdata\\TestdataHudini.xlsx";

	public static String testData(String sheetName, int rowNum, int cellNum) throws InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(testDataFilePath);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		String data = sheet.getRow(rowNum).getCell(cellNum).toString();
		return data;
	}
}

package FrameWorkLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

/***
 * 
 * @author LENOVO 7XIN
 *
 */
public class ReadData1 {
	/**
	 * This method helps us to read data from property file
	 * 
	 * @param the associated key name in property file
	 * @return
	 */

	// reading from property file
	public static String fromPropertyFile(String key) {
		FileInputStream fis = null;
		Properties properties = null;
		try {
			fis = new FileInputStream(new File("./TestData/configuration.properties"));
			properties = new Properties();
			properties.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);

	}

	// extracting only single cell value from excel
	public static String fromExcel(String sheetName, int rowNo, int cellNo) {
		FileInputStream fis = null;
		Workbook workbook = null;
		try {
			fis = new FileInputStream(new File("./TestData/SamrtBear.xlsx"));
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();

	}

	// reading multiple data from the excel(rows and columns)
	@DataProvider
	public static String[][] multipleDataFromExcel() {
		FileInputStream fis = null;
		Workbook workBook = null;
		try {
			fis = new FileInputStream("./TestData/SamrtBear.xlsx");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			workBook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheetInfo = workBook.getSheet("TestCases");
		int rowCount = sheetInfo.getPhysicalNumberOfRows() - 1;
		int columnCount = sheetInfo.getRow(1).getPhysicalNumberOfCells() - 1;
		String data[][] = new String[rowCount][columnCount];

		for (int i = 1, k = 0; i <= rowCount; i++, k++) {
			for (int j = 1, l = 0; j <= columnCount; j++, l++) {
				data[k][l] = sheetInfo.getRow(i).getCell(j).toString();
			}
		}
		return data;

	}

	// reading a single row data
	public static String[][] DataFromExcel(String sheetName, int rowNo) {
		FileInputStream fis = null;
		Workbook workBook = null;
		try {
			fis = new FileInputStream("./TestData/SmartBear.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workBook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheetInfo = workBook.getSheet(sheetName);
		int columnCount = sheetInfo.getRow(rowNo).getPhysicalNumberOfCells() - 1;
		String data[][] = new String[1][columnCount];

		for (int j = 0; j < columnCount; j++) {
			data[0][j] = sheetInfo.getRow(rowNo).getCell(j + 1).toString();
		}

		return data;

	}

}

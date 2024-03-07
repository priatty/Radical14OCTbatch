package basic;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\Admin\\Documents\\MyDataFile.xlsx");

		XSSFSheet sheet1= workbook.getSheetAt(0);
		String value1 = sheet1.getRow(1).getCell(0).toString();
		int value2 = (int) sheet1.getRow(1).getCell(1).getNumericCellValue();
		
	
		
		for(Row row : sheet1 ) {
			for(Cell cell:  row) {
				
				System.out.print(cell.toString()+ "  ");
			}
			System.out.println();
			
		}
		
		//System.out.println("Value 1 = "  +value1);
		//System.out.println("Value 2 = "  +value2);
	}

}

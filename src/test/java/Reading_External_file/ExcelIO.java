package Reading_External_file;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import org.openqa.selenium.devtools.v85.io.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelIO {
    @Test
    public void readDataFromExcel() throws IOException {
        //1 . import excel data from computer
        String path ="C://Users/HomeExpensesMay23.xlsx";
        Workbook workbook = WorkbookFactory.create(new File(path));
        //2. read data from excel
        Sheet sheet = workbook.getSheet("expense"); // select file from Excel
        Row row = sheet.getRow(0);  // sheet>row>cell ; get the first row
        Cell cell = row.getCell(0); // sheet>row>cell ; get the first cell

        System.out.println(cell.getStringCellValue()); //read value from the cell as string
        System.out.println(sheet.getLastRowNum()); // get the last row number
        int lastRow = sheet.getLastRowNum(); // get the last row number

       // System.out.println(sheet.getRow(lastRow).getCell(0));
        for(int i=0; i<lastRow;i++){
            int lastColumn = sheet.getRow(i).getLastCellNum()-1; //get the column, then read the calue

            System.out.println(sheet.getRow(i).getCell(0)); //get the all row values from first cell
            System.out.print("  " + sheet.getRow(i).getCell(lastColumn));// get the all rows and columns
            System.out.println();
        }



    }
}

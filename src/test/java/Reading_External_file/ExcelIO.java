package Reading_External_file;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import org.openqa.selenium.devtools.v85.io.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelIO {

    //flow: workbook from workbookFactory
    // workbook > sheet (getSheet) > row (getRow) > cell (getCell)
    //
    @Test
    public void readDataFromExcel() throws IOException {
        //1 . import excel data from computer
        String path = "S:/Cybertek Classessssssssssssss/HomeExpensesMay23.xlsx";
        Workbook workbook = WorkbookFactory.create(new File(path));

        //2. read data from excel
        Sheet sheet = workbook.getSheet("expense"); // select file from Excel

        //3. get the row from sheet
        Row row = sheet.getRow(0);  // sheet>row>cell ; get the first row

        //4. get the cell from row
        Cell cell = row.getCell(0); // sheet>row>cell ; get the first cell

        //5. Read the cell value
        System.out.println("The first cell from first row: " + cell.getStringCellValue()); //read value from the cell as string
        //int firstRow = sheet.getFirstRowNum();

        int lastRow = sheet.getLastRowNum();//get the last row column number
        System.out.println("Last row value: " + sheet.getRow(lastRow).getCell(0));
        System.out.println();

       // System.out.println(sheet.getRow(lastRow).getCell(0));
        for(int i=0; i<lastRow; i++){
            int lastColumn = sheet.getRow(i).getLastCellNum() -1;// gets all the cells

            System.out.print(sheet.getRow(i).getCell(0));// get the value of first column
            System.out.println(":    " + sheet.getRow(i).getCell(lastColumn));

            System.out.println();
        }



    }
}

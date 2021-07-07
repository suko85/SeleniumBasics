package Ejemplos;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadWriteExcel {

    //permite leer una hoja de excel fila por fila y cada celda o columna de la fila.
    public void readExcel(String filepath, String sheetName) throws IOException {
        File file = new File(filepath); // crea objeto de tipo File y le pasa la ruta del archivo.
        FileInputStream inputStream = new FileInputStream(file); // es donde estan los datos del arqchivo que cargamos.
        XSSFWorkbook newWorkBook = new XSSFWorkbook(inputStream);//creando el objeto donde se va a guardar el el fichero excel.
        XSSFSheet newSheet = new XSSFWorkbook().getSheet(sheetName);//crea el objeto de la hoja con la que vamos a trabajar.
        int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();//calculando y guardando cuantas filas tiene la hoja
        for (int i=0; i<rowCount;i++){
            XSSFRow row = newSheet.getRow(i);//crea el objeto por fila de la hoja y obtiene la fila
            for (int j=0;j<row.getLastCellNum();j++){//iterando las columnas de la fila
                System.out.println(row.getCell(j).getStringCellValue()+ "||");
            }
        }

    }

    public String getCellValue(String filepath, String sheetName, int rowNumber, int cellNumber) throws IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkBook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkBook.getSheet(sheetName);
        XSSFRow row = newSheet.getRow(rowNumber);
        XSSFCell cell = row.getCell(cellNumber);

        return cell.getStringCellValue();
    }

}

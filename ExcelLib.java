package com.hrm.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	String filePath = "C:\\Users\\test\\Desktop\\Book1.xlsx";
	
	public String getExcelData(String sheetNAme, int rowNum, int colNum) throws EncryptedDocumentException, InvalidFormatException, IOException{
		  FileInputStream fis = new FileInputStream(filePath);
		  Workbook wb = WorkbookFactory.create(fis);
		  Sheet sh = wb.getSheet("Sheet1");
		  Row row = sh.getRow(1);
		  String data = row.getCell(2).getStringCellValue();
		  wb.close();
		return data;
	}	
	

}

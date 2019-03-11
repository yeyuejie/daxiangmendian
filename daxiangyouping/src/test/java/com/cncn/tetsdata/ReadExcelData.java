package com.cncn.tetsdata;

import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
  public static Object[][] getExcelData(String filename){
	  Object[][] obj=null;
	  InputStream is=
	  ReadExcelData.class.getClassLoader().getResourceAsStream(filename);
	  try {
		Workbook wb=new XSSFWorkbook(is);
		Sheet sh=wb.getSheet("lgdata");
		int lastrownum=sh.getLastRowNum();
		Row titlerow=sh.getRow(0);
		int lastcellnum=titlerow.getLastCellNum();
		obj=new Object[lastrownum][lastcellnum];
		for(int i=0;i<obj.length;i++){
			Row row=sh.getRow(i+1);
			for(int j=0;j<obj[i].length;j++){
				Cell cell=row.getCell(j);
				obj[i][j]=parseData(cell);
				
			}
		}
		
		
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	  return obj;
	  
  }
  
   public static Object parseData(Cell cell){
	   Object data=null;
	   switch (cell.getCellType()) {
	case BOOLEAN:
		data=cell.getBooleanCellValue();
		break;
	case NUMERIC:
		if(DateUtil.isCellDateFormatted(cell))
			data=cell.getDateCellValue();
		else
			data=double2int(cell.getNumericCellValue());
		break;
	case STRING:
		data=cell.getStringCellValue();
		break;
	default:
		return null;
	}
	return data;
	   
   }
   
   public static Object double2int(double from){
	   if(from-(int)from==0)
		   return (int)from;
	   else
		   return from;
   }
}

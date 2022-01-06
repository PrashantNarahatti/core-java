package com.xworkz.demo.poi;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;

public class ReadExcel {
	  public static void main(String[] args) 
	    {
	        try
	        {
	            FileInputStream file = new FileInputStream(new File("xworkz_demo.xlsx"));
	 
	            //Create Workbook instance holding reference to .xlsx file
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	 
	            //Get first/desired sheet from the workbook
	            XSSFSheet sheet = workbook.getSheetAt(0);
	 
	            //Iterate through each rows one by one
	            Iterator<Row> rowIterator = sheet.iterator();
	            while (rowIterator.hasNext()) 
	            {
	                Row row = rowIterator.next();
	                //For each row, iterate through all the columns
	                Iterator<org.apache.poi.ss.usermodel.Cell> cellIterator = row.cellIterator();
	                 
	                while (cellIterator.hasNext()) 
	                {
	                    org.apache.poi.ss.usermodel.Cell cell = cellIterator.next();
	                    //Check the cell type and format accordingly
	                   
	                }
	            }
	        }
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	    }
	}



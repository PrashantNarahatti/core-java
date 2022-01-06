package com.xworkz.demo.poi;

import org.apache.poi.ss.usermodel.CellType;

public interface Cell {
	CellType CELL_TYPE_NUMERIC = null;
	CellType CELL_TYPE_STRING = null;

	int getCellType();

	String getNumericCellValue();

}

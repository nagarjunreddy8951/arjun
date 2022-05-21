package myproject2;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.asn1.dvcs.Data;


public class excelreader {
	public static ArrayList getdata(String filepath) {
		ArrayList data=new ArrayList();
		try {
			FileInputStream fis=new FileInputStream(filepath);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet= workbook.getSheetAt(0);
			Iterator<Row>itr=sheet.rowIterator();
			while(itr.hasNext()) {
				Row row=itr.next();
				Iterator<Cell>cellitr=row.cellIterator();
				while(itr.hasNext()) {
					Cell cell=cellitr.next();
					data.add(cell.getStringCellValue());
				}
			}
			return data;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
	
package utilitypkg;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utilityclass {
	public static String getcellvalue(String x1,String sheet1,int r,int c)
	{
		try
		{
			FileInputStream fi=new FileInputStream(x1);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFCell cell=wb.getSheet(sheet1).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING) {
				return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue();
				
			}
		}
			
				catch(Exception e){
					return " ";
					
					
				
				}

		}
	public static int getRowcount (String x1,String sheet1)
	{
		try {
			FileInputStream fi=new FileInputStream(x1);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			return wb.getSheet(sheet1).getLastRowNum();
			
		}
		catch (Exception e){
			return 0;
			
		}
	}
	

}

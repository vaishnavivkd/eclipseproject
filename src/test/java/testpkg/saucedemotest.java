package testpkg;

import org.testng.annotations.Test;

import baseurlpkg.Baseclass;
import pagepkg.Saucedemopage;

import utilitypkg.Utilityclass;


public class saucedemotest extends  Baseclass{
	@Test
	public void testmthd()throws Exception{
	
	Saucedemopage p1=new Saucedemopage(driver);
	String x1="C:\\Users\\Vishnu K Dileep\\Documents\\verumdemo.xlsx";
	String sheet1="sheet1";
	int rowcount=Utilityclass.getRowcount(x1, sheet1);
	System.out.println(rowcount);
	for(int i=1;i<=rowcount;i++)
	{
	   String username=Utilityclass.getcellvalue(x1,sheet1,i,0);
	   System.out.println("username is"+username);
	   String password=Utilityclass.getcellvalue(x1, sheet1,i,1);
	   System.out.println("passwprd is"+password);
	   p1.setvaluess(username,password);
	   p1.clickloginn();
	   p1.imgone();
	   p1.imgtwo();
	   p1.imgthree();
	   p1.imgfour();
	   p1.imgfive();
	   p1.imgsix();
	   p1.carts();
	   p1.down();
	   p1.checkouts();
	   p1.homepage();
	   p1.threeline();
	   p1.log();
	   
	   
	
	   
	   String expected="https://www.saucedemo.com";
	   String acturl=driver.getCurrentUrl();
	   System.out.println(acturl);
	
	   if(expected.equalsIgnoreCase(acturl)) {
		   System.out.println("pass");
	   }
	   else {
		   System.out.println("fail");
	   }
	   
	}
	
	
	
	}




	
}


package testcases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import WriteExcel.Write;
import browser.Browser;
import home.Home;
import read.Read;


public class Testcase {
	@Test(dataProvider = "data")
	public void datainput(String Dataval) throws Exception {
		Home home=new Home();
		//home.Pop();
		home.Searchtextbox(Dataval);
		home.SearchButton();
		home.ShelfCost();
		home.StorageType();
		Thread.sleep(5000);
		Robot robot = new Robot();
		for (int i = 0; i <=4; i++) {
			 robot.keyPress(KeyEvent.VK_CONTROL);
			 robot.keyPress(KeyEvent.VK_SUBTRACT);
			 robot.keyRelease(KeyEvent.VK_SUBTRACT);
			 robot.keyRelease(KeyEvent.VK_CONTROL);
			 }

		home.Firstone();
		home.Secondone();
		home.Thirdone();
		home.FourthOne() ;
		home.Fifth();
		home.ProductDetails();
		Write.WriteExcel();	
	}
	 @DataProvider
	  public Object[][] data() throws IOException {
	    Object[][] testData = new Object[1][1];
	    testData[0][0] = Read.ReadExcel();
	    return testData;
	  }
@BeforeTest
public void beforeTest() throws InterruptedException {
	Browser.setDriver();
	Browser.getUrl();
}
@AfterTest
public void afterTest() {
	  Browser.closeBrowser();
}
}
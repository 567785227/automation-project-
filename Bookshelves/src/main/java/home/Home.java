package home;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import browser.Browser;
import locator.Locators;
public class Home extends Browser {
	static String first,second,third,fourth,fifth;
	public static String [] array=new String[5];
	
		
	public void Searchtextbox(String datavalue)  throws IOException{
		
		WebElement Search=Locators.Searchinput();
		Search.sendKeys(datavalue);
	}
	public void SearchButton()
	{
		WebElement button=Locators.searchButton();
		button.click();
		
	}
	public void ShelfCost() throws InterruptedException {

		Actions a=new Actions(driver);
		WebElement filter=Locators.Filter();

		a.moveToElement(filter).build().perform();
		Thread.sleep(2000);

		WebElement priceBar=Locators.Cost();

		a.click(priceBar).clickAndHold().build().perform();
		Thread.sleep(5000);
		a.moveToElement(priceBar, -206, 0).release().build().perform();
		Thread.sleep(5000);
	}
	/*public void Recommended() throws InterruptedException {
		WebElement recommend = Locators.Recommended();
		recommend.click();
		
	}*/
	public void StorageType() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement filter=Locators.Filter2();

		a.moveToElement(filter).build().perform();
		Thread.sleep(2000);
		
		WebElement Storage = Locators.StorageType();
		Storage.click();
		
	}
		
	public void Firstone() throws InterruptedException {
		WebElement First = Locators.FirstOne();
		first=First.getText();
		Thread.sleep(2000);
	}
	public void Secondone() throws InterruptedException {
		WebElement secondone = Locators.SecondOne();
		second=secondone.getText();
		
		
	}
	public void Thirdone() throws InterruptedException {
		WebElement Third = Locators.ThirdOne();
		third=Third.getText();
		Thread.sleep(2500);
	}
	public void FourthOne() throws InterruptedException {
		WebElement fourthone= Locators.Fourth();
		fourth=fourthone.getText();
		
	}
	public void Fifth() throws InterruptedException {
		WebElement fifthone = Locators.FifthOne();
		fifth=fifthone.getText();
		
	}

	public void ProductDetails() {
		System.out.println("1st-"+first);
		 System.out.println("2nd-"+second);
		 System.out.println("3rd-"+third);
		 
		
	}
	public static String [] WriteData() {
		array[0]=first;
		array[1]=second;
		array[2]=third;
				return array;
		
	}

	

}

package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import browser.Browser;


public class Locators extends Browser {
	/*public static WebElement Closepopup() {
		WebElement CloseButton=driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		return CloseButton;
	}*/
	public static WebElement Searchinput(){
		WebElement input=driver.findElement(By.xpath("//*[@id=\"search\"]"));
		return input;
	}
	public static WebElement searchButton(){
		WebElement Button=driver.findElement(By.xpath("//*[@id=\"search_button\"]"));
		return Button;
	}
	public static WebElement Filter(){
		WebElement Pricefilter=driver.findElement(By.xpath("//*[@class='filters-list-wrapper']/descendant::div[contains(text(),'Price')]"));
		return Pricefilter;
	}
	public static WebElement Cost() {
		WebElement Pricebar=driver.findElement(By.xpath("//div[@class='noUi-base']/child::*[2]/child::*"));
		return Pricebar;
	}
	public static WebElement Filter2(){
		WebElement Storagefilter=driver.findElement(By.xpath("//*[@class='filters-list-wrapper']/descendant::div[contains(text(),'Storage Type')]"));
		return Storagefilter;
	}
	public static WebElement StorageType() {
		WebElement Storage=driver.findElement(By.xpath("//*[@id=\"filters_storage_type_Open\"]"));
		return Storage;
	}
	public static WebElement FirstOne() {
		WebElement Firstone=driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[1]/div/div[5]/a"));
		return Firstone;
	}
	public static WebElement SecondOne() {
		WebElement secondone=driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[2]/div/div[5]/a"));
		return secondone;
	}
	public static WebElement ThirdOne() {
		WebElement thirdone=driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[3]/div/div[5]/a"));
		return thirdone;
	}
	public static WebElement Fourth() {
		WebElement fourthone=driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[4]/div/div[5]/a"));
		return fourthone;
	}
	public static WebElement FifthOne() {
		WebElement fifthone=driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[5]/div/div[5]/a"));
		return fifthone;
	}
	}


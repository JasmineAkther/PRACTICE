package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Shared {

	
	

	public static void hoveroverOnAnyElement(WebDriver dr, WebElement ele) {
		Actions ac = new Actions(dr);
		ac.moveToElement(ele).build().perform();
	}
	
	public static void verifyText(WebElement ele,String s) {
		ele.getText().equals(s);
	}
	
	public static void verifyTitle(WebDriver dr,String s) {
		dr.getTitle().contains(s);
	}
	
	public static void ClickOnAnyElamant(WebElement ele) {
		ele.click();
	}
	
	public static void SearchForAnyElement(WebElement ele,String s) {
		ele.sendKeys(s);
	}
	
	
	
}

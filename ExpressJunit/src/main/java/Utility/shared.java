package Utility;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class shared {
	
	public static Properties initpropertyfile(String path) throws IOException{
		//FileInputStream fi = new FileInputStream(new File(path));
		//Properties prop = new Properties();
		//prop.load(fi);
		//return prop;
		
		FileInputStream fi =new FileInputStream(new File(path));
		Properties prp= new Properties();
		prp.load(fi);
		return prp;
	}
	
	public static void hoverOverInanyMenu(WebDriver dr, WebElement ele) {
		Actions ac= new Actions(dr);
		ac.moveToElement(ele).build().perform();
	}
	public static void verify(String s, WebElement ele) {
		ele.getText().equals(s);
	}
	public static void verifytext(String s, WebElement ele) {
		ele.getText().equals(s);
	}
		
		public  static void verifyrtitle(String k, WebDriver dr) {
			dr.getTitle().contains(k);
		
	}
	
	public static void clickOnAnyElement(WebElement ele) {
		ele.click();
	}

	
	
	
}

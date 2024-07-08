package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
WebDriver driver;
	public ProductPage(WebDriver dr) {
		this.driver=dr;
		PageFactory.initElements(dr, this);
	}

}

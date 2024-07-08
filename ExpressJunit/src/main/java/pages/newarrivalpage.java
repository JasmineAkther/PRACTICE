package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.shared;

public class newarrivalpage {

	WebDriver driver;

	newarrivalpage(WebDriver dr) {
		this.driver=dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(xpath = "//h1[@class=\"_94Y2cVEs header1 +gKgc\"]")WebElement manarrival;
	@FindBy(xpath="//img[@src=\"https://images.express.com/is/image/expressfashion/0026_03533432_0134_f001?cache=on&wid=361&fmt=jpeg&qlt=75,1&resmode=sharp2&op_usm=1,1,5,0&defaultImage=Photo-Coming-Soon\"]")WebElement product;
	
	public void verifypage() {
		shared.verifytext("Men's New Arrival", manarrival);
	}
public ProductPage clconproduct() {
	shared.clickOnAnyElement(product);
 return new ProductPage(driver);


}
}

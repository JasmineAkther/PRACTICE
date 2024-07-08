package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.shared;
import net.bytebuddy.asm.Advice.Return;

public class HomePage {
	WebDriver dr;
	
    public HomePage(WebDriver x){
    	this.dr= x;
    	PageFactory.initElements(dr, this);
    }
    @FindBy(xpath = "//img[@alt=\"Express\"]")WebElement titel;
    @FindBy(xpath = "//a[@href=\"/mens-clothing?ICID=M_HEADER_MENSCLOTHING\"]")WebElement manmenu;
 @FindBy(xpath = "//a[@href=\"/mens-clothing/whats-hot/cat120009?ICID=TN_M_NEWARRIVALS_NEWNOW\"]")WebElement newarrival;
@FindBy(xpath = "//button[@aria-label=\"Open Men submenu\"]")WebElement arrowbutton;	
@FindBy(xpath = "//button[@class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")WebElement popup;
public void ttlVrfy() {
	shared.verifyrtitle("EXPRESS", dr);
}
public void popup() {
	shared.clickOnAnyElement(popup);
}
public void hoverOver() {
		shared.hoverOverInanyMenu(dr,manmenu);
	}
 public void clickonArrowBtn() {
	 shared.clickOnAnyElement(arrowbutton);
 }
	
	public newarrivalpage clickonnewarrival() {
		shared.clickOnAnyElement(newarrival);
		return new newarrivalpage(dr);
	}

	
	
}

package bit;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages.HomePage;
import pages.ProductPage;
import pages.newarrivalpage;

public class SmokeTest extends BaseTest {

	
	
	
	@Test
	
	public void buyaShirt() {
		HomePage hp = new HomePage(driver);
		
		hp.ttlVrfy();
		hp.popup();
		
		/*
		 * List<WebElement> le
		 * =dr.findElements(By.xpath("//a[@class=\"bzS5AmY5 _4aZde\"]"));
		 * for(i=1;i<le.size();i++) {
		 * 
		 * }
		 */
		
		hp.hoverOver();
		hp.clickonArrowBtn();
		newarrivalpage na= hp.clickonnewarrival();
		na.verifypage();
		ProductPage pp= na.clconproduct();
		
	}
}

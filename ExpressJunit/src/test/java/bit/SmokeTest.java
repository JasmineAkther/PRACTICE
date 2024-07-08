package bit;

import org.junit.Test;

import pages.HomePage;
import pages.ProductPage;
import pages.newarrivalpage;

public class SmokeTest extends BaseTest {

	
	
	
	@Test
	
	public void buyaShirt() {
		HomePage hp = new HomePage(driver);
		
		hp.ttlVrfy();
		hp.popup();
		hp.hoverOver();
		hp.clickonArrowBtn();
		newarrivalpage na= hp.clickonnewarrival();
		na.verifypage();
		ProductPage pp= na.clconproduct();
		
	}
}

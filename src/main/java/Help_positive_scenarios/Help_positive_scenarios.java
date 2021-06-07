package Help_positive_scenarios;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import Reusable_Functions.Generic_function;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Help_positive_scenarios extends Generic_function{
	public static boolean value;
	/*Browser launch*/
	@Given("browser is open")
	public void browser_launching() {
		try {
			Browser_Launch();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*TC 001 - Validate that the  'Frequently asked questions’ title  should be present in  Help page*/
	@Then("check  the  Frequently asked questions title  should be present in  Help page")
	public void help_positive_tc_001() throws Exception {
		try {
			click("welcome_login");
			browser_wait(5);
			driver.findElement(By.xpath(OR_reader("Object_locator", "login_phone_number"))).sendKeys(td_reader("login_phone_number",9));
			driver.findElement(By.xpath(OR_reader("Object_locator", "login_password"))).sendKeys(td_reader("login_password",5));
			click("login");
			browser_wait(5); 
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "logo"))).isDisplayed();
			Assert.assertEquals(true,value);
			browser_wait(5);
			click("help");
			browser_wait(5);
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "header_frequently_asked"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (IOException e) {
			e.getMessage();
			takeScreenShot("help_positive_tc_001");
		}
		
	}
	/*TC 002 - Validate that the 'Second Opinions' title  should be present  and able to see description , when user click on Second Opinions title */
	@Then("check able to see description , when user click on Second Opinions title")
	public void help_positive_tc_002() throws Exception {
		try {
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "help_secondassert"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("help_secondassert");
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "help_secondabout"))).isDisplayed();
			Assert.assertEquals(true,value);
			} catch (IOException e) {
			e.getMessage();
			takeScreenShot("help_positive_tc_002");
		}
	}
	/*TC 003 - Validate that the 'Award Points' title  should be present  and able to see description , when user click on Award Points title  */
	@Then("check able to see description , when user click on Award Points title")
	public void help_positive_tc_003() throws Exception {
		try {
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "help_awardpoints"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("help_awardpoints");
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "help_awardpointsabout"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (IOException e) {
			e.getMessage();
			takeScreenShot("help_positive_tc_003");
		}
		 
	}
	/*TC 004 - Validate that the 'Referral' title  should be present  and able to see description , when user click on Referral title   */
	@Then("check able to see description , when user click on Referral title")
	public void help_positive_tc_004() throws Exception {
		try {
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "help_referralassert"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("help_referralassert");
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "help_referralabout"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (IOException e) {
			e.getMessage();
			takeScreenShot("help_positive_tc_004");
		}
		
	}
	/*TC 005 - Validate that the 'Profile' title  should be present  and able to see description , when user click on Profile title  */
	@Then("check able to see description , when user click on Profile title")
	public void help_positive_tc_005() throws Exception {
		try {
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "help_profileassert"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("help_profileassert");
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "help_profileabout"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (IOException e) {
			e.getMessage();
			takeScreenShot("help_positive_tc_005");
		}
		
	}
	
	/*TC 006 - Validate that the 'Payments' title  should be present  and able to see description , when user click on Payments title  */
	@Then("check able to see description , when user click on Payments  title")
	public void help_positive_tc_006() throws Exception {
		try {
			scrolldown();
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "help_paymentassert"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("help_paymentassert");
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "help_paymentabout"))).isDisplayed();
			Assert.assertEquals(true,value);
			
		} catch (IOException e) {
			e.getMessage();
			takeScreenShot("help_positive_tc_006");
		}
		
	}
	/*TC 007 - Validate that the 'Add coverage' title  should be present  and able to see description , when user click on Add coverage title   */
	@Then("check able to see description , when user click on Add coverage  title")
	public void help_positive_tc_007() throws Exception {
		try {
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "help_coverageassert"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("help_coverageassert");
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "help_coverageabout"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("logout");
			driverquit();
		} catch (IOException e) {
			e.getMessage();
			takeScreenShot("help_positive_tc_007");
		}
		
	}

		
	


}

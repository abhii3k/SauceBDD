package Stepdefination_sauce;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.sauceElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Stepdefination {

	static WebDriver driver;
	sauceElement El;

	@Given("user is on login page")
	public void user_is_on_login_page() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@When("user enter  {string} and {string}")
	public void user_enter_and(String uname, String pass) {

		El=new sauceElement(driver);
		
		El.user(uname,pass);
		

	}

	@Then("click on login")
	public void click_on_login() {

		El.Login();
		

	}

	@And("Landed to home page")
	public void landed_to_home_page() {
		WebElement pText = El.HomeTitle();
		String actual = pText.getText();
		Assert.assertEquals("Products", actual);

	}

	@Then("Not Landed to home page")
	public void not_landed_to_home_page() {
		WebElement error = El.Error();

		Assert.assertTrue(error.isDisplayed());

	}

	@Then("Add two product to cart")
	public void add_two_product_to_cart() {
		
		El.AddProduct();
	}

	@And("verify the product by checking remove button")
	public void verify_the_product_by_checking_remove_button() throws InterruptedException {
		El.Verifyproduct();
		

	}

	@Then("click on cart button will redirect to cart page")
	public void click_on_cart_button_will_redirect_to_cart_page() {

		El.cartButton();
		WebElement pText = driver.findElement(By.xpath("//span[@class='title']"));
		String actual = pText.getText();
		Assert.assertEquals("Your Cart", actual);
	}

	@And("Remove second product")
	public void remove_second_product() {
		El.RemoveProduct();

	}

	@Then("click on Checkout button")
	public void click_on_checkout_button() {
		El.checkout();
	}

	@And("close browser")
	public void close_browser() {

		driver.close();

	}

	@Then("Enter details of form and click continue")
	public void enter_details_of_form_and_click_continue() {

		El.Form();
	}

	@Then("Verify details and click on finish")
	public void verify_details_and_click_on_finish() {
		
		El.Verifypage();
		El.Finish();

	}

	@Then("Verify text and button")
	public void verify_text_and_button() throws InterruptedException {

		El.TextThankYou();

	El.BackButton();
		El.HomeTitle();
	}

}

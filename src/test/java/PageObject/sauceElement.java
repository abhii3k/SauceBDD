package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sauceElement {
	WebDriver driver;
	
	public sauceElement(WebDriver driver)
	{
		this.driver=driver;
	}

	
	By Uname=By.id("user-name");
	By Upass=By.id("password");
	By Ulogin=By.id("login-button");
	
	
	By Htext=By.xpath("//span[@class='title']");
	By Uerror=By.xpath("//div[@class='error-message-container error']");
	
	//product 
	By Ep1=By.id("add-to-cart-sauce-labs-backpack");
	By Ep2=By.id("add-to-cart-sauce-labs-fleece-jacket");
	
	By Vp1=By.id("remove-sauce-labs-backpack");
	By Vp2=By.id("remove-sauce-labs-fleece-jacket");
	
	
	By Hcart=By.id("shopping_cart_container");
	By Ctext=By.xpath("//span[@class='title']");
	
	By pro2=By.id("remove-sauce-labs-fleece-jacket");
	By cout=By.id("checkout");
	
	
	By Foname=By.id("first-name");
	By Folast=By.id("last-name");
	By Focode=By.id("postal-code");
	By Fcontinue=By.id("continue");
	
	By Vdetails=By.xpath("//div[@class='inventory_item_name']");
	By Vfinish=By.id("finish");
	
	By Ethanks=By.xpath("//h2[@class='complete-header']");
	By Eback=By.id("back-to-products");

	
	public void user(String u,String p) {
		driver.findElement(Uname).click();
		driver.findElement(Uname).sendKeys(u);
		driver.findElement(Upass).click();
		driver.findElement(Upass).sendKeys(p);
	}
	
	public void Login()
	{
		driver.findElement(Ulogin).click();
		
	}
	public WebElement HomeTitle()
	{
		WebElement pText=driver.findElement(Htext);
		return pText;
	}
	public WebElement Error()
	{
		WebElement error =driver.findElement(Uerror);
		return error;
	}
	
	public void AddProduct()
	{
		driver.findElement(Ep1).click();
		driver.findElement(Ep2).click();
		
	}
	public void Verifyproduct()
	{
		boolean P1 = driver.findElement(Vp1).isDisplayed();
		boolean P2 = driver.findElement(Vp2).isDisplayed();
		Assert.assertTrue(P1);
		Assert.assertTrue(P2);
	}
	public void cartButton()
	{
		driver.findElement(Hcart).click();
		
	}
	public void RemoveProduct()
	{
		driver.findElement(pro2).click();
		
	}
	public void checkout()
	{
		driver.findElement(cout).click();
		
	}
	public void Form()
	{
		
		driver.findElement(Foname).sendKeys("Abhishek");
		driver.findElement(Folast).sendKeys("Kandalkar");
		driver.findElement(Focode).sendKeys("444603");
		driver.findElement(Fcontinue).click();
		
	}
	public void Finish()
	{
		driver.findElement(Vfinish).click();
		
		
	}
	public void Verifypage()
	{
		WebElement pText = driver.findElement(Vdetails);
		String actual = pText.getText();
		Assert.assertEquals("Sauce Labs Backpack", actual);
		
	}
	
	public void TextThankYou() throws InterruptedException
	{
		WebElement TText = driver.findElement(Ethanks);
		String actual = TText.getText();
		Assert.assertEquals("Thank you for your order!", actual);
		Thread.sleep(2000);
		
		
	}
	public void BackButton()
	{
		driver.findElement(Eback).click();
		
	}
	
	
	}
	
	
	
	
	
	


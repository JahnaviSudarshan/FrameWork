package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.BasePage;

public class FlipkartLogin extends BasePage {
	
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement uname;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pwd;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement login;
	
	@FindBy(xpath = "(//div[.='Grocery'])[2]")
	private WebElement grocery;
	
	@FindBy(xpath = "//input[@name='pincode']")
	private WebElement pincode;
	
	@FindBy(xpath = "//input[@name='q']")
	private WebElement search;
	
	@FindBy(xpath ="(//span[.='Add Item'])[1]")
	private WebElement sugarAdd;
	
	@FindBy(xpath ="(//span[.='Cart'])[1]")
	private WebElement cart;
	
	@FindBy(xpath ="(//span[.='View All'])[1]")
	private WebElement viewall;
	
	@FindBy(xpath ="(//img[@src='data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIxMiIgaGVpZ2h0PSIyIiB2aWV3Qm94PSIwIDAgMTIgMiI+CiAgICA8cGF0aCBmaWxsPSIjMjg3NEYwIiBmaWxsLXJ1bGU9ImV2ZW5vZGQiIGQ9Ik0xMiAySDBWMGgxMnoiLz4KPC9zdmc+Cg=='])[1]")
	private WebElement deleteitem;
	
	
	
	public FlipkartLogin(WebDriver driver)
	{
		super(driver);
	}

	public void setuserName(String un)
	{
		uname.sendKeys(un);
	}
	
	public void setPassword(String pwds)
	{
		pwd.sendKeys(pwds);
	}
	
	public void button_click()
	{
		login.click();
	}
	
	public void grocery_click()
	{
		grocery.click();
	}
	
	public void cart_click()
	{
		cart.click();
	}
	
	public void view_click()
	{
		viewall.click();
	}
	
	public void delete_click()
	{
		deleteitem.click();
	}
	
	public void setpincode(String pin)
	{
		pincode.sendKeys(pin);
	}
	
	public void searchDetails(String srch) 
	{
		search.sendKeys(srch);	
	}
	
	public void item1Click()
	{
		sugarAdd.click();
	}
	
}

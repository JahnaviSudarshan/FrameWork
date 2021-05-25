package test_scripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Generic_Read_Excel;
import pom_scripts.FlipkartLogin;

public class TestLogin extends Base_Test {

	@Test
	public void login() throws Exception
	{
		String username = Generic_Read_Excel.getData("TestCase1", 0, 0);
		String password = Generic_Read_Excel.getData("TestCase1", 0 ,1);
		FlipkartLogin fp = new FlipkartLogin(driver);
		fp.setuserName(username);
		fp.setPassword(password);
		fp.button_click();
		Thread.sleep(3000);
		fp.grocery_click();
		fp.setpincode("560097");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		fp.searchDetails("Sugar");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		fp.item1Click();
		Thread.sleep(3000);
		fp.grocery_click();
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		fp.searchDetails("Toor Dal");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		fp.item1Click();
		Thread.sleep(3000);
		fp.grocery_click();
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		fp.searchDetails("Maida");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		fp.item1Click();
		Thread.sleep(3000);
		fp.cart_click();
		Thread.sleep(3000);
		fp.view_click();
		Thread.sleep(3000);
		fp.delete_click();
		System.our.println("1");

	}
	
}

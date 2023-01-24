package com.cjc;

public class Test 
{
	public static void main(String args[])
	{
		System.out.println("Hello");
		System.out.println("Hello Git");
		System.setProperty("webdriver.chrome.driver","C:\Users\user\Desktop\seleniumjar\109\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
	}

}

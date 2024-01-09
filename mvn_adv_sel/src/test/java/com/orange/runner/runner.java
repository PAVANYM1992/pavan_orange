package com.orange.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.orange.genric.baseclass;

public class runner extends baseclass{

@Test
public void run() throws InterruptedException
{
	driver.findElement(By.name("username")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.className("oxd-userdropdown-name")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	Thread.sleep(2000);
}

}

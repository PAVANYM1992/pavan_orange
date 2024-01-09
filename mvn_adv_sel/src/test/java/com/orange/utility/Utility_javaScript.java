package com.orange.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.graphbuilder.curve.Point;

public class Utility_javaScript {
	public static void enter_disabled(WebDriver driver, String data,WebElement ele)
	  {
		  JavascriptExecutor jss=Utility_Object.javascript(driver);
		  jss.executeScript("arguments[0].value=' "+data+" '",ele);
	  }
	  
	  public static void scroll_to_element(WebDriver driver, WebElement ele) 
	  {
		  JavascriptExecutor jss=Utility_Object.javascript(driver);
		  jss.executeScript("arguments[0].scollIntoView();",ele);
	  }
	  
	  public static void disabled_button(WebDriver driver, WebElement ele)
	  {
		  JavascriptExecutor jss=Utility_Object.javascript(driver);
		  jss.executeScript("arguments[0].click();",ele);
	  }
	  
	  public static void Hidden_element(WebDriver driver,WebElement ele, String data)
	  {
		  JavascriptExecutor jss=Utility_Object.javascript(driver);
		  jss.executeScript("arguments[0].value=' "+data+" '",ele);
	  }	  

	  public static void scroll_By_pageup_pagedown(WebDriver driver,int a,int b)
	  {
		  JavascriptExecutor jss=Utility_Object.javascript(driver);
		  jss.executeScript("window.scrollBy("+a+","+b+")"); 
		  //scroll down (0,500)
		  //scroll up (0,-500)
	  }
		  
	  public static void scroll_ToAn_Element_And_Interact(WebDriver driver,WebElement ele)
	  {
		  JavascriptExecutor jss=Utility_Object.javascript(driver);
		  org.openqa.selenium.Point location = ele.getLocation();
		  int x = location.getX();
		  int y = location.getY();
		  jss.executeScript("window.scrollBy("+x+","+y+")");
		  ele.click();
}
}

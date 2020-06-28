package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers {
	public RemoteWebDriver driver;
	public static Properties prop;
	
	
	public void loadObjects() {
		try {
			prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void unloadObjects() {
		prop=null;
	}
	

	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
	try {
		 if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox")) {	
				System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver","./driver/IEdriver.exe");
				driver = new InternetExplorerDriver();	
			}else if(browser.equalsIgnoreCase("opera")) {
				System.setProperty("webdriver.opera.driver","./drivers/operadriver.exe");
				driver = new OperaDriver();
			}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//System.out.println("The brwoser "+browser+" is launched with URL: "+url+" successfully");
		reportStep("The brwoser "+browser+" is launched with URL: "+url+" successfully", "pass");
	} catch (SessionNotCreatedException e) {
		// TODO Auto-generated catch block
		//System.err.println("The browser "+browser+" is not launched due to session not created error");
		reportStep("The browser "+browser+" is not launched due to session not created error", "fail");
	} catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The browser "+browser+" is not launched due to unknown error");
		reportStep("The browser "+browser+" is not launched due to unknown error", "fail");
	} 
	}

	@Override
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with id "+idValue+" is entered with data "+data);
			reportStep("The element with id "+idValue+" is entered with data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+" is not found in DOM");
			reportStep("The element with id "+idValue+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not visible in application");
			reportStep("The element with id "+idValue+" is not visible in application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not interactable");
			reportStep("The element with id "+idValue+" is not interactable", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not stable in application");
			reportStep("The element with id "+idValue+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with id "+idValue+" is not entered with data "+data+" due to unknown error", "fail");
		} 
		}

	@Override
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name "+nameValue+" is entered with data "+data);
			reportStep("The element with name "+nameValue+" is entered with data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+nameValue+" is not found in DOM");
			reportStep("The element with name "+nameValue+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not visible in application");
			reportStep("The element with name "+nameValue+" is not visible in application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not interacatable");
			reportStep("The element with name "+nameValue+" is not interacatable", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not stable in application");
			reportStep("The element with name "+nameValue+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error", "fail");
		} 
	}

	@Override
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with xpath "+xpathValue+ " is entered with data "+data);
			reportStep("The element with xpath "+xpathValue+ " is entered with data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathValue+" is not found in DOM");
			reportStep("The element with xpath "+xpathValue+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not visible in application");
			reportStep("The element with xpath "+xpathValue+" is not visible in application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not interactable");
			reportStep("The element with xpath "+xpathValue+" is not interactable", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not stable in application");
			reportStep("The element with xpath "+xpathValue+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error", "fail");
		} 
	}

	@Override
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String newtitle=driver.getTitle();
			if (newtitle.equals(title)) {
				//System.out.println("The title of the browser "+newtitle+" is matching exactly with "+title);
				reportStep("The title of the browser "+newtitle+" is matching exactly with "+title, "pass");
			} else {
				//System.err.println("The title of the browser "+newtitle+" is not matching with "+title);
				reportStep("The title of the browser "+newtitle+" is not matching with "+title, "fail");
			}
		} catch (SessionNotCreatedException e) {
		// TODO Auto-generated catch block
			//System.err.println("The browser is not launched due to session not created error");
			reportStep("The browser is not launched due to session not created error", "fail");
		} catch (WebDriverException e) {
		// TODO: handle exception
			//System.err.println("The browser is not launched due to unknown error");
			reportStep("The browser is not launched due to unknown error", "fail");
		}
	}


	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {	
			String newtext=driver.findElementById(id).getText();
			if (newtext.equals(text)) {
				//System.out.println("The element with id "+id+" which has text "+newtext+" is matching exactly with "+text);
				reportStep("The element with id "+id+" which has text "+newtext+" is matching exactly with "+text, "pass");
			} else {
				//System.err.println("The element with id "+id+" which has text "+newtext+" is not matching with "+text);
				reportStep("The element with id "+id+" which has text "+newtext+" is not matching with "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in DOM");
			reportStep("The element with id "+id+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in application");
			reportStep("The element with id "+id+" is not visible in application", "fail");
		} /*
			 * catch (ElementNotInteractableException e) { // TODO: handle exception
			 * System.err.println("The element with id "+id+" is not interactable"); }
			 */ catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in application");
			reportStep("The element with id "+id+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exceptionelement with id "+id+" is
			//System.err.println("The text of id "+id+" is not verified due to unknown error");
			reportStep("The text of id "+id+" is not verified due to unknown error", "fail");
		} 
	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String newtext=driver.findElementByXPath(xpath).getText();
			if (newtext.equals(text)) {
				//System.out.println("The element with xpath "+xpath+" which has text "+newtext+" is matching exactly with "+text);
				reportStep("The element with xpath "+xpath+" which has text "+newtext+" is matching exactly with "+text, "pass");
			} else {
				//System.err.println("The element with xpath "+xpath+" which has text "+newtext+" is not matching with "+text);
				reportStep("The element with xpath "+xpath+" which has text "+newtext+" is not matching with "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.out.println("The element with xpath "+xpath+" is not found in DOM");
			reportStep("The element with id "+xpath+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in application");
			reportStep("The element with xpath "+xpath+" is not visible in application", "fail");
			/*
			 * } catch (ElementNotInteractableException e) { // TODO: handle exception
			 * System.err.println("The element with xpath "+xpath+" is not interactable");
			 */
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in application");
			reportStep("The element with xpath "+xpath+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The text of xpath "+xpath+" is not verified due to unknown error");
			reportStep("The text of xpath "+xpath+" is not verified due to unknown error", "fail");
		} 
	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String newtext=driver.findElementByXPath(xpath).getText();
			if (newtext.contains(text)) {
				//System.out.println("The element with xpath "+xpath+" which has text "+newtext+" contains sequence of text "+text);
				reportStep("The element with xpath "+xpath+" which has text "+newtext+" contains sequence of text "+text, "pass");
			} else {
				//System.err.println("The element with xpath "+xpath+" which has text "+newtext+" does not contains any sequence of text "+text);
				reportStep("The element with xpath "+xpath+" which has text "+newtext+" does not contains any sequence of text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in DOM");
			reportStep("The element with xpath "+xpath+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in application");
			reportStep("The element with xpath "+xpath+" is not visible in application", "fail");
			/*
			 * } catch (ElementNotInteractableException e) { // TODO: handle exception
			 * System.err.println("The element with xpath "+xpath+" is not interactable");
			 */
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in application");
			reportStep("The element with xpath "+xpath+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The text of the xpath "+xpath+" is not verified partially due to unknown error");
			reportStep("The text of the xpath "+xpath+" is not verified partially due to unknown error", "fail");
		}
	}

	@Override
	public void mouseHoverById(String id) {
		// TODO Auto-generated method stub
		try {
			Actions builder = new Actions(driver);
			WebElement element=driver.findElementById(id);
			builder.moveToElement(element).perform();
			//System.out.println("The mouse pointer is moved to the element with id "+id);
			reportStep("The mouse pointer is moved to the element with id "+id, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in DOM");
			reportStep("The element with id "+id+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in application");
			reportStep("The element with id "+id+" is not visible in application", "fail");
			/*
			 * } catch (ElementNotInteractableException e) { // TODO: handle exception
			 * System.err.println("The element with id "+id+" is not interactable");
			 */
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in application");
			reportStep("The element with id "+id+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The mouse pointer is not moved to the element with id "+id+" due to unknown error");
			reportStep("The mouse pointer is not moved to the element with id "+id+" due to unknown error", "fail");
		} 
	}

	@Override
	public void mouseHoverByXPath(String XPath) {
		// TODO Auto-generated method stub
		try {
			Actions builder = new Actions(driver);
			WebElement element=driver.findElementByXPath(XPath);
			builder.moveToElement(element).perform();
			//System.out.println("The mouse pointer is moved to the element with xpath "+XPath);
			reportStep("The mouse pointer is moved to the element with xpath "+XPath, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+XPath+" is not found in DOM");
			reportStep("The element with xpath "+XPath+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+XPath+" is not visible in application");
			reportStep("The element with xpath "+XPath+" is not visible in application", "fail");
			/*
			 * } catch (ElementNotInteractableException e) { // TODO: handle exception
			 * System.err.println("The element with xpath "+XPath+" is not interactable");
			 */
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+XPath+" is not stable in application");
			reportStep("The element with xpath "+XPath+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The mouse pointer is not moved to the element with xpath "+XPath+" due to unknown error");
			reportStep("The mouse pointer is not moved to the element with xpath "+XPath+" due to unknown error", "fail");
		} 
	}

	@Override
	public void mouseHoverByLinkText(String linkText) {
		// TODO Auto-generated method stub
		try {
			Actions builder = new Actions(driver);
			WebElement element=driver.findElementByLinkText(linkText);
			builder.moveToElement(element).perform();
			//System.out.println("The mouse pointer is moved to the element with link text "+linkText);
			reportStep("The mouse pointer is moved to the element with link text "+linkText, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with link text "+linkText+" is not found in DOM");
			reportStep("The element with link text "+linkText+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with link text "+linkText+" is not visible in application");
			reportStep("The element with link text "+linkText+" is not visible in application", "fail");
			/*
			 * } catch (ElementNotInteractableException e) { // TODO: handle exception
			 * System.err.println("The element with link text "
			 * +linkText+" is not interactable");
			 */
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with link text "+linkText+" is not stable in application");
			reportStep("The element with link text "+linkText+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The mouse pointer is not moved to the element with link text "+linkText+" due to unknown error");
			reportStep("The mouse pointer is not moved to the element with link text "+linkText+" due to unknown error", "fail");
		} 
	}

	@Override
	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with id "+id+" is clicked");
			reportStep("The element with id "+id+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not found in DOM");
			reportStep("The element with id "+id+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in application");
			reportStep("The element with id "+id+" is not visible in application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not properly clicked due to interception");
			reportStep("The element with id "+id+" is not properly clicked due to interception", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in application");
			reportStep("The element with id "+id+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not clicked due to unknown error");
			reportStep("The element with id "+id+" is not clicked due to unknown error", "fail");
		} 
	}

	@Override
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with class name "+classVal+" is clicked");
			reportStep("The element with class name "+classVal+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with class name "+classVal+" is not found in DOM");
			reportStep("The element with class name "+classVal+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with class name "+classVal+" is not visible in application");
			reportStep("The element with class name "+classVal+" is not visible in application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with class name "+classVal+" is not properly clicked due to interception");
			reportStep("The element with class name "+classVal+" is not properly clicked due to interception", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with class name "+classVal+" is not stable in application");
			reportStep("The element with class name "+classVal+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with class name "+classVal+" is not clicked due to unknown error");
			reportStep("The element with class name "+classVal+" is not clicked due to unknown error", "fail");
		} 
	}

	@Override
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with name "+name+" is clicked");
			reportStep("The element with name "+name+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not found in DOM");
			reportStep("The element with name "+name+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not visible in application");
			reportStep("The element with name "+name+" is not visible in application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not properly clicked due to interception");
			reportStep("The element with name "+name+" is not properly clicked due to interception", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not stable in application");
			reportStep("The element with name "+name+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not clicked due to unknown error");
			reportStep("The element with name "+name+" is not clicked due to unknown error", "fail");
		} 
	}

	@Override
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with link "+name+" is clicked");
			reportStep("The element with link "+name+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with link "+name+" is not found in DOM");
			reportStep("The element with link "+name+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not visible in application");
			reportStep("The element with link "+name+" is not visible in application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not properly clicked due to interception");
			reportStep("The element with link "+name+" is not properly clicked due to interception", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not stable in application");
			reportStep("The element with link "+name+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not clicked due to unknown error");
			reportStep("The element with link "+name+" is not clicked due to unknown error", "fail");
		} 
	}

	@Override
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with link "+name+" is clicked");
			reportStep("The element with link "+name+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with link "+name+" is not found in DOM");
			reportStep("The element with link "+name+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not visible in application");
			reportStep("The element with link "+name+" is not visible in application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not properly clicked due to interception");
			reportStep("The element with link "+name+" is not properly clicked due to interception", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not stable in application");
			reportStep("The element with link "+name+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not clicked due to unknown error");
			reportStep("The element with link "+name+" is not clicked due to unknown error", "fail");
		}
	}

	@Override
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked");
			reportStep("The element with xpath "+xpathVal+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in application");
			reportStep("The element with xpath "+xpathVal+" is not visible in application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not properly clicked due to interception");
			reportStep("The element with xpath "+xpathVal+" is not properly clicked due to interception", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in application");
			reportStep("The element with xpath "+xpathVal+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error", "fail");
		} 
	}

	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked");
			reportStep("The element with xpath "+xpathVal+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in application");
			reportStep("The element with xpath "+xpathVal+" is not visible in application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not properly clicked due to interception");
			reportStep("The element with xpath "+xpathVal+" is not properly clicked due to interception", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in application");
			reportStep("The element with xpath "+xpathVal+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error", "fail");
		} 
	}

	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String text = null;
		try {
			text=driver.findElementById(idVal).getText();
			//System.out.println("The text of element with id "+idVal+" is "+text);
			reportStep("The text of element with id "+idVal+" is "+text, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idVal+" is not found in DOM");
			reportStep("The element with id "+idVal+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not visible in application");
			reportStep("The element with id "+idVal+" is not visible in application", "fail");
			/*
			 * } catch (ElementNotInteractableException e) { // TODO: handle exception
			 * System.err.println("The element with id "+idVal+" is not interactable");
			 */
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not stable in application");
			reportStep("The element with id "+idVal+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The text of element with id "+idVal+" is not retrieved due to unknown error");
			reportStep("The text of element with id "+idVal+" is not retrieved due to unknown error", "fail");
		} 
		return text;
	}

	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String text = null;
		try {
			text=driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The text of element with xpath "+xpathVal+" is "+text);
			reportStep("The text of element with xpath "+xpathVal+" is "+text, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in application");
			reportStep("The element with xpath "+xpathVal+" is not visible in application", "fail");
			/*
			 * } catch (ElementNotInteractableException e) { // TODO: handle exception
			 * System.err.println("The element with xpath "+xpathVal+" is not interactable"
			 * );
			 */
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in application");
			reportStep("The element with xpath "+xpathVal+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The text of element with xpath "+xpathVal+" is not retrieved due to unknown error");
			reportStep("The text of element with xpath "+xpathVal+" is not retrieved due to unknown error", "fail");
		}
		return text;
	}

	@Override
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown = driver.findElementById(id);
			Select s = new Select(dropdown);
			s.selectByVisibleText(value);
			//System.out.println("The dropdown element with id "+id+" is selected by visible text "+value);
			reportStep("The dropdown element with id "+id+" is selected by visible text "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The dropdown element with id "+id+" is not found in DOM");
			reportStep("The dropdown element with id "+id+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with id "+id+" is not visible in application");
			reportStep("The dropdown element with id "+id+" is not visible in application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with id "+id+" is not selectable");
			reportStep("The dropdown element with id "+id+" is not selectable", "fail");
			/*
			 * } catch (ElementNotInteractableException e) { // TODO: handle exception
			 * System.err.println("The dropdown element with id "+id+" is not interactable"
			 * );
			 */
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with id "+id+" is not stable in application");
			reportStep("The dropdown element with id "+id+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with id "+id+" is not selected by visible text "+value+" due to unknown error");
			reportStep("The dropdown element with id "+id+" is not selected by visible text "+value+" due to unknown error", "fail");
		} 
	}

	@Override
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown=driver.findElementById(id);
			Select s = new Select(dropdown);
			s.selectByIndex(value);
			//System.out.println("The dropdown element with id "+id+" is selected by index "+value);
			reportStep("The dropdown element with id "+id+" is selected by index "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The dropdown element with id "+id+" is not found in DOM");
			reportStep("The dropdown element with id "+id+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with id "+id+" is not visible in application");
			reportStep("The dropdown element with id "+id+" is not visible in application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with id "+id+" is not selectable");
			reportStep("The dropdown element with id "+id+" is not selectable", "fail");
			/*
			 * } catch (ElementNotInteractableException e) { // TODO: handle exception
			 * System.err.println("The dropdown element with id "+id+" is not interactable"
			 * );
			 */
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with id "+id+" is not stable in application");
			reportStep("The dropdown element with id "+id+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with id "+id+" is not selected by index "+value+" due to unknown error");
			reportStep("The dropdown element with id "+id+" is not selected by index "+value+" due to unknown error", "fail");
		} 
	}

	@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> session1=driver.getWindowHandles();
			for(String sessiona:session1)
			{
				driver.switchTo().window(sessiona);
				break;
			}
			//System.out.println("The browser is switched to the parent window");
			reportStep("The browser is switched to the parent window", "pass");
		} catch (SessionNotCreatedException e) {
			// TODO: handle exception
			//System.err.println("The browser is not switched to parent window due to session not created error");
			reportStep("The browser is not switched to parent window due to session not created error", "fail");
		} catch (NoSuchWindowException e) {
			// TODO: handle exception
			//System.err.println("The browser is not switched due to parent window not available");
			reportStep("The browser is not switched due to parent window not available", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is not switched to parent window due to unknown error");
			reportStep("The browser is not switched to parent window due to unknown error", "fail");
		} 
	}

	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> session1=driver.getWindowHandles();
			for(String sessiona:session1)
			{
				driver.switchTo().window(sessiona);
			}
			//System.out.println("The broswer is switched to the last window");
			reportStep("The broswer is switched to the last window", "pass");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser is not switched to last window due to session not created error");
			reportStep("The browser is not switched to last window due to session not created error", "fail");
		} catch (NoSuchWindowException e) {
			// TODO: handle exception
			//System.err.println("The browser is not switched due to last window not available");
			reportStep("The browser is not switched due to last window not available", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is not switched to last window due to unknown error");
			reportStep("The browser is not switched to last window due to unknown error", "fail");
		} 
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The alert displayed is accepted");
			reportStep("The alert displayed is accepted", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no alert displayed in the browser to accept");
			reportStep("There is no alert displayed in the browser to accept", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert is not accepted due to unknown error");
			reportStep("The alert is not accepted due to unknown error", "fail");
		}
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The alert displayed is dismissed");
			reportStep("The alert displayed is dismissed", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no alert displayed in the browser to dismiss");
			reportStep("There is no alert displayed in the browser to dismiss", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert is not dismissed due to unknown error");
			reportStep("The alert is not dismissed due to unknown error", "fail");
		}
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		String alerttext = null;
		try {
			alerttext=driver.switchTo().alert().getText();
			//System.out.println("The text of alert displayed in browser is "+alerttext);
			reportStep("The text of alert displayed in browser is "+alerttext, "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no alert displayed in browser to get text");
			reportStep("There is no alert displayed in browser to get text", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The text of the alert is not retrieved due to unknown error");
			reportStep("The text of the alert is not retrieved due to unknown error", "fail");
		}
		return alerttext;
	}

	@Override
	public long takeSnap() {
		// TODO Auto-generated method stub
		
		long number=(long) (Math.floor(Math.random()*100000000)+100000);
		
		try {
			File temp = driver.getScreenshotAs(OutputType.FILE);
				File dest = new File("./reports/screenshots/"+number+".png");
				 FileUtils.copyFile(temp, dest);
			/*
			 * System.out.println("The Screenshot has taken and saved in destination folder"
			 * );
			 */
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Screenshot was not taken due to unknown error");
			reportStep("The Screenshot was not taken due to unknown error", "fail");
		} catch (IOException e) {
			// TODO: handle exception
			//System.err.println("The Screenshot was not taken due to interuppted I/O exception");
			reportStep("The Screenshot was not taken due to interuppted I/O exception", "fail");
		}
		return number;
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The browser is closed");
			reportStep("The browser is closed", "pass", false);
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser is not launched due to session not created error");
			reportStep("The browser is not launched due to session not created error", "fail", false);
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is not launched due to unknown error");
			reportStep("The browser is not launched due to unknown error", "fail", false);
		}
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("All the browsers which were opened are closed");
			reportStep("All the browsers which were opened are closed", "pass" , false);
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is not launched due to unknown error");
			reportStep("The browser is not launched due to unknown error", "fail", false);
			
		}
	}

	@Override
	public void selectVisibileTextByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown = driver.findElementByName(name);
			Select s = new Select(dropdown);
			s.selectByVisibleText(value);
			//System.out.println("The dropdown element with name "+name+" is selected by visible text "+value);
			reportStep("The dropdown element with name "+name+" is selected by visible text "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The dropdown element with name "+name+" is not found in DOM");
			reportStep("The dropdown element with name "+name+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with name "+name+" is not visible in application");
			reportStep("The dropdown element with name "+name+" is not visible in application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with name "+name+" is not selectable");
			reportStep("The dropdown element with name "+name+" is not selectable", "fail");
			/*
			 * } catch (ElementNotInteractableException e) { // TODO: handle exception
			 * System.err.println("The dropdown element with id "+id+" is not interactable"
			 * );
			 */
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with name "+name+" is not stable in application");
			reportStep("The dropdown element with name "+name+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with name "+name+" is not selected by visible text "+value+" due to unknown error");
			reportStep("The dropdown element with name "+name+" is not selected by visible text "+value+" due to unknown error", "fail");
		} 
	}

	@Override
	public void selectValueById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown = driver.findElementById(id);
			Select s = new Select(dropdown);
			s.selectByValue(value);
			//System.out.println("The dropdown element with id "+id+" is selected by value "+value);
			reportStep("The dropdown element with id "+id+" is selected by value "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The dropdown element with id "+id+" is not found in DOM");
			reportStep("The dropdown element with id "+id+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with id "+id+" is not visible in application");
			reportStep("The dropdown element with id "+id+" is not visible in application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with id "+id+" is not selectable");
			reportStep("The dropdown element with id "+id+" is not selectable", "fail");
			/*
			 * } catch (ElementNotInteractableException e) { // TODO: handle exception
			 * System.err.println("The dropdown element with id "+id+" is not interactable"
			 * );
			 */
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with id "+id+" is not stable in application");
			reportStep("The dropdown element with id "+id+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with id "+id+" is not selected by value "+value+" due to unknown error");
			reportStep("The dropdown element with id "+id+" is not selected by value "+value+" due to unknown error", "fail");
		} 
	}

	@Override
	public void selectVisibileTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown = driver.findElementByXPath(xpath);
			Select s = new Select(dropdown);
			s.selectByVisibleText(value);
			//System.out.println("The dropdown element with xpath "+xpath+" is selected by visible text "+value);
			reportStep("The dropdown element with xpath "+xpath+" is selected by visible text "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The dropdown element with xpath "+xpath+" is not found in DOM");
			reportStep("The dropdown element with xpath "+xpath+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with xpath "+xpath+" is not visible in application");
			reportStep("The dropdown element with xpath "+xpath+" is not visible in application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with xpath "+xpath+" is not selectable");
			reportStep("The dropdown element with xpath "+xpath+" is not selectable", "fail");
			/*
			 * } catch (ElementNotInteractableException e) { // TODO: handle exception
			 * System.err.println("The dropdown element with id "+id+" is not interactable"
			 * );
			 */
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with xpath "+xpath+" is not stable in application");
			reportStep("The dropdown element with xpath "+xpath+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with xpath "+xpath+" is not selected by visible text "+value+" due to unknown error");
			reportStep("The dropdown element with xpath "+xpath+" is not selected by visible text "+value+" due to unknown error", "fail");
		} 
	}

	@Override
	public void selectValueByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown = driver.findElementByXPath(xpath);
			Select s = new Select(dropdown);
			s.selectByValue(value);
			//System.out.println("The dropdown element with xpath "+xpath+" is selected by value "+value);
			reportStep("The dropdown element with xpath "+xpath+" is selected by value "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The dropdown element with xpath "+xpath+" is not found in DOM");
			reportStep("The dropdown element with xpath "+xpath+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with xpath "+xpath+" is not visible in application");
			reportStep("The dropdown element with xpath "+xpath+" is not visible in application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with xpath "+xpath+" is not selectable");
			reportStep("The dropdown element with xpath "+xpath+" is not selectable", "fail");
			/*
			 * } catch (ElementNotInteractableException e) { // TODO: handle exception
			 * System.err.println("The dropdown element with id "+id+" is not interactable"
			 * );
			 */
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with xpath "+xpath+" is not stable in application");
			reportStep("The dropdown element with xpath "+xpath+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The dropdown element with xpath "+xpath+" is not selected by visible text "+value+" due to unknown error");
			reportStep("The dropdown element with xpath "+xpath+" is not selected by value "+value+" due to unknown error", "fail");
		} 
	}
		

	@Override
	public String getAttributeByXpath(String xpathVal, String attribute) {
		// TODO Auto-generated method stub
		String text = null;
		try {
			text=driver.findElementByXPath(xpathVal).getAttribute(attribute);
			//System.out.println("The text of element with xpath "+xpathVal+" is "+text);
			reportStep("The text of element with xpath "+xpathVal+" is "+text, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in application");
			reportStep("The element with xpath "+xpathVal+" is not visible in application", "fail");
			/*
			 * } catch (ElementNotInteractableException e) { // TODO: handle exception
			 * System.err.println("The element with xpath "+xpathVal+" is not interactable"
			 * );
			 */
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in application");
			reportStep("The element with xpath "+xpathVal+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The text of element with xpath "+xpathVal+" is not retrieved due to unknown error");
			reportStep("The text of element with xpath "+xpathVal+" is not retrieved due to unknown error", "fail");
		} 
		return text;
	}

	@Override
	public void verifyAttributeContainsByXpath(String xpath, String attribute, String text) {
		// TODO Auto-generated method stub
		try {
			String newtext=driver.findElementByXPath(xpath).getAttribute(attribute);
			if (newtext.contains(text)) {
				//System.out.println("The element with xpath "+xpath+" which has text "+newtext+" contains sequence of text "+text);
				reportStep("The element with xpath "+xpath+" which has text "+newtext+" contains sequence of text "+text, "pass");
			} else {
				//System.err.println("The element with xpath "+xpath+" which has text "+newtext+" does not contains any sequence of text "+text);
				reportStep("The element with xpath "+xpath+" which has text "+newtext+" does not contains any sequence of text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in DOM");
			reportStep("The element with xpath "+xpath+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in application");
			reportStep("The element with xpath "+xpath+" is not visible in application", "fail");
			/*
			 * } catch (ElementNotInteractableException e) { // TODO: handle exception
			 * System.err.println("The element with xpath "+xpath+" is not interactable");
			 */
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in application");
			reportStep("The element with xpath "+xpath+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The text of the xpath "+xpath+" is not verified partially due to unknown error");
			reportStep("The text of the xpath "+xpath+" is not verified partially due to unknown error", "fail");
		}
	}
	
	@Override
	public void sendTabKeyById(String ID) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(ID).sendKeys(Keys.TAB);
			//System.out.println("The Tab Key is sent after element with ID "+ID);
			reportStep("The Tab Key is sent after element with ID "+ID, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with ID "+ID+" is not found in DOM");
			reportStep("The element with ID "+ID+" is not found in DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with ID "+ID+" is not visible in application");
			reportStep("The element with ID "+ID+" is not visible in application", "fail");
			/*
			 * } catch (ElementNotInteractableException e) { // TODO: handle exception
			 * System.err.println("The element with xpath "+xpath+" is not interactable");
			 */
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with ID "+ID+" is not stable in application");
			reportStep("The element with ID "+ID+" is not stable in application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The tab key is not sent after element with ID "+ID+" due to unknown error");
			reportStep("The tab key is not sent after element with ID "+ID+" due to unknown error", "fail");
		} 
	}
		
public String replaceXpath(String xpath, String value) {
		
		String finalXpath=null;
		if(xpath.contains("$option$")) {
			 finalXpath=xpath.replace("$option$", value);		
		}
		return finalXpath;
	}


	
	}	

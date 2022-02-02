package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

public static WebDriver driver;
	
	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void maximize() {

		driver.manage().window().maximize();
	}
	public  WebElement findlocatorById(String att) {
		WebElement element = driver.findElement(By.id(att));
		return element;
	}
	public WebElement findLocatorByName(String att) {
	WebElement element = driver.findElement(By.name(att));
	return element;
	}
	public WebElement findLocatorByClass(String att) {
    WebElement element = driver.findElement(By.className(att));
	return element;
	}
	public WebElement findLocatorByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}
	public void sendKeys(WebElement element, String data) {
	element.sendKeys(data);
	}
	public void click(WebElement element) {
    element.click();
	}
	public String getTitle() {
    String title = driver.getTitle();
	return title;
	}
	public String getCurrentUrl() {
    String currentUrl = driver.getCurrentUrl();
	return currentUrl;
	}
	public String getText(WebElement element) {
    String text = element.getText();
	return text;
	}
	public  String getAttributevalue(WebElement element) {
		
		String name = element.getAttribute("value");
		return name;
		}
	public String getAttribute(WebElement element,String attributeName) {
		
		String name = element.getAttribute(attributeName);
		return name;
		

	}
	
	
	public void selectOptionByText(WebElement element, String data) {
	Select select = new Select(element);
	select.selectByVisibleText(data);
	}
	public void selectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public void selectByAttribute(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByValue(data);
	}
	public void typeJs(WebElement element , String text) {
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		exe.executeScript("arguments[0].setAttribute('value','"+text+"')", element);
	}
	public void clickJs(WebElement element) {
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		exe.executeScript("arguments[0].click()", element);
	}
	public void quit() {
		driver.quit();
	}
	public static void close() {
    driver.close();
	}
	public void accept() {
	Alert a = driver.switchTo().alert();
	a.accept();
	}
	public void cancel() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
    }
	public void switchToFrameByIndex(int index) {
    driver.switchTo().frame(index);
	}
	public void switchToFrameByname(String data) {
	driver.switchTo().frame(data);
	}
	public void defaultContent() {
	driver.switchTo().defaultContent();
	}
	public void contextClick(WebElement element) {
	Actions a = new Actions(driver);
	a.contextClick(element).perform();
	}
	public void moveToElement(WebElement element) {
    Actions a = new Actions(driver);
    a.moveToElement(element).perform();
	}
	public void navigateTo(String url) {
	driver.navigate().to(url);
	}
	public void navigateBack() {
    driver.navigate().back();
	}
	public void navigateForward() {
    driver.navigate().forward();
	}
	public void navigateRefresh() {
	driver.navigate().refresh();
	}
	public boolean isDisplayed(WebElement element) {
	boolean displayed = element.isDisplayed();
	return displayed;
	}
	public boolean isSelected(WebElement element) {
    boolean selected = element.isSelected();
	return selected;
	}
	public boolean isEnabled(WebElement element) {
	boolean enabled = element.isEnabled();
	return enabled;
	}
	public boolean isMultiple(WebElement element) {
	Select select = new Select(element);
	boolean multiple = select.isMultiple();
	return multiple;
	}
	public void deSelectByIndex(WebElement element, int index) {
    Select select = new Select(element);
    select.deselectByIndex(index);
	}
	public void deSelectByValue(WebElement element, String data) {
	Select select = new Select(element);
	select.deselectByValue(data);
	}
	public void deSelectByVisibleText(WebElement element, String data) {
	Select select = new Select(element);
	select.deselectByVisibleText(data);
	}
	public void deSelectAll(WebElement element) {
	Select select = new Select(element);
	select.deselectAll();
	}
	public void dragAndDrop(WebElement source, WebElement destination) {
	Actions actions = new Actions(driver);
	actions.dragAndDrop(source, destination).perform();
	}
	public int length(String s) {
	int length = s.length();
	return length;
	}
	public boolean equal(String s1, String s2) {
	boolean equals = s1.equals(s2);
	return equals;
	}
	public boolean equalIgnoreCase(String s1, String s2) {
	boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
	return equalsIgnoreCase;
	}
	public boolean contains(String s1, String s2) {
	boolean contains = s1.contains(s2);
	return contains;
	}
	public boolean startsWith(String s1, String s2) {
    boolean startsWith = s1.startsWith(s2);
	return startsWith;
	}
	public boolean isEmpty(String s) {
	boolean empty = s.isEmpty();
	return empty;
	}
	public boolean createFolder(File file) {
	boolean mkdir = file.mkdir();
	return mkdir;
	}
	public boolean createFolders(File file) {
	boolean mkdirs = file.mkdirs();
	return mkdirs;
	}
	public boolean createaFile(File file) throws IOException {
		boolean createNewFile = file.createNewFile();
		return createNewFile;
	}
	public boolean canRead(File file) {
	boolean canRead = file.canRead();
	return canRead;
	}
	public boolean canWrite(File file) {
	boolean canWrite = file.canWrite();
	return canWrite;
	}
	public boolean canExecute(File file) {
		boolean canExecute = file.canExecute();
		return canExecute;
	}
	public boolean exist(File file) {
    boolean exists = file.exists();
	return exists;
	}
//	public String getData(String sheetname,int rownum,int cellnm) throws IOException {
	//	String data=null;
		//File file=new File("C:\\Users\\Shanavas S\\eclipse-workspace\\xcel\\xcel\\shanahotel.xlsx");
//		FileInputStream stream =new FileInputStream(file);
//		Workbook workbook=new XSSFWorkbook(stream);
//		Sheet sheet = workbook.getSheet(sheetname);
//		Row row = sheet.getRow(rownum);
//		Cell cell = row.getCell(cellnm);
//		int Type = cell.getCellType();
//		if (Type==1) {
//			 data = cell.getStringCellValue();
//			
//		}
//		if (Type==0) {
//			if (DateUtil.isCellDateFormatted(cell)) {
//				Date date = cell.getDateCellValue();
//				SimpleDateFormat dateformat= new SimpleDateFormat("dd-MMM-yy");
//			     data = dateformat.format(date);
//				
//			}else {
//				double d = cell.getNumericCellValue();
//				long l=(long)d;
//				 data = String.valueOf(l);
//			}
//			
//			
//		}
//		return data;
//	}
	public void update(String Sheetname,int rowno,int cellno,String Olddata,String Newdata) throws IOException {
		
//		File file=new File("C:\\\\Users\\\\Shanavas S\\\\eclipse-workspace\\\\xcel\\\\xcel\\\\Book1.xlsx");
//		FileInputStream stream =new FileInputStream(file);
//		Workbook workbook=new XSSFWorkbook(stream);
//		Sheet sheet = workbook.getSheet(Sheetname);
//		Row row = sheet.getRow(rowno);
//		Cell cell = row.getCell(cellno);
//		String data = cell.getStringCellValue();
//		if (data.equals(Olddata)) {
//			
//			cell.setCellValue(Newdata);
//			
//		}
//		FileOutputStream o=new FileOutputStream(file);
//		workbook.write(o);
//	}
//	
//	public void writeData(String sheetname,int rowno,int cellno,String data) throws IOException {
//		File file=new File("C:\\\\Users\\\\Shanavas S\\\\eclipse-workspace\\\\xcel\\\\xcel\\\\Book1.xlsx");
//		FileInputStream f =new FileInputStream(file);
//		Workbook wb=new XSSFWorkbook(f);
//		Sheet sh = wb.getSheet(sheetname);
//		Row r = sh.getRow(rowno);
//		Cell cell = r.createCell(cellno);
//	cell.setCellValue(data);
//	FileOutputStream o=new FileOutputStream(file);
//	wb.write(o);
//		
//		

	}


}

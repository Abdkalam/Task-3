package org.tes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

	public static WebDriver launch() {

		WebDriverManager.chromedriver().setup();
		 return driver = new ChromeDriver();
		
	}
	public static WebDriver launch2() {

		WebDriverManager.chromedriver().setup();
		 return driver = new FirefoxDriver();		
	}


	public static void link(String url) {

		driver.get(url);

	}

	public static void maxWindow() {
		driver.manage().window().maximize();

	}

	public static  void curretLink() {

		 String a = driver.getCurrentUrl();
		System.out.println(a);

	}

	public static void currnetTitle() {

		String a = driver.getTitle();
		System.out.println(a);

	}

	public static void fill(WebElement element, String data) {

		element.sendKeys(data);

	}

	public static String attri(WebElement ele) {
		return ele.getAttribute("value");

	}

	public static void clk(WebElement element) {

		element.click();
	}

	public static void tab1() throws AWTException {
		Robot c = new Robot();
		c.keyPress(KeyEvent.VK_TAB);
		c.keyRelease(KeyEvent.VK_TAB);
	}

	public static void enter1() throws AWTException {
		Robot c = new Robot();
		c.keyPress(KeyEvent.VK_ENTER);
		c.keyRelease(KeyEvent.VK_ENTER);
	}

	public static String excelRead(int rownum, int cellnum) throws IOException {
		File file = new File("C:\\Users\\Abdul\\eclipse-workspace\\Maven\\Excel\\Sheet2.xlsx");
		FileInputStream a = new FileInputStream(file);
		Workbook b = new XSSFWorkbook(a);
		Sheet s = b.getSheet("Sheet1");

		Row c = s.getRow(rownum);
		Cell cell = c.getCell(cellnum);
		int cellType = cell.getCellType();
		String Value = "";
		if (cellType == 1) {
			Value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
			Value = sim.format(date);
		} else {
			double vv = cell.getNumericCellValue();
			long li = (long) vv;

			Value = String.valueOf(li);

		}
		return Value;
		
	}

	public static void select(WebElement ele, String i) {
		Select b = new Select(ele);
		b.selectByValue(i);
		

	}

	public void scrshot(String filename) throws IOException {
		TakesScreenshot j = (TakesScreenshot) driver;
		File src = j.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Abdul\\eclipse-workspace\\Maven\\Folder\\" + filename);
		FileUtils.copyFile(src, des);

	}

	public static void writeFile(String url, int rownum, int colnum, String text) throws IOException {
		File file = new File(url);

		Workbook b = new XSSFWorkbook();
		Sheet cre = b.createSheet("Greens");
		Row creRow = cre.createRow(rownum);
		Cell creCell = creRow.createCell(colnum);
		creCell.setCellValue(text);
		FileOutputStream a = new FileOutputStream(file);
		b.write(a);
	}
	public static void dateandtime() {
		Date a=new Date();
		System.out.println(a);
	}

}

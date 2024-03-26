package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/v4/");
		WebElement Ikons=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/table/tbody"));
		File IKON1=Ikons.getScreenshotAs(OutputType.FILE);
		File SCTrg= new File("C:\\Users\\Sony\\eclipse-workspace\\Techflow568\\screenshot\\4ikons.png");
		FileUtils.copyFile(IKON1, SCTrg);

	}

}

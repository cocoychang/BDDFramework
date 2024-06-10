package utility;


import junit.framework.Assert;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import io.qameta.allure.Allure;


public class BaseDriver {
    public static WebDriver driver;



    public void assertEquals(String Actual, String Expected, String passed, String failed) throws IOException, InterruptedException {

        if(Actual == null || Actual == ""){
            Actual ="";
        }
        if(Actual.equals(Expected)){
            System.out.println(String.format("==== PASSED: Actual [%s] is equal to Expected [%s] ====", Actual, Expected));
            File screenshot = takeScreenshot(driver);
            Allure.addAttachment("Page Screenshot", FileUtils.openInputStream(screenshot));
        }else{
            System.out.println(String.format("==== FAILED: Actual [%s] is not equal to Expected [%s] ====", Actual, Expected));

            Assert.fail();
        }

    }

    public void assertTrue(boolean method, String passed, String failed ) throws IOException, InterruptedException {

        if(method == true){
            System.out.println(String.format("==== PASSED: Actual Result [%s] %s ====", method, passed));
            File screenshot = takeScreenshot(driver);
            Allure.addAttachment("Page Screenshot", FileUtils.openInputStream(screenshot));
        }else{
            System.out.println(String.format("==== FAILED: Actual Result [%s] %s ====", method, failed));
//	    		Assert.fail();
        }
    }



    public static File takeScreenshot(WebDriver driver) throws InterruptedException {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        Thread.sleep(1000);

        File scrFile = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);
        try {
            String reportDirectory = System.getProperty("user.dir")
                    + "/screenshots/"
                    + formater.format(calendar.getTime()) + ".png";
            File destFile = new File(reportDirectory);
            FileUtils.copyFile(scrFile, destFile);
       //     String[] relativePath = destFile.toString().split("Extent Reports");
       //     ssLocation = ".\\"+relativePath[1];
        } catch (IOException e) {
            e.printStackTrace();
        }

        return scrFile;
    }
}

package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import utility.BaseDriver;




@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"utility", "stepDefinitions"},
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}
)

//extends AbstractTestNGCucumberTests
public class TestRunner extends BaseDriver {

//    @BeforeClass
//    public  void setUp() throws InterruptedException {
//          System.out.println("Before class");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://www.saucedemo.com/");
//        Thread.sleep(3000);
//        driver.manage().window().maximize();
//    }

//    @Override
//    @DataProvider
//    //@DataProvider (parallel = true) -- For parallel execution support (which is not going to work for our code)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }



//    @After
//    public  void teardown()  {
//          driver.quit();
//        //TestRunner.teardown();
//    }

}
//allure generate allure-results --clean -o allure-report
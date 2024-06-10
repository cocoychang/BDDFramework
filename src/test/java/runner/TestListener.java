package runner;



//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import java.io.IOException;
//
//
//
///**
// * Created by Karthik on 21/09/2019.
// */
//
//public class TestListener implements ITestListener {
//
//
//
//    @Override
//    public void onTestStart(ITestResult iTestResult) {
//        System.out.println("On test start");
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult iTestResult) {
//
//        System.out.println("On test Sucess");
//    }
//
//    @Override
//    public void onTestFailure(ITestResult iTestResult) {
//        System.out.println("On test failure");
//
////        try{
////            extentReportUtil.ExtentReportScreenshot();
////        }catch (IOException e){
////            e.printStackTrace();
////        }
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult iTestResult) {
//        System.out.println("On test skipped");
//    }
//
//    @Override
//    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
//        System.out.println("On test percentage");
//    }
//
//    @Override
//    public void onStart(ITestContext iTestContext) {
//        System.out.println("On start");
//
//
//
//        //ToDo: Feature - Hard coding the feature name
//
//
//    }
//
//    @Override
//    public void onFinish(ITestContext iTestContext) {
//        System.out.println("On finish");
//
//    }
//}
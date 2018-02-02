package testlisteners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;


public class TestNGListeners implements IInvokedMethodListener, ITestListener, ISuiteListener{

	
	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		//körs efter varje metod i test-klassen
		System.out.println("[listener] "+testResult.getTestClass().getName()+" "+method.getTestMethod().getMethodName()+" STARTAR");
		
	}
	
	
	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		//körs före varje metod i test-klassen
		System.out.println("[listener] "+testResult.getTestClass().getName()+" "+method.getTestMethod().getMethodName()+" SLUTAR");
		
	}



	@Override
	public void onStart(ITestContext context) {
		// Before <test> tag of xml file
		System.out.println("[listener] onStart -> Test Tag Name: " + context.getName());
		ITestNGMethod methods[] = context.getAllTestMethods();
		System.out.println("These methods will be executed in this test tag:");
		for (ITestNGMethod method : methods) {
			System.out.println("  "+method.getMethodName());
		}
		
	}
	
	@Override
	public void onFinish(ITestContext context) {
		// // After <test> tag of xml file
		System.out.println("[listener] onFinish -> Test Tag Name: " + context.getName());
		
	}



	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println("[listener] "+testResult.getName()+" MISSLYCKADES");
		
	}

	@Override
	public void onTestSkipped(ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println("[listener] "+testResult.getName()+" SKIPPADES");
	}

	@Override
	public void onTestStart(ITestResult testResult) {
		// TODO Auto-generated method stub
		//System.out.println("[listener] "+testResult.getName()+" StArTaS");
		
	}

	@Override
	public void onTestSuccess(ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println("[listener] "+testResult.getName()+" LYCKADES");
		
	}

	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("[listener] testsviten STARTAR");	
	}
	
	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("[listener] testsviten SLUTAR");
	}

}

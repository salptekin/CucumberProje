package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorTest {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		try {
			openCalculator();
		} catch (MalformedURLException e) {
			//System.out.println(e.getCause());
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}

	}
	
	public static void openCalculator() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Suleyman");
		cap.setCapability(MobileCapabilityType.UDID, "00008020-001279391179002E");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		cap.setCapability(MobileCapabilityType.APP,"Chase");
//		cap.setCapability("platformVersion", "13.6");
//		cap.setCapability(MobileCapabilityType.APPLICATION_NAME, "Chase");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		System.out.println("Application started");
	}

}

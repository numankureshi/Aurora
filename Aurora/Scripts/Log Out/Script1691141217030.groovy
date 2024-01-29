import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Click on Account Settings Dropdown\r\n'
WebUI.click(findTestObject('HomePage/Acc Settings Dropdown'))

'Validate the Expanding of Account Settings Dropdown'
if (WebUI.verifyElementPresent(findTestObject('HomePage/Account Settings Dropdown/Sign Out'), 30)) {
    'Click on Sign Out'
    WebUI.click(findTestObject('HomePage/Account Settings Dropdown/Sign Out'))
} else {
    'Check if Acccount Settings Dropdown has expanded'
    WebUI.verifyElementNotVisible(findTestObject('HomePage/Acc Settings Dropdown'))

    'Click to expand the account settings dropdown'
    WebUI.click(findTestObject('HomePage/Acc Settings Dropdown'))

    'Click to logout of the platform'
    WebUI.click(findTestObject('HomePage/Account Settings Dropdown/Sign Out'))
}

'Close the browser'
WebUI.closeBrowser()


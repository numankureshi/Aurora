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

'Open Browser\r\n\t\r\n\t\t\t\r\n'
WebUI.openBrowser('')

'Open URL'
WebUI.navigateToUrl('http://Aurora-onboard')

'Enter Username'
WebUI.setText(findTestObject('Login Page/Username'), Username)

//WebUI.setText(findTestObject('Login Page/Username'), findTestData("Data1").getValue(1, 1))
'Enter Password\r\n'
WebUI.setText(findTestObject('Login Page/Password'), Password)

//WebUI.setText(findTestObject('Login Page/Password'), findTestData("Data1").getValue(2, 2))
'Login to the platform'
WebUI.click(findTestObject('Login Page/Sign In'))

'Maximize browser'
WebUI.maximizeWindow()


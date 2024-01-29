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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://gla-az-aurora-web-site-test-sr346.azurewebsites.net/login')

WebUI.setText(findTestObject('Object Repository/Page_Aurora/input_Aurora Web_mud-input-slot mud-input-r_127a58'), 'numan.kureshi')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Aurora/input_Aurora Web_mud-input-slot mud-input-r_127a58_1'), 
    'p4y+y39Ir5Pc2g9xt3QkeQ==')

WebUI.click(findTestObject('Object Repository/Page_Aurora/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Aurora/div_Aurora Forms'))

WebUI.click(findTestObject('Object Repository/Page_Aurora/div_Form Types - (Form Builder)'))

WebUI.click(findTestObject('Object Repository/Page_Aurora/path'))

WebUI.click(findTestObject('Object Repository/Page_Aurora/path_1'))

WebUI.click(findTestObject('Object Repository/Page_Aurora/div_date range'))

WebUI.click(findTestObject('Object Repository/Page_Aurora/input_Published Date_mud-input-slot mud-inp_a55268'))

WebUI.click(findTestObject('Object Repository/Page_Aurora/svg_Published Date_mud-icon-root mud-svg-ic_c711a0'))

WebUI.click(findTestObject('Object Repository/Page_Aurora/button_1'))

WebUI.click(findTestObject('Object Repository/Page_Aurora/button_31'))

WebUI.click(findTestObject('Object Repository/Page_Aurora/span_Ok'))

WebUI.click(findTestObject('Object Repository/Page_Aurora/h6_No matching records found'))


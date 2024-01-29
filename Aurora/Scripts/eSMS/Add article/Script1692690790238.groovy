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

WebUI.navigateToUrl('https://gla-az-aurora-web-site-test-sr344.azurewebsites.net/login#')

WebUI.setText(findTestObject('Object Repository/Xpath/Page_Aurora/input_Aurora Web_mud-input-slot mud-input-r_127a58'), 
    'numan.kureshi')

WebUI.setEncryptedText(findTestObject('Object Repository/Xpath/Page_Aurora/input_Aurora Web_mud-input-slot mud-input-r_127a58_1'), 
    'p4y+y39Ir5Pc2g9xt3QkeQ==')

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/input_Wildcard_mud-checkbox-input'))

WebUI.click(findTestObject('HomePage/Tile/Sean Testing Tile'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/div_Multi Page'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/span_ADD NEW MANUAL'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/span_Save'))

WebUI.click(findTestObject('HomePage/MultiPage Article/Category Number'))

WebUI.setText(findTestObject('HomePage/MultiPage Article/Category Number'), '12344521')

WebUI.setText(findTestObject('HomePage/MultiPage Article/Category Name'), 'Tester123')

WebUI.click(findTestObject('HomePage/MultiPage Article/Classification DD'))

WebUI.click(findTestObject('HomePage/MultiPage Article/Routine Classification'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/span_Save'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/td_Tester'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/path_1'))

WebUI.setText(findTestObject('Object Repository/Xpath/Page_Aurora/input_Aurora Web_mud-input-slot mud-input-r_127a58'), 
    '121245')

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/span_Add'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/div_Add your comment_mud-overlay-scrim mud-_c52764'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/span_Save Draft'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/svg_(1.00)_mud-icon-root mud-svg-icon mud-i_7b669e'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/svg_(1.00)_mud-icon-root mud-svg-icon mud-i_7b669e'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/span_Numan'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/div_Sign Out'))


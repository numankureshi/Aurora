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

WebUI.navigateToUrl('https://gla-az-aurora-web-site-test-sr344.azurewebsites.net/login')

WebUI.setText(findTestObject('Object Repository/Xpath/Page_Aurora/input_Aurora Web_mud-input-slot mud-input-r_127a58'), 
    'numan.kureshi')

WebUI.setEncryptedText(findTestObject('Object Repository/Xpath/Page_Aurora/input_Aurora Web_mud-input-slot mud-input-r_127a58_1'), 
    'p4y+y39Ir5Pc2g9xt3QkeQ==')

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/input_Wildcard_mud-checkbox-input'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/div_Sean Testing'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/div_Documents'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/span_ADD NEW DOCUMENT'))

WebUI.setText(findTestObject('Object Repository/Xpath/Page_Aurora/input_New document_mud-input-slot mud-input_3a7dbf'), 
    'Test document')

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/span_Add'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/td_Test doc'))

WebUI.uploadFile(findTestObject('Xpath/Page_Aurora/span_Upload File'), file)

WebUI.click(findTestObject('Xpath/Page_Aurora/span_Upload File'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/svg_Save successful, uploading of document _2a7b8e'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/path_1_2'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/svg_(1.00)_mud-icon-root mud-svg-icon mud-i_7b669e'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/svg_Add'))

WebUI.setText(findTestObject('Object Repository/Xpath/Page_Aurora/input_Positions_mud-input-slot mud-input-ro_a16c33'), 
    'Chief')

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/svg_Chief Engineer_mud-icon-root mud-svg-ic_544fd2'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/span_Add Position'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/span_Request Acknowledgements'))

WebUI.click(findTestObject('Object Repository/Xpath/Page_Aurora/span_OK (1)'))

WebUI.closeBrowser()


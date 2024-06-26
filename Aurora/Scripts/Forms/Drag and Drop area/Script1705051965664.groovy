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

WebUI.click(findTestObject('HomePage/Aurora Forms/Forms Tile/Form Types'))

WebUI.click(findTestObject('HomePage/Aurora Forms/Common Functions/New Form Type'))

WebUI.setText(findTestObject('HomePage/Aurora Forms/Form Types Folder/Form Name'), 'rsfdfehsdfg')

WebUI.setText(findTestObject('HomePage/Aurora Forms/Form Types Folder/Form Code'), 'rdgvtujhsdcfzxjk')

WebUI.click(findTestObject('HomePage/Aurora Forms/Form Types Folder/Ok Form Modal'))

WebUI.click(findTestObject('HomePage/Aurora Forms/Form Types Folder/Form Designer'))

WebUI.click(findTestObject('HomePage/Aurora Forms/Form Types Folder/Form Designer Folder/Add Section'))

WebUI.setText(findTestObject('HomePage/Aurora Forms/Form Types Folder/Form Designer Folder/Forms Section Name'), 'tyfsdzesxihykuglvih')

WebUI.click(findTestObject('HomePage/Aurora Forms/Form Types Folder/Form Designer Folder/Add Forms button'))

WebUI.waitForElementPresent(findTestObject('HomePage/Aurora Forms/Form Types Folder/Form Designer Folder/Highlighted section Forms Designer'), 
    0)


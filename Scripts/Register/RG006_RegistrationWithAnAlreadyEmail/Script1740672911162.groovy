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

String URL = GlobalVariable.URL
WebUI.openBrowser(URL)
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Register_Page/btn_HomePageRegister'))

WebUI.setText(findTestObject('Object Repository/Register_Page/txt_FullName'), 'John Smith')
WebUI.setText(findTestObject('Object Repository/Register_Page/txt_Email'), 'john.smith@example.com')
WebUI.setText(findTestObject('Object Repository/Register_Page/txt_Password'), 'Test@1234')
WebUI.setText(findTestObject('Object Repository/Register_Page/txt_ConfirmPassword'), 'Test@1234')
WebUI.click(findTestObject('Object Repository/Register_Page/ddl_Gender'))
WebUI.click(findTestObject('Object Repository/Register_Page/ddl_Gender_Male'))
WebUI.click(findTestObject('Object Repository/Register_Page/btn_Register'))



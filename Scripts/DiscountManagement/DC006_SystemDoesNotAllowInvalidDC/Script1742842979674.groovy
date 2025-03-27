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

WebUI.click(findTestObject('Object Repository/Login_Page/btn_HomePageLogIn'))

WebUI.setText(findTestObject('Object Repository/Register_Page/txt_Email'), 'duchung12a8@gmail.com')
WebUI.setText(findTestObject('Object Repository/Register_Page/txt_Password'), 'Wearwise@123')
WebUI.click(findTestObject('Object Repository/Login_Page/btn_Login'))

// Chuyển đến form "Add New Discount"
WebUI.click(findTestObject('Object Repository/Discount_Management_Page/btn_Discount'))
WebUI.click(findTestObject('Object Repository/Discount_Management_Page/btn_AddNewDiscount'))

// Nhập thông tin giảm giá
WebUI.setText(findTestObject('Object Repository/Discount_Management_Page/txt_Code'), 'SRING20')
WebUI.setText(findTestObject('Object Repository/Discount_Management_Page/txt_Description'), '20% off all spring collection')
WebUI.setText(findTestObject('Object Repository/Discount_Management_Page/txt_Percentage'), '-10')
WebUI.setText(findTestObject('Object Repository/Discount_Management_Page/txt_StartDate'), '04/01/2025')
WebUI.setText(findTestObject('Object Repository/Discount_Management_Page/txt_EndDate'), '04/30/2025')

// Lưu giảm giá
WebUI.click(findTestObject('Object Repository/Discount_Management_Page/btn_AddDiscount'))

WebUI.verifyTextPresent('The percentage field must be at least 0.', false)

// Nhập giá trị phần trăm không hợp lệ khác (150%)
WebUI.setText(findTestObject('Object Repository/Discount_Management_Page/txt_Percentage'), '150')
WebUI.click(findTestObject('Object Repository/Discount_Management_Page/btn_AddDiscount'))

// Xác minh lỗi hiển thị đúng
WebUI.verifyTextPresent('The percentage field must not be greater than 100.', false)



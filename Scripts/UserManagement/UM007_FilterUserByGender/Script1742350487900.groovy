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


String ADMIN_URL = GlobalVariable.ADMINURL
WebUI.openBrowser(ADMIN_URL)
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/User_Management_Page/btn_Users'))
WebUI.click(findTestObject('Object Repository/User_Management_Page/btn_AllUsers'))
// Nhấn vào bộ lọc
WebUI.click(findTestObject('Object Repository/User_Management_Page/btn_Filter'))

// Chọn giới tính từ dropdown (Male hoặc Female)
WebUI.click(findTestObject('Object Repository/User_Management_Page/ddl_Gender'))

WebUI.click(findTestObject('Object Repository/User_Management_Page/ddl_Male'))
// Chờ và xác minh kết quả lọc
WebUI.waitForElementVisible(findTestObject('Object Repository/User_Management_Page/tbl_UserList'), 10)
boolean isFiltered = WebUI.verifyTextPresent('Male', false)

// In kết quả kiểm thử
if (isFiltered) {
	println('Test Passed: Users filtered by Male gender successfully.')
} else {
	println('Test Failed: Filtering by Male gender did not work as expected.')
}

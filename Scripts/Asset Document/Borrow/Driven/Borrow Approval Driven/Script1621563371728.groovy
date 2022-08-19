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

//open browser
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//input credential
WebUI.setText(findTestObject('Login/username'), username)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select role
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Approval/a_Select'))
WebUI.delay(3)


//select menu borrow approval
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Approval/img_Welcome, DAIRINA MANIK, JAKARTA NORTH, _c8ab9b'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Borrow/Approval/select_LOAN ORIGINATIONACCOUNT'), 
    '121', false)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Approval/span_Receive_rtPlus'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Approval/a_Approval'))
WebUI.delay(3)


//input cust credential
WebUI.setText(findTestObject('Object Repository/Asset Document/Borrow/Approval/input_Agreement No_ucSearchtxtAgrmntNo_ltlAgrmntAgrmntNo'), 
    agreeNo)
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Approval/input_Value must be Date Format_ucSearchbtnSearch'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Approval/input_DMN1556_gvTaskctl02ibProcess'))
WebUI.delay(3)


//borrow approval process
WebUI.scrollToElement(findTestObject('Object Repository/Asset Document/Borrow/Approval/select_Select OneApproveReject'), 2)
WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Document/Borrow/Approval/select_Select OneApproveReject'), 
    'Approve', false)
WebUI.setText(findTestObject('Object Repository/Asset Document/Borrow/Approval/textarea_Notes_txtNotes'), notes)
WebUI.click(findTestObject('Object Repository/Asset Document/Borrow/Approval/a_Submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()


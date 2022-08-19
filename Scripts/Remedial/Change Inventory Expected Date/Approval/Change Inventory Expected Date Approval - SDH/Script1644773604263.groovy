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
WebUI.setText(findTestObject('Login/username'), usernameApprSDH)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)


//select role
WebUI.click(findTestObject('Object Repository/COLLECTION/Asset Inventory/Asset Inventory Approval/select_role_for_remedial'))
WebUI.delay(1)


//select menu inventory expected date approval
WebUI.click(findTestObject('REMEDIAL/Change Asset Expected Date Approval/things_ToDo_change_inv_expected_date_approval'))  //located on things to do
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.setText(findTestObject('REMEDIAL/Change Asset Expected Date Approval/field_agreement_number'), agreeNo)
WebUI.click(findTestObject('REMEDIAL/Change Asset Expected Date Approval/button_search'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Change Asset Expected Date Approval/button_process'))
WebUI.delay(1)


//change inventory expected date approval process
WebUI.scrollToElement(findTestObject('REMEDIAL/Change Asset Expected Date Approval/select_action'), 10)
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('REMEDIAL/Change Asset Expected Date Approval/select_action'), 'Approve', false)
WebUI.setText(findTestObject('REMEDIAL/Change Asset Expected Date Approval/field_notes'), notes)
WebUI.delay(1)

WebUI.click(findTestObject('REMEDIAL/Change Asset Expected Date Approval/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()



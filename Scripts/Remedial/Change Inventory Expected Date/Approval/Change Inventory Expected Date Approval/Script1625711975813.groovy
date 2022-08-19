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
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()


//input credential
WebUI.setText(findTestObject('Login/username'), 'SSI0618')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Change Asset Expected Date Approval/button_select_role'), 20)
WebUI.click(findTestObject('REMEDIAL/Change Asset Expected Date Approval/button_select_role'))  //role as remedial area 1


//select menu inventory expected date approval
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Change Asset Expected Date Approval/things_ToDo_change_inv_expected_date_approval'), 20)
WebUI.click(findTestObject('REMEDIAL/Change Asset Expected Date Approval/things_ToDo_change_inv_expected_date_approval'))  //located on things to do
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Change Asset Expected Date Approval/field_agreement_number'), 20)
WebUI.setText(findTestObject('REMEDIAL/Change Asset Expected Date Approval/field_agreement_number'), 
    '1916236491')
WebUI.click(findTestObject('REMEDIAL/Change Asset Expected Date Approval/button_search'))
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Change Asset Expected Date Approval/button_process'), 20)
WebUI.click(findTestObject('REMEDIAL/Change Asset Expected Date Approval/button_process'))
WebUI.delay(1)


//change inventory expected date approval process
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Change Asset Expected Date Approval/select_action'), 20)
WebUI.scrollToElement(findTestObject('REMEDIAL/Change Asset Expected Date Approval/select_action'), 0)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Change Asset Expected Date Approval/select_action'), 
    'Approve', false)
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Change Asset Expected Date Approval/field_notes'), 
    'notes')
WebUI.click(findTestObject('REMEDIAL/Change Asset Expected Date Approval/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()


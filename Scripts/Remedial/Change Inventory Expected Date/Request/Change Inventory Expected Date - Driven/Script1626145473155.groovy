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
WebUI.setText(findTestObject('Login/username'), usernameRA1)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Login/Login Remedial Area 1/select_role'), 20)
WebUI.click(findTestObject('REMEDIAL/Login/Login Remedial Area 1/select_role'))
WebUI.delay(1)


//select menu change inventory expected date
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/button_menu'), 20)
WebUI.click(findTestObject('REMEDIAL/Repossession/button_menu'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/select_menu_remedial'), 20)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Repossession/select_menu_remedial'), 
    '303', false)
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/menu_repossession'), 20)
WebUI.click(findTestObject('REMEDIAL/Repossession/menu_repossession'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/expand_menu_repossess'), 20)
WebUI.click(findTestObject('REMEDIAL/Repossession/expand_menu_repossess'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Change Asset Expected Date Req/button_menu_change_inv_expected_date'), 20)
WebUI.click(findTestObject('REMEDIAL/Change Asset Expected Date Req/button_menu_change_inv_expected_date'))
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Change Asset Expected Date Req/field_agreement_number'), 20)
WebUI.setText(findTestObject('REMEDIAL/Change Asset Expected Date Req/field_agreement_number'), 
    agreeNo)
WebUI.click(findTestObject('REMEDIAL/Change Asset Expected Date Req/button_search'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Change Asset Expected Date Req/button_change'), 20)
WebUI.click(findTestObject('REMEDIAL/Change Asset Expected Date Req/button_change'))
WebUI.delay(1)


//change inventory expected date process
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Change Asset Expected Date Req/field_new_inv_expected_date'), 20)
WebUI.scrollToElement(findTestObject('REMEDIAL/Change Asset Expected Date Req/field_new_inv_expected_date'), 0)
WebUI.setText(findTestObject('REMEDIAL/Change Asset Expected Date Req/field_new_inv_expected_date'), 
    newExpectedDate)
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Change Asset Expected Date Req/field_notes'), notes)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Change Asset Expected Date Req/select_reason_description'), 
    '236', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Change Asset Expected Date Req/select_approved_by'), 
    '290665', false)
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Change Asset Expected Date Req/field_approval_notes'), 
    notes)
WebUI.click(findTestObject('REMEDIAL/Change Asset Expected Date Req/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()

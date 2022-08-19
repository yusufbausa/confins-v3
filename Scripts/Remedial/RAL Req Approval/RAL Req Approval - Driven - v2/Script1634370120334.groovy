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
WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), usernameRA1)

WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Login/Login Remedial Area 1/select_role'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Login/Login Remedial Area 1/select_role'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Login/Login Remedial Area 1/select_role'))
WebUI.click(findTestObject('REMEDIAL/Login/Login Remedial Area 1/select_role'))
WebUI.delay(1)


//select menu remedial approval
WebUI.waitForElementPresent(findTestObject('REMEDIAL/RAL Req Approval/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/RAL Req Approval/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/RAL Req Approval/button_menu'))
WebUI.click(findTestObject('REMEDIAL/RAL Req Approval/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/RAL Req Approval/select_menu_remedial'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/RAL Req Approval/select_menu_remedial'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/RAL Req Approval/select_menu_remedial'))
WebUI.selectOptionByValue(findTestObject('REMEDIAL/RAL Req Approval/select_menu_remedial'), '303', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/RAL Req Approval/menu_repossession'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/RAL Req Approval/menu_repossession'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/RAL Req Approval/menu_repossession'))
WebUI.click(findTestObject('REMEDIAL/RAL Req Approval/menu_repossession'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/RAL Req Approval/expand_menu_RAL'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/RAL Req Approval/expand_menu_RAL'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/RAL Req Approval/expand_menu_RAL'))
WebUI.click(findTestObject('REMEDIAL/RAL Req Approval/expand_menu_RAL'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/RAL Req Approval/button_menu_RAL_approval_by_collector'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/RAL Req Approval/button_menu_RAL_approval_by_collector'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/RAL Req Approval/button_menu_RAL_approval_by_collector'))
WebUI.click(findTestObject('REMEDIAL/RAL Req Approval/button_menu_RAL_approval_by_collector'))
WebUI.delay(1)


//input cust agreement number
WebUI.waitForElementPresent(findTestObject('REMEDIAL/RAL Req Approval/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/RAL Req Approval/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/RAL Req Approval/field_agreement_number'))
WebUI.setText(findTestObject('REMEDIAL/RAL Req Approval/field_agreement_number'), agreeNo)

WebUI.click(findTestObject('REMEDIAL/RAL Req Approval/button_search'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/RAL Req Approval/button_approve'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/RAL Req Approval/button_approve'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/RAL Req Approval/button_approve'))
WebUI.click(findTestObject('REMEDIAL/RAL Req Approval/button_approve'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/RAL Req Approval/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/RAL Req Approval/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/RAL Req Approval/field_notes'))
WebUI.scrollToElement(findTestObject('REMEDIAL/RAL Req Approval/field_notes'), 10)
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/RAL Req Approval/field_notes'), notes)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/RAL Req Approval/select_signer_name'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/RAL Req Approval/select_signer_name'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/RAL Req Approval/select_signer_name'))
WebUI.selectOptionByValue(findTestObject('REMEDIAL/RAL Req Approval/select_signer_name'), '3636', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/RAL Req Approval/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/RAL Req Approval/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/RAL Req Approval/button_submit'))
WebUI.click(findTestObject('REMEDIAL/RAL Req Approval/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()

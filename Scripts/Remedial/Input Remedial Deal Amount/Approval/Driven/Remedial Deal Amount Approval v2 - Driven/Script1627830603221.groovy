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
WebUI.setText(findTestObject('Login/username'), usernameRDH)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select profile
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/select_role'), 20)
WebUI.scrollToElement(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/select_role'), 0)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/select_role'))
WebUI.delay(1)


//select menu remedial deal amount approval
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/button_menu'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/button_menu'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/select_menu_remedial'), 20)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/select_menu_remedial'), 
    '303', false)
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/menu_repossession'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/menu_repossession'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/expand_menu_rem_deal_amount'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/expand_menu_rem_deal_amount'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/button_menu_rem_deal_amount_approval'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/button_menu_rem_deal_amount_approval'))
//WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/things_toDo_remedial_deal_amount_approval'), 20)
//WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/things_toDo_remedial_deal_amount_approval'))
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/field_agreement_number'), 20)
WebUI.setText(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/field_agreement_number'), 
    agreeNo)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/button_search'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/button_process'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/button_process'))
WebUI.delay(1)


//remedial deal amount approval process
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/select_action'), 20)
WebUI.scrollToElement(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/select_action'), 0)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/select_action'), 
    'Approve', false)
WebUI.setText(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/field_notes'), 
    notes)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()


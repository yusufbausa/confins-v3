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
WebUI.setText(findTestObject('Login/username'), usernameARH)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select profle
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/select_role'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/select_role'))
WebUI.delay(1)


//select menu remedial deal amount approval
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/button_menu'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/button_menu'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/select_menu_remedial'), 20)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/select_menu_remedial'), 
    '303', false)
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/menu_repossession'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/menu_repossession'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/expand_menu_rem_deal_amount'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/expand_menu_rem_deal_amount'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/button_menu_rem_deal_amt_approval'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/button_menu_rem_deal_amt_approval'))
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/field_agreement_number'), 20)
WebUI.setText(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/field_agreement_number'), 
    agreeNo)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/button_search'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/button_process'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/button_process'))


//approval process
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/select_action'), 20)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/select_action'), 
    'Approve', false)
WebUI.setText(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/field_notes'), 
    notes)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval AR Head/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()


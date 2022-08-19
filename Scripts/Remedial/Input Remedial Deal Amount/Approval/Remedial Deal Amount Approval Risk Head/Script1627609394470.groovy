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
WebUI.setText(findTestObject('Login/username'), 'NTI0879')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select menu
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Risk Head/button_menu'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Risk Head/button_menu'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Risk Head/select_menu_remedial'), 20)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Risk Head/select_menu_remedial'), 
    '303', false)
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Risk Head/menu_repossession'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Risk Head/menu_repossession'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Risk Head/expand_menu_rem_deal_amount'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Risk Head/expand_menu_rem_deal_amount'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Risk Head/button_menu_rem_deal_amt_approval'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Risk Head/button_menu_rem_deal_amt_approval'))
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Risk Head/field_agreement_number'), 20)
WebUI.setText(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Risk Head/field_agreement_number'), 
    '1919319959')
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Risk Head/button_search'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Risk Head/button_process'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Risk Head/button_process'))
WebUI.delay(1)


//approval process
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Risk Head/select_action'), 20)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Risk Head/select_action'), 
    'Approve', false)
WebUI.setText(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Risk Head/field_notes'), 
    'notes')
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Risk Head/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()


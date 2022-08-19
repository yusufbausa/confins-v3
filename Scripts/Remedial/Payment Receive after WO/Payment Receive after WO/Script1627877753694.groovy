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
WebUI.setText(findTestObject('Login/username'), 'RKL1949')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select menu payment receive after WO
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Payment Receive after WO/button_menu'), 20)
WebUI.click(findTestObject('REMEDIAL/Payment Receive after WO/button_menu'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Payment Receive after WO/select_menu_remedial'), 20)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Payment Receive after WO/select_menu_remedial'), 
    '303', false)
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Payment Receive after WO/menu_rerpossession'), 20)
WebUI.click(findTestObject('REMEDIAL/Payment Receive after WO/menu_rerpossession'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Payment Receive after WO/btn_payment_receive_after_wo'), 20)
WebUI.click(findTestObject('REMEDIAL/Payment Receive after WO/btn_payment_receive_after_wo'))
WebUI.delay(1)


//select way of payment
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Payment Receive after WO/select_wop'), 20)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Payment Receive after WO/select_wop'), 
    'BANK', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Payment Receive after WO/select_account_name'), 
    '10', false)
WebUI.click(findTestObject('REMEDIAL/Payment Receive after WO/button_next'))
WebUI.delay(1)


//input cust credential
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Payment Receive after WO/select_office_name'), 20)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Payment Receive after WO/select_office_name'), 
    '218', false)
WebUI.setText(findTestObject('REMEDIAL/Payment Receive after WO/field_agreement_number'), 
    '1915966798')
WebUI.click(findTestObject('REMEDIAL/Payment Receive after WO/button_search'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Payment Receive after WO/button_receive'), 20)
WebUI.click(findTestObject('REMEDIAL/Payment Receive after WO/button_receive'))
WebUI.delay(1)


//payment receive process
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Payment Receive after WO/field_reference_number'), 20)
WebUI.setText(findTestObject('REMEDIAL/Payment Receive after WO/field_reference_number'), 
    '123456789')
WebUI.setText(findTestObject('REMEDIAL/Payment Receive after WO/field_notes'), 'notes')
WebUI.sendKeys(findTestObject('REMEDIAL/Payment Receive after WO/field_receive_amount'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('REMEDIAL/Payment Receive after WO/field_receive_amount'),
	Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('REMEDIAL/Payment Receive after WO/field_receive_amount'), 
    '200000000')
WebUI.click(findTestObject('REMEDIAL/Payment Receive after WO/button_calculate'))
WebUI.delay(3)
WebUI.click(findTestObject('REMEDIAL/Payment Receive after WO/button_submit'))
WebUI.delay(5)


WebUI.closeBrowser()


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


//select menu input remedial deal amount
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/button_menu'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/button_menu'))
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/select_menu_remedial'), 20)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Input Remedial Deal Amount/select_menu_remedial'), 
    '303', false)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/menu_repossession'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/menu_repossession'))
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/button_menu_input_remedial_deal_amount'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/button_menu_input_remedial_deal_amount'))
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/select_office_name'), 20)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Input Remedial Deal Amount/select_office_name'), 
    '218', false)
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Input Remedial Deal Amount/field_agreement_number'), 
    agreeNo)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/button_search'))
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/button_request'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/button_request'))
WebUI.delay(1)


//input remedial deal amount process
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/field_deal_amount'), 20)
WebUI.scrollToElement(findTestObject('REMEDIAL/Input Remedial Deal Amount/field_deal_amount'), 0)
WebUI.sendKeys(findTestObject('REMEDIAL/Input Remedial Deal Amount/field_deal_amount'),
	Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('REMEDIAL/Input Remedial Deal Amount/field_deal_amount'),
	Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('REMEDIAL/Input Remedial Deal Amount/field_deal_amount'), 
    dealAmount)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Input Remedial Deal Amount/select_deal_by_collector'), 
    '5988', false)
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Input Remedial Deal Amount/field_notes'), notes)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()


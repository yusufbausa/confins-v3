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
WebUI.waitForElementPresent(findTestObject('Object Repository/REMEDIAL/Input Remedial Deal Amount/Request/a_Select'), 20)
WebUI.click(findTestObject('Object Repository/REMEDIAL/Input Remedial Deal Amount/Request/a_Select'))
WebUI.delay(1)


//select menu remedial deal account request
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/button_menu'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/button_menu'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/select_menu_remedial'), 20)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/select_menu_remedial'), '303', false)
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/menu_repossession'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/menu_repossession'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/expand_menu_remedial_deal_amount'), 
    20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/expand_menu_remedial_deal_amount'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/button_menu_remedial_deal_request'), 
    20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/button_menu_remedial_deal_request'))
WebUI.delay(1)


//input cust credential (agrement number)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/select_office_name'), 20)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/select_office_name'), '218', false)
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/field_agreement_number'), 20)
WebUI.sendKeys(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/field_agreement_number'), agreeNo)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/button_search'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/button_pencil_request'), 20)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/button_pencil_request'))
WebUI.delay(1)


//remedial deal amount request process
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/field_deal_amount'), 20)
WebUI.scrollToElement(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/field_deal_amount'), 0)
WebUI.delay(1)
WebUI.sendKeys(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/field_deal_amount'), Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/field_deal_amount'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/field_deal_amount'), dealAmount)
WebUI.delay(1)
WebUI.sendKeys(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/field_tenor'), Keys.chord(Keys.CONTROL + 'a'))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/field_tenor'), Keys.chord(Keys.CONTROL + 'a'))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/field_tenor'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/field_tenor'), '1')
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/select_payment_frequency'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/select_payment_frequency'), '1', false)
WebUI.delay(1)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/field_effective_date'), 2)
WebUI.setText(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/field_effective_date'), effDate)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/select_deal_by_collector'), '5988', 
    false)
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/field_notes'), notes)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/button_calculate_installment'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/select_reason_description'), 20)
WebUI.scrollToElement(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/select_reason_description'), 0)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/select_reason_description'), '552', 
    false)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/select_to_be_approved_by'), 20)
WebUI.selectOptionByIndex(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/select_to_be_approved_by'), 1)
WebUI.setText(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/field_approval_notes'), 'notes')
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Request/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()


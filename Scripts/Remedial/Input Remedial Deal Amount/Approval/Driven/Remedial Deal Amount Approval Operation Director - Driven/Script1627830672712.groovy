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
WebUI.setText(findTestObject('Login/username'), usernameOD)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select menu remedial deal amount approval
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/button_menu'), 2)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/button_menu'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/select_menu_remedial'), 2)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/select_menu_remedial'), 
    '303', false)
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/menu_repossession'), 2)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/menu_repossession'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/expand_menu_rem_deal_amt'), 2)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/expand_menu_rem_deal_amt'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/btn_menu_rem_deal_amt_apprvl'), 2)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/btn_menu_rem_deal_amt_apprvl'))
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/field_agreement_number'), 2)
WebUI.setText(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/field_agreement_number'), 
    agreeNo)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/button_search'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/button_process'), 2)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/button_process'))
WebUI.delay(1)


//remedial deal amount approval process (operation diretor)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/select_action'), 2)
WebUI.scrollToElement(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/select_action'), 0)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/select_action'), 
    'Approve', false)
WebUI.setText(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/field_notes'), 
    notes)
WebUI.click(findTestObject('REMEDIAL/Input Remedial Deal Amount/Approval Operation Director/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()


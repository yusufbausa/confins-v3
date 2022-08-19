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
WebUI.setText(findTestObject('Login/username'), usernameRH)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
												
												
//select role
WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Approval/select_role'))


//select menu remedial deal amount
WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/btn_menu'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/select_menu_remedial'), 
    'REMEDIAL', false)
WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/menu_repossession'))
WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/expand_menu_rem_deal_amount_approval'))
WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Approval/menu_rem_deal_amt_approval'))
WebUI.delay(1)


//input cust credential
WebUI.setText(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Approval/field_agreement_no'), 
    agreeNo)
WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Approval/btn_search'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Approval/btn_process'))


//approval process
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Approval/select_action'), 
    'Approve', false)
WebUI.setText(findTestObject('REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Approval/field_notes'), 
    notes)

WebUI.click(findTestObject('REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Approval/btn_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()


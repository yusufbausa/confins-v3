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
//WebUI.delay(1)
												
												
//select role
WebUI.click(findTestObject('REMEDIAL/Login/Login Remedial Area 1/select_role'))


//select menu remedial deal amount
WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/btn_menu'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/select_menu_remedial'), 
    'REMEDIAL', false)
WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/menu_repossession'))
WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/expand_menu_rem_deal_amount'))
WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/menu_rem_deal_amt_req'))
WebUI.delay(1)

//input cust credential
WebUI.selectOptionByLabel(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/select_office_name'), 
    officeName, false)
WebUI.setText(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/field_agreement_no'), 
    agreeNo)
WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/btn_search'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/btn_request'))
WebUI.delay(1)


//remedial deal amount process
WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/field_deal_amount'))
WebUI.doubleClick(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/field_deal_amount'))
WebUI.sendKeys(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/field_deal_amount'),
	Keys.chord(Keys.DELETE))
//WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/field_deal_amount'), 
    dealAmount)

WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/field_tenor'))
WebUI.doubleClick(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/field_tenor'))
WebUI.sendKeys(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/field_tenor'),
	Keys.chord(Keys.DELETE))
//WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/field_tenor'), 
    tenor)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/select_payment_frequency'), 30)
WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/select_payment_frequency'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/select_payment_frequency'), 
    'MONTHLY', false)
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/field_effective_date'), 
    date)
WebUI.sendKeys(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/field_effective_date'),
	Keys.chord(Keys.ENTER))

WebUI.selectOptionByLabel(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/select_deal_by_collector'), 
    dealCollector, false)
WebUI.setText(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/field_notes (1)'), 
    notes)

WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/btn_calculate_installment'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/select_reason_description'), 30)
WebUI.selectOptionByValue(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/select_reason_description'), 
    '552', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/select_approved_by'), 
    approvedBy, false)

WebUI.setText(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/field_notes'), 
    notes)

WebUI.click(findTestObject('Object Repository/REMEDIAL/Remedial Deal Amount/Remedial Deal Amount Request/btn_submit'))
WebUI.delay(5)

//close browser
WebUI.closeBrowser()


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
WebUI.setText(findTestObject('Login/username'), 'AVI2317')

WebUI.setText(findTestObject('Login/password'), 'password')

WebUI.click(findTestObject('Login/btn_login'))

WebUI.delay(1)

//select role
WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company/select_role'), 20)

WebUI.click(findTestObject('Credit Review/Credit Review Company/select_role'))

WebUI.delay(1)

//select menu credit review
WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company/button_menu'), 20)

WebUI.click(findTestObject('Credit Review/Credit Review Company/button_menu'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company/btn_menu_credit_review'), 20)

WebUI.click(findTestObject('Credit Review/Credit Review Company/btn_menu_credit_review'))

WebUI.delay(1)

//input credential (app number)
WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company/field_app_number'), 20)

WebUI.setText(findTestObject('Credit Review/Credit Review Company/field_app_number'), '0037APP20210800183')

WebUI.click(findTestObject('Credit Review/Credit Review Company/button_search'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company/button_review'), 20)

WebUI.click(findTestObject('Credit Review/Credit Review Company/button_review'))

WebUI.delay(1)

//credit review process
WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company/tab_approval_recommendation'), 20)

WebUI.click(findTestObject('Credit Review/Credit Review Company/tab_approval_recommendation'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Credit Review/Credit Review Company/select_reason_description'), 20)

WebUI.selectOptionByValue(findTestObject('Credit Review/Credit Review Company/select_reason_description'), '158', false)

WebUI.selectOptionByValue(findTestObject('Credit Review/Credit Review Company/select_to_be_approved_by'), '321551', false)

WebUI.setText(findTestObject('Credit Review/Credit Review Company/field_notes'), 'notes')

WebUI.delay(1)

WebUI.setText(findTestObject('Credit Review/Credit Review Company/field_latar_belakang_debitur'), 'ok')

WebUI.setText(findTestObject('Credit Review/Credit Review Company/field_faktor2_mendukung'), 'ok')

WebUI.setText(findTestObject('Credit Review/Credit Review Company/field_faktor2_tidak_mendukung'), 'ok')

WebUI.setText(findTestObject('Credit Review/Credit Review Company/field_syarat2'), 'ok')

WebUI.setText(findTestObject('Credit Review/Credit Review Company/field_CA_calculation'), 'ok')

WebUI.click(findTestObject('Credit Review/Credit Review Company/button_submit'))

WebUI.delay(5)

//close browser
WebUI.closeBrowser()


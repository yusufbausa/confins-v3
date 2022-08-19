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

// CREDIT SIMULATION


//OPENING BROWSER
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//INPUT CREDENTIAL-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
//WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
//WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), usernameCDE)

//WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
//WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
//WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

//WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
//WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
//WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//SELECT ROLE
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/select_role'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/select_role'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Personal/select_role'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/select_role'))
WebUI.delay(2)


//SELECT MENU MARKETING
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_menu'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_menu'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_menu'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_menu'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/select_menu_marketing'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/select_menu_marketing'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Personal/select_menu_marketing'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Personal/select_menu_marketing'), 'MARKETING', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/menu_centralized_data_entry'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/menu_centralized_data_entry'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Personal/menu_centralized_data_entry'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/menu_centralized_data_entry'))
WebUI.delay(60)


//INPUT CUST CREDENTIAL (CUST NAME)
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_cust_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_cust_name'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_cust_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_cust_name'), custName)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_search'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_search'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_search'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_action'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_action'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_action'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_action'))
WebUI.delay(2)


//CDE PROCESS
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_birth_place'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_birth_place'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_birth_place'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_birth_place'), birthPlace)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_birth_date'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_birth_date'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_birth_date'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_birth_date'), birthDate)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_ktp'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_ktp'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_ktp'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Personal/field_ktp'), ktp)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_matching_customer'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_matching_customer'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_matching_customer'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/btn_matching_customer'))
WebUI.delay(5)


//CLOSE BROWSER
WebUI.closeBrowser()


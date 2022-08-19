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

//OPENING BROWSER
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//INPUT CREDENTIAL-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
//WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
//WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), username)

//WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
//WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
//WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

//WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
//WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
//WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//SELECT PROFILE-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForElementPresent(findTestObject('Login/btn_select_profile'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_select_profile'), 30)
//WebUI.verifyElementClickable(findTestObject('Login/btn_select_profile'))
WebUI.click(findTestObject('Login/btn_select_profile'))
WebUI.delay(1)


//SELECT MENU NAP DE
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_menu'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_menu'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_menu'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_menu'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/menu_new_application_data_entry'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/menu_new_application_data_entry'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/menu_new_application_data_entry'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/menu_new_application_data_entry'))
WebUI.delay(30)


//INPUT CUST CREDENTIAL
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_cust_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_cust_name'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_cust_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_cust_name'), custName)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_search_customer'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_search_customer'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_search_customer'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_action'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_action'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_action'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_action'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_app'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_app'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_app'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_app'))
WebUI.delay(1)


//SELECT CUSTOMER
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.delay(3)


//SELECT GUARANTOR
WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_add_personal_guarantor'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_add_personal_guarantor'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_add_personal_guarantor'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_add_personal_guarantor'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_add_personal_guarantor'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/img_search_cust_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/img_search_cust_name'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/img_search_cust_name'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/img_search_cust_name'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/field_cust_name_guarantor'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/field_cust_name_guarantor'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/field_cust_name_guarantor'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/field_cust_name_guarantor'), guarantor)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_search_guarantor'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_search_guarantor'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_search_guarantor'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_select_guarantor'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_select_guarantor'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_select_guarantor'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_select_guarantor'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/select_cust_relationship'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/select_cust_relationship'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/select_cust_relationship'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/select_cust_relationship'),
	'MOTHER', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_save_guarantor'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_save_guarantor'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_save_guarantor'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Under Age/btn_save_guarantor'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.delay(3)


//APPLICATION DATA
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_self_usage_app_data'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_self_usage_app_data'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_self_usage_app_data'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_self_usage_app_data'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_address_to_copy'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_address_to_copy'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_address_to_copy'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_address_to_copy'), 'Legal Address', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_copy_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_copy_address'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_copy_address'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_copy_address'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.delay(3)


//ASSET DATA1
//edit asset1
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_asset'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_asset'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_asset'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_asset'))
WebUI.delay(2)

//WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_sales'), 30)
//WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_sales'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_sales'))
//WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_sales'), 'MANDA', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_mesin'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_mesin'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_mesin'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_mesin'), noMesin)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_rangka'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_rangka'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_rangka'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_rangka'), noRangka)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_manuf_year'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_manuf_year'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_manuf_year'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_manuf_year'), manufYear)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_made_in'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_made_in'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_made_in'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_made_in'), madeIn)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_cylinder'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_cylinder'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_cylinder'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_cylinder'), cylinder)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_transmission'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_transmission'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_transmission'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_transmission'), transmission)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_color'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_color'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_color'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_color'), color)
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_asset'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_asset'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_asset'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_asset'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_asset'))
WebUI.delay(1)


//registration1
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_asset_registration'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_asset_registration'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_asset_registration'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_asset_registration'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_self_usage_registration'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_self_usage_registration'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_self_usage_registration'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_self_usage_registration'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_registration'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_registration'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_registration'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_registration'))
WebUI.delay(1)

//WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'), 30)
//WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
//WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
//WebUI.delay(3)


//ASSET DATA2
//edit asset2
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_asset2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_asset2'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_asset2'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_asset2'))
WebUI.delay(2)

//WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_sales'), 30)
//WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_sales'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_sales'))
//WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_sales'), 'MANDA', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_mesin'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_mesin'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_mesin'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_mesin'), noMesin2)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_rangka'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_rangka'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_rangka'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_no_rangka'), noRangka2)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_manuf_year'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_manuf_year'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_manuf_year'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_manuf_year'), manufYear)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_made_in'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_made_in'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_made_in'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_made_in'), madeIn)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_cylinder'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_cylinder'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_cylinder'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_cylinder'), cylinder)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_transmission'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_transmission'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_transmission'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_transmission'), transmission)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_color'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_color'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_color'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_color'), color)
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_asset'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_asset'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_asset'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_asset'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_asset'))
WebUI.delay(1)


//registration2
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_asset_registration2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_asset_registration2'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_asset_registration2'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_asset_registration2'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_self_usage_registration'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_self_usage_registration'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_self_usage_registration'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_self_usage_registration'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_registration'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_registration'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_registration'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_registration'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.delay(3)



//INSURANCE DATA
//insurance aset 1
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_insurance'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_insurance'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_insurance'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_to_calculate'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_to_calculate'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_to_calculate'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_to_calculate'))
WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_insurance'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_insurance'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_insurance'))
WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_insurance'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_insurance'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_insurance'))
WebUI.delay(3)


//insurance aset 2
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_insurance2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_insurance2'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_insurance2'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_edit_insurance2'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_to_calculate'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_to_calculate'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_to_calculate'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_to_calculate'))
WebUI.delay(6)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_insurance'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_insurance'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_insurance'))
WebUI.delay(6)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_insurance'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_insurance'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_insurance'))
WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_insurance'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_insurance'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_next_insurance'))
WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.delay(3)


//LIFE INSURANCE DATA
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.delay(3)


//FINANCIAL DATA
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_fee'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_fee'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_fee'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_fee'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_installment'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_installment'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_installment'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_calculate_installment'))
WebUI.delay(6)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.delay(3)


//COMISSION DATA
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_continue_cust'))
WebUI.delay(3)


//OTHER DATA
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_contract_less_tenor'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_contract_less_tenor'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_contract_less_tenor'))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_contract_less_tenor'), 'No', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_rental_business'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_rental_business'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_rental_business'))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_rental_business'), 'No', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_asset_online_transport'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_asset_online_transport'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_asset_online_transport'))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_asset_online_transport'), 'No', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_fraud_indication'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_fraud_indication'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_fraud_indication'))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/select_fraud_indication'), 'No', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_other_data'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_other_data'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_other_data'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_other_data'))
WebUI.delay(3)


//TERM & CONDITION
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_ktp_pemohon'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_ktp_pemohon'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_ktp_pemohon'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_ktp_pemohon'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_kk'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_kk'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_kk'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_kk'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_ijin_praktek'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_ijin_praktek'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_ijin_praktek'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_ijin_praktek'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_npwp'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_npwp'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_npwp'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_npwp'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_tabungan'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_tabungan'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_tabungan'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_tabungan'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_pbb'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_pbb'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_pbb'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_pbb'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_cover_buku_tabungan'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_cover_buku_tabungan'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_cover_buku_tabungan'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_cover_buku_tabungan'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_kk_atas_nama_STNK'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_kk_atas_nama_STNK'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_kk_atas_nama_STNK'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_kk_atas_nama_STNK'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_ktp_pemohon2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_ktp_pemohon2'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_ktp_pemohon2'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/check_fc_ktp_pemohon2'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_other_data'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_other_data'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_other_data'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_save_other_data'))
WebUI.delay(1)


//SUBMIT APPLICATION
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_submit_application'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_submit_application'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_submit_application'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_submit_application'))
//WebUI.delay(1)
//WebUI.verifyAlertPresent(30)
WebUI.acceptAlert()
WebUI.delay(5)


//CLOSE BROWSER
WebUI.closeBrowser()


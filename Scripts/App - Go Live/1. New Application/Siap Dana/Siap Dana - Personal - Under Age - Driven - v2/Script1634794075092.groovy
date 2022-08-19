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
WebUI.setText(findTestObject('Login/username'), username)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//SELECT PROFILE-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Login/btn_select_profile'))
//WebUI.delay(1)
	
	
//MENU APPLICATION-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_menu'))
//WebUI.delay(1)
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/menu_new_application'))
//WebUI.delay(1)
	
	
//ADD NEW APPLICATION-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
void part_1() {
	
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_add_new_app'))
WebUI.delay(1)
	
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/image_select_product'))
WebUI.setText(findTestObject('New Application (NEW)/New Application - Customer/field_product_name'), productOffer)
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_search_product'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_select_product'))
	
WebUI.sendKeys(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), assetAmount)
	
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_next'))
WebUI.delay(1)
	
}
	
//SELECT CUSTOMER-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
void part_2() {
	
WebUI.scrollToElement(findTestObject('New Application (NEW)/New Application - Customer/image_select_customer'), 10)

WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/image_select_customer'))
WebUI.setText(findTestObject('New Application (NEW)/New Application - Customer/field_customer_name'), custName)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/New Application - Customer/select_customer_type'), 'P', false)
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_search_customer'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_select_customer'))
	
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_save_continue_customer'))
WebUI.delay(1)
	
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_save_continue_guarantor'))
WebUI.delay(1)
	
}
	
//ADD APPLICATION DATA-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
void part_3() {
	
WebUI.sendKeys(findTestObject('New Application (NEW)/Application Data/field_tenor'), Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Application Data/field_tenor'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/Application Data/field_tenor'), tenor)
WebUI.sendKeys(findTestObject('New Application (NEW)/Application Data/field_tenor'), Keys.chord(Keys.TAB))
	
WebUI.click(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'), '1', false)
//WebUI.click(findTestObject('New Application (NEW)/Application Data/select_interest_margin'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_interest_margin'), 'FXD', false)
//WebUI.click(findTestObject('New Application (NEW)/Application Data/select_installment_scheme'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_installment_scheme'), 'RF', false)
//WebUI.click(findTestObject('New Application (NEW)/Application Data/input_Advance_rblFirstInstType - Siap Dana'))
//WebUI.click(findTestObject('New Application (NEW)/Application Data/select_app_source'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_app_source'), 'DEALER', false)
//WebUI.click(findTestObject('New Application (NEW)/Application Data/input_Yes_rblIsFudiciaCovered'))
//WebUI.click(findTestObject('New Application (NEW)/Application Data/select_wop'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_wop'), 'ADBCA', false)
WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/App Data - SIap Dana/select_Select OneRenovasi RumahTravellingPe_9fda3b'), '1', false)
	
WebUI.scrollToElement(findTestObject('New Application (NEW)/Application Data/select_address_copy'), 10)

WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_address_copy'), '1', false)
WebUI.click(findTestObject('New Application (NEW)/Application Data/button_copy_address'))
	
WebUI.setText(findTestObject('New Application (NEW)/Application Data/field_phone_area'), phoneArea)
WebUI.setText(findTestObject('New Application (NEW)/Application Data/field_phone__number'), phoneNumber)
WebUI.setText(findTestObject('New Application (NEW)/Application Data/field_phone_ext'), phoneExt)
	
WebUI.scrollToElement(findTestObject('New Application (NEW)/Application Data/button_save_continue_app_data'), 10)

WebUI.click(findTestObject('New Application (NEW)/Application Data/button_save_continue_app_data'))
WebUI.delay(1)
	
}
	
//ADD ASSET DATA-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
void part_4() {
	
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_add_asset'))
	
WebUI.click(findTestObject('New Application (NEW)/Asset Data/image_select_supplier_branch'))
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_supplier_branch_address'), suppBranchAddress)
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_search_supplier_branch'))
WebUI.click(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/New Folder (1)/a_Select (1)'))
//WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_select_supplier_branch'))

WebUI.click(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/input_Top Up Agreement No_ucLookupTopUpAgrm_f80e6d'))
WebUI.setText(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/input_Customer Name_ucLookupTopUpAgrmntuclT_c68dd5'), custName)
WebUI.click(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/a_SEARCH_1'))
WebUI.click(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/a_Select_1'))
	
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/input_Asset Price_ucAssetPricetxtInput - Siap Dana'), Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/input_Asset Price_ucAssetPricetxtInput - Siap Dana'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/input_Asset Price_ucAssetPricetxtInput - Siap Dana'), assetPrice)
	
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/input_Down Payment_ucDownPaymentPrcnttxtInput - Siap Dana'), Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/input_Down Payment_ucDownPaymentPrcnttxtInput - Siap Dana'), Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/input_Down Payment_ucDownPaymentPrcnttxtInput - Siap Dana'), assetDP)
	
WebUI.click(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/a_Get Market Price  Calc  Upping'))
WebUI.delay(3)
	
WebUI.scrollToElement(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/New Folder/input_Bekas_rblAssetCondition'), 10)
	
WebUI.click(findTestObject('Object Repository/SIAP DANA/Asset Data - Siap Dana/New Folder/input_Bekas_rblAssetCondition'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Asset Data/select_asset_usage'), 'P', false)
	
WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/button_save_asset'), 10)
	
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_save_asset'))
WebUI.delay(1)


//asset registration	
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_asset_registration'))
	
WebUI.click(findTestObject('New Application (NEW)/Asset Data/option_self_usage'))
	
WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'), 10)
	
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'), 'LEGAL', false)
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_copy_address'))
	
WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'), 2)
	
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'))
WebUI.delay(1)
	
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_save_continue_asset_data'))
WebUI.delay(1)
	
}
	
//ADD INSURANCE DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
void part_5() {
	
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_edit_insurance'))
WebUI.delay(1)
	
WebUI.selectOptionByLabel(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), insuranceType, false)
WebUI.selectOptionByLabel(findTestObject('New Application (NEW)/Insurance Data/select_rate_type'), 'Non Group', false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_main_coverage_type'), 'ALL RISK', false)
WebUI.delay(1)
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/input_SRCC_cblAddCvgTypeName2'))
	
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_next'))
WebUI.delay(1)
	
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_calculate_insurance'))
WebUI.delay(3)
	
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_save_insurance'))
WebUI.delay(1)
	
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_next_save'))
WebUI.delay(1)
	
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_save_continue_insurance'))
WebUI.delay(1)
	
	
//ADD LIFE INSURANCE DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_save_continue_life_insurance'))
WebUI.delay(1)
	
}
	
//ADD FINANCIAL DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
void part_6() {
	
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_calculate_fee'))
WebUI.delay(1)
	
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_calculate'))
//WebUI.scrollToElement(findTestObject('SIAP DANA/Financial Data - SIap Dana/select_Select OneFlatEffective'), 0)
//WebUI.selectOptionByValue(findTestObject('Object Repository/SIAP DANA/Financial Data - SIap Dana/select_Select OneFlatEffective'),
//	'FLT', false)
WebUI.delay(1)
	
WebUI.scrollToElement(findTestObject('New Application (NEW)/Financial Data/button_calculate_installment'), 10)

WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_calculate_installment'))
WebUI.delay(5)

WebUI.scrollToElement(findTestObject('New Application (NEW)/Financial Data/button_save_continue_fin_data'), 10)

WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_save_continue_fin_data'))
WebUI.delay(1)
	
	
	
//ADD COMISSION DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_save_continue_comm_data'))
WebUI.delay(1)
	
	
//ADD OTHER DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_save_continue_otherr_data'))
WebUI.delay(1)
	
}
	
//ADD OTHER INFO---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
void part_7() {
	
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_contract_employee_less_than_tenor'), 'No', false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_rental_business_without_vehicle'), 'No', false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_asset_for_online_transport'), 'No', false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_fraud_indication'), 'No', false)

WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_save_continue_other_info'))
WebUI.delay(1)
	
}
	
//ADD TERM & CONDITION---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
void part_8() {
	
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition - Siap Dana/input_No_gvTermConditionctl02cbChecked'))
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition - Siap Dana/input_Yes_gvTermConditionctl03cbChecked'))
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition - Siap Dana/input_Yes_gvTermConditionctl04cbChecked'))
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition - Siap Dana/input_No_gvTermConditionctl05cbChecked'))
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition - Siap Dana/input_No_gvTermConditionctl06cbChecked'))
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition - Siap Dana/input_Yes_gvTermConditionctl07cbChecked'))
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition - Siap Dana/input_No_gvTermConditionctl08cbChecked'))
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition - Siap Dana/input_No_gvTermConditionctl09cbChecked'))
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition - Siap Dana/input_No_gvTermConditionctl10cbChecked'))
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition - Siap Dana/input_No_gvTermConditionctl11cbChecked'))
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition - Siap Dana/input_No_gvTermConditionctl12cbChecked'))
WebUI.click(findTestObject('Object Repository/SIAP DANA/Term n Condition - Siap Dana/input_No_gvTermConditionctl13cbChecked'))
	
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_save_continue_term_condition'))
WebUI.delay(1)
	
}
	
//SUBMIT APPLICATION---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
void part_9() {
	
	WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_submit_app'), 30)
	WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_submit_app'))
	WebUI.verifyAlertPresent(0)
	WebUI.acceptAlert()
	WebUI.delay(3)
	
}
	
	
//CALL METHOD
part_1()
part_2()
part_3()
part_4()
part_5()
part_6()
part_7()
part_8()
part_9()
	
//CLOSE BROWSER---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.closeBrowser()
	
	
	

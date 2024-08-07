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

WebUI.openBrowser('')
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()


//INPUT CREDENTIAL-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.setText(findTestObject('Login/username'), 'ABW0572')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//SELECT PROFILE-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Login/btn_select_profile'))
WebUI.delay(5)


//MENU APPLICATION-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_menu'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/menu_new_application'))
WebUI.delay(3)


//ADD NEW APPLICATION-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_add_new_app'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/image_select_product'))
WebUI.setText(findTestObject('New Application (NEW)/New Application - Customer/field_product_name'), 
    'RCFCV NON PAKET 2021')
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_search_product'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_select_product'))
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'),
	2)
WebUI.sendKeys(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'),
	Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'),
	Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/New Application - Customer/field_asset_number'), 
    '2')
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_next'))
WebUI.delay(3)


//SELECT CUSTOMER-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.scrollToElement(findTestObject('New Application (NEW)/New Application - Customer/image_select_customer'), 
    0)
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/image_select_customer'))
WebUI.setText(findTestObject('New Application (NEW)/New Application - Customer/field_customer_name'), 
    'Quill Seven')
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/New Application - Customer/select_customer_type'), 
    'P', false)
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_search_customer'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_select_customer'))
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/input_-_lb_Form_SaveContCust'))
WebUI.delay(25)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/New Application - Customer/button_save_continue_guarantor'), 2)
WebUI.click(findTestObject('New Application (NEW)/New Application - Customer/button_save_continue_guarantor'))
WebUI.delay(3)


//ADD APPLICATION DATA-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.sendKeys(findTestObject('New Application (NEW)/Application Data/field_tenor'), 
    Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Application Data/field_tenor'), 
    Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/Application Data/field_tenor'), 
    '48')
WebUI.sendKeys(findTestObject('New Application (NEW)/Application Data/field_tenor'), 
    Keys.chord(Keys.ENTER))
WebUI.delay(1)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'), 
    2)
WebUI.click(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_payment_frequency'), 
    '1', false)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/select_interest_margin'), 
    2)
WebUI.click(findTestObject('New Application (NEW)/Application Data/select_interest_margin'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_interest_margin'), 
    'FXD', false)
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/select_installment_scheme'), 
    2)
WebUI.click(findTestObject('New Application (NEW)/Application Data/select_installment_scheme'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_installment_scheme'), 
    'RF', false)
WebUI.click(findTestObject('New Application (NEW)/Application Data/input_Advance_rblFirstInstType'))
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/select_app_source'), 
    2)
WebUI.click(findTestObject('New Application (NEW)/Application Data/select_app_source'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_app_source'), 
    'DEALER', false)
WebUI.click(findTestObject('New Application (NEW)/Application Data/input_Yes_rblIsFudiciaCovered'))
WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Application Data/select_wop'), 
    2)
WebUI.click(findTestObject('New Application (NEW)/Application Data/select_wop'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_wop'), 
    'ADBCA', false)
WebUI.delay(1)
WebUI.scrollToElement(findTestObject('New Application (NEW)/Application Data/select_address_copy'), 
    0)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Application Data/select_address_copy'), 
    '1', false)
WebUI.click(findTestObject('New Application (NEW)/Application Data/button_copy_address'))
WebUI.setText(findTestObject('New Application (NEW)/Application Data/field_phone_area'), '0')
WebUI.setText(findTestObject('New Application (NEW)/Application Data/field_phone__number'), '08123456789')
WebUI.setText(findTestObject('New Application (NEW)/Application Data/field_phone_ext'), 
    '0')
WebUI.scrollToElement(findTestObject('New Application (NEW)/Application Data/button_save_continue_app_data'), 0)
WebUI.click(findTestObject('New Application (NEW)/Application Data/button_save_continue_app_data'))
WebUI.delay(3)


//ADD ASSET DATA-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//ASET 1=================================================================================================================================================
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_add_asset'))
WebUI.delay(1)
WebUI.click(findTestObject('New Application (NEW)/Asset Data/image_select_supplier_branch'))
WebUI.delay(1)
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_supplier_branch_address'), 
    '%tangerang%')
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_search_supplier_branch'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_select_supplier_branch'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Asset Data/select_sales'), 
    '47763', false)
WebUI.click(findTestObject('New Application (NEW)/Asset Data/image_select_asset_name'))
WebUI.delay(1)
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_asset_name'), 
    '%innova%')
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_search_asset_name'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_select_asset_name'))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_asset_price'), 
    Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_asset_price'), 
    Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_asset_price'), 
    '500000000')
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), 
    Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), 
    Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_down_payment'), 
    '30')
WebUI.delay(1)
WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/field_no_mesin'), 0)
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_no_mesin'), 'LM15776305105')
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_no_rangka'), 'MMHRGK7660GJ703105')
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_no_plat'), 
    'B 1105 MPA')
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Asset Data/select_asset_usage'), 
    'P', false)
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_manufacture_year'), 
    '2020')
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_made_in'), 
    'JEPANG')
WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/button_save_asset'), 0)
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_save_asset'))
WebUI.delay(0)

//REGISTRATION ASSET
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_asset_registration'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/option_self_usage'))
WebUI.delay(1)
WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'), 
    0)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'), 
    'LEGAL', false)
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_copy_address'))
WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'), 0)
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'))
WebUI.delay(1)

//ASET 2=================================================================================================================================================
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_add_asset'))
WebUI.delay(1)
WebUI.click(findTestObject('New Application (NEW)/Asset Data/image_select_supplier_branch'))
WebUI.delay(1)
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_supplier_branch_address'),
	'%tangerang%')
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_search_supplier_branch'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_select_supplier_branch'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Asset Data/select_sales'),
	'47763', false)
WebUI.click(findTestObject('New Application (NEW)/Asset Data/image_select_asset_name'))
WebUI.delay(1)
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_asset_name'),
	'%calya%')
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_search_asset_name'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_select_asset_name'))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_asset_price'),
	Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_asset_price'),
	Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_asset_price'),
	'200000000')
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_down_payment'),
	Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_down_payment'),
	Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/Asset Data/field_down_payment'),
	'30')
WebUI.delay(1)
WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/field_no_mesin'), 0)
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_no_mesin'), 'LM15776305106')
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_no_rangka'), 'MMHRGK7660GJ703106')
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_no_plat'),
	'B 1106 MPA')
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Asset Data/select_asset_usage'),
	'P', false)
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_manufacture_year'),
	'2020')
WebUI.setText(findTestObject('New Application (NEW)/Asset Data/field_made_in'),
	'JEPANG')
WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/button_save_asset'), 0)
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_save_asset'))
WebUI.delay(3)

//REGISTRATION ASSET 2
WebUI.verifyElementPresent(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_ARMADA AUTO TARA - TGR CIKOKOL 1_gvAs_fab4de'), 2)
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Asset Data - Multi/input_ARMADA AUTO TARA - TGR CIKOKOL 1_gvAs_fab4de'))
//WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_asset_registration'))
WebUI.click(findTestObject('New Application (NEW)/Asset Data/option_self_usage'))
WebUI.delay(1)
WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'),
	0)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Asset Data/select_address_copy_source'),
	'LEGAL', false)
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_copy_address'))
WebUI.scrollToElement(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'), 0)
WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_save_asset_registration'))
WebUI.delay(1)

WebUI.click(findTestObject('New Application (NEW)/Asset Data/button_save_continue_asset_data'))
WebUI.delay(3)


//ADD INSURANCE DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//INSURANCE ASSET 1====================================================================================================================================================================================
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_edit_insurance'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'), 
    '83', false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_rate_type'), 
    'NG', false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_main_coverage_type'), 
    'ALL RISK', false)
WebUI.delay(3)
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_next'))
WebUI.delay(3)
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_calculate_insurance'))
WebUI.delay(5)
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_save_insurance'))
WebUI.delay(3)
//WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_next_save'))
//WebUI.delay(1)
//WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_save_continue_insurance'))
//WebUI.delay(3)

//INSURANCE ASSET 2====================================================================================================================================================================================
WebUI.click(findTestObject('Object Repository/New Application (NEW)/Insurance Data - Multi/input_TOYOTA AVANZA 1.3 E MT_gvEntryInsctl0_08bdfe'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_insurance_name'),
	'83', false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_rate_type'),
	'NG', false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_main_coverage_type'),
	'ALL RISK', false)
WebUI.delay(3)
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_next'))
WebUI.delay(3)
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_calculate_insurance'))
WebUI.delay(5)
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_save_insurance'))
WebUI.delay(3)
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_next_save'))
WebUI.delay(3)
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_save_continue_insurance'))
WebUI.delay(3)


//ADD LIFE INSURANCE DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/check_cover_life_insurance'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_life_insurance_name'), 
    '6', false)
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/check_customer_insured'))
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Insurance Data/select_premium_payment_method'), 
    'FO', false)
WebUI.click(findTestObject('New Application (NEW)/Insurance Data/button_save_continue_life_insurance'))
WebUI.delay(3)


//ADD FINANCIAL DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('New Application (NEW)/Financial Data/input_Percentage_rblProvisionType'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Financial Data/field_provision_amount'), 
    Keys.chord(Keys.CONTROL + 'a'))
WebUI.sendKeys(findTestObject('New Application (NEW)/Financial Data/field_provision_amount'), 
    Keys.chord(Keys.DELETE))
WebUI.sendKeys(findTestObject('New Application (NEW)/Financial Data/field_provision_amount'), 
    '50000000')
WebUI.delay(1)
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_calculate_fee'))
WebUI.delay(2)
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_calculate'))
WebUI.delay(2)
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_calculate_installment'))
WebUI.delay(5)
WebUI.scrollToElement(findTestObject('New Application (NEW)/Financial Data/button_save_continue_fin_data'), 0)
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_save_continue_fin_data'))
WebUI.delay(5)


//ADD COMISSION DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_save_continue_comm_data'))
WebUI.delay(5)


//ADD OTHER DATA---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('New Application (NEW)/Financial Data/button_save_continue_otherr_data'))
WebUI.delay(5)


//ADD OTHER INFO---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_contract_employee_less_than_tenor'), 
    'No', false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_rental_business_without_vehicle'), 
    'No', false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_asset_for_online_transport'), 
    'No', false)
WebUI.selectOptionByValue(findTestObject('New Application (NEW)/Other Data and Term n Condition/select_fraud_indication'), 
    'No', false)
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_save_continue_other_info'))
WebUI.delay(3)

//ADD TERM & CONDITION---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/check_fc_ktp_pemohon'))
WebUI.delay(1)
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/check_fc_kk'))
WebUI.delay(1)
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/check_fc_ijin_praktek'))
WebUI.delay(1)
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/check_fc_npwp'))
WebUI.delay(1)
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/check_fc_rek_tabungan'))
WebUI.delay(1)
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/check_doc_kepemilikan_rumah_PBB'))
WebUI.delay(1)
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/check_cover_buku_tabungan'))
WebUI.delay(1)
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/check_kk_atas_nama_stnk'))
WebUI.delay(1)
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/check_fc_ktp_pemohon_2'))
WebUI.delay(1)
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_save_continue_term_condition'))
WebUI.delay(3)


//SAVE & SUBMIT APPLICATION---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_submit_app'))
WebUI.delay(1)
WebUI.acceptAlert()
WebUI.delay(5)


//CLOSE BROWSER---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.closeBrowser()


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


//SELECT MENU CENTRALIZED DATA ENTRY COMPLETION
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_menu'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_menu'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_menu'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_menu'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_menu_marketing'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_menu_marketing'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_menu_marketing'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_menu_marketing'), 
    'MARKETING', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/menu_centralized_data_entry_completion'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/menu_centralized_data_entry_completion'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/menu_centralized_data_entry_completion'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/menu_centralized_data_entry_completion'))
//WebUI.delay(1)
WebUI.delay(60)


//INPUT CUST CREDENTIAL (CUST NAME)
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_customer_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_customer_name'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_customer_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_customer_name'), custName)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_action'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_action'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_action'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_action'))
WebUI.delay(1)


//CDE COMPLETION PROCESS
//basic data
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/check_customer_model'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/check_customer_model'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/check_customer_model'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/check_customer_model'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_gender'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_gender'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_gender'))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_gender'), 'F', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_religion'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_religion'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_religion'))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_religion'), 
    'KATOLIK', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_education'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_education'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_education'))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_education'), 
    'SMA', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_mother_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_mother_name'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_mother_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_mother_name'), motherName)
WebUI.delay(1)


//contact data
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_call_reason'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_call_reason'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_call_reason'))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_call_reason'), 
    '538', false)
WebUI.delay(2)


//profession job data
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_profession_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_profession_name'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_profession_name'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_profession_name'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_profession_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_profession_name'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_profession_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_profession_name'), profession)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search_profession'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search_profession'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search_profession'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_profession'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_profession'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_profession'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_profession'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_job_position'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_job_position'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_job_position'))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_job_position'), 
    'JPEXEC', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_company_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_company_name'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_company_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_company_name'), companyName)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_industry_type_name2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_industry_type_name2'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_industry_type_name2'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_industry_type_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_industry_type_name'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_industry_type_name'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_industry_type_name'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_industry_type_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_industry_type_name'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_industry_type_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_industry_type_name'), industryType)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search_industry_type'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search_industry_type'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search_industry_type'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_industry_type'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_industry_type'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_industry_type'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_industry_type'))
WebUI.delay(1)

//WebUI.sendKeys(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_number_employee'),
//	Keys.chord(Keys.CONTROL + "a"))
//WebUI.delay(1)
//WebUI.sendKeys(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_number_employee'),
//	Keys.chord(Keys.DELETE))
//WebUI.delay(1)

//WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_number_employee'), 30)
//WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_number_employee'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_number_employee'))
//WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_number_employee'))
//WebUI.doubleClick(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_number_employee'))
//WebUI.sendKeys(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_number_employee'), numberEmployee)
//WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_job_status'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_job_status'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_job_status'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_job_status'), 
    'OTHERS', false)
WebUI.delay(1)


//address data
//legal address
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_add_legal_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_add_legal_address'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_add_legal_address'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_add_legal_address'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_residence_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_residence_address'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_residence_address'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_residence_address'), 
    'Residence Address', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_residence_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_residence_address'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_residence_address'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_residence_address'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_address_type'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_address_type'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_address_type'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_address_type'), 
    'Legal Address', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_address'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_address'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_address'), address)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_rt'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_rt'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_rt'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_rt'), rt)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_rw'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_rw'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_rw'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_rw'), rw)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_zipCode'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_zipCode'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_zipCode'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_zipCode'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_kelurahan'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_kelurahan'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_kelurahan'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_kelurahan'), kelurahan)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search_kelurahan'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search_kelurahan'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search_kelurahan'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_kelurahan'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_kelurahan'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_kelurahan'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_kelurahan'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_phone_area'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_phone_area'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_phone_area'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_phone_area'), phoneArea)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_phone_number'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_phone_number'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_phone_number'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_phone_number'), phoneNumber)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_phone_ext'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_phone_ext'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_phone_ext'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_phone_ext'), phoneExt)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_ownership'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_ownership'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_ownership'))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_ownership'), 
    'SELF', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_legal_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_legal_address'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_legal_address'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_legal_address'))
WebUI.delay(1)


//residence address
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_residence_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_residence_address'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_residence_address'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_residence_address'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address1'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address1'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address1'))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address1'),
	'LEGAL', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_residence_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_residence_address'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_residence_address'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_residence_address'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_building_type'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_building_type'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_building_type'))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_building_type'),
	'Apartment', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_stay_length'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_stay_length'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_stay_length'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_stay_length'))
WebUI.doubleClick(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_stay_length'))
WebUI.sendKeys(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_stay_length'), '48')

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_legal_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_legal_address'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_legal_address'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_legal_address'))
WebUI.delay(1)


//job address
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_job_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_job_address'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_job_address'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_job_address'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address1'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address1'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address1'))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address1'),
	'LEGAL', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_residence_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_residence_address'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_residence_address'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_residence_address'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_legal_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_legal_address'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_legal_address'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_legal_address'))
WebUI.delay(1)


//emergency contact
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_add_emergency_contact'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_add_emergency_contact'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_add_emergency_contact'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_add_emergency_contact'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_em_contact_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_em_contact_name'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_em_contact_name'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_em_contact_name'), contactName)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_cust_relationship'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_cust_relationship'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_cust_relationship'))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_cust_relationship'), 
    'FATHER', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_mobile_phone'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_mobile_phone'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_mobile_phone'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_mobile_phone'), mobilePhone)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_em_contact'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_em_contact'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_em_contact'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_em_contact'))
WebUI.delay(1)


//wop
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_debitor'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_debitor'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_debitor'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/img_search_debitor'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_bi_code'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_bi_code'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_bi_code'))
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_bi_code'), biCode)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search_bi_code'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search_bi_code'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search_bi_code'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_bi_code'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_bi_code'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_bi_code'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_select_bi_code'))
WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_business_scale'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_business_scale'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_business_scale'))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_business_scale'), 
    '03', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_way_of_payment'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_way_of_payment'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_way_of_payment'))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_way_of_payment'), 
    'ADBCA', false)
WebUI.delay(1)


//asset registration
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_asset'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_asset'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_asset'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_asset'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/check_self_usage'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/check_self_usage'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/check_self_usage'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/check_self_usage'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address_asset'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address_asset'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address_asset'))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address_asset'), 
    'LEGAL', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_legal_address_asset'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_legal_address_asset'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_legal_address_asset'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_legal_address_asset'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_way_of_payment'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_asset'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_asset'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_asset'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_asset'))
WebUI.delay(1)


//asset registration 2
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_asset2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_asset2'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_asset2'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_edit_asset2'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/check_self_usage'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/check_self_usage'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/check_self_usage'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/check_self_usage'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address_asset'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address_asset'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address_asset'))
WebUI.selectOptionByValue(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_legal_address_asset'),
	'LEGAL', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_legal_address_asset'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_legal_address_asset'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_legal_address_asset'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_copy_legal_address_asset'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_way_of_payment'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_asset'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_asset'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_asset'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_save_asset'))
WebUI.delay(2)


//submit data
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_submit'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_submit'), 30)
//WebUI.verifyElementClickable(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_submit'))
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_submit'))
WebUI.delay(5)


//CLOSE BROWSER
WebUI.closeBrowser()


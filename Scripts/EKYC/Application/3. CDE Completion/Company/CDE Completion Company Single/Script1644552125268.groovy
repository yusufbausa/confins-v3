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
WebUI.setText(findTestObject('Login/username'), usernameCDE)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)


//SELECT ROLE
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/select_role'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Personal/select_role'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Personal/select_role'))
//WebUI.delay(2)


//SELECT MENU CENTRALIZED DATA ENTRY COMPLETION
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_menu'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_menu'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_menu'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_menu_marketing'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_menu_marketing'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/select_menu_marketing'), 'MARKETING', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/menu_centralized_data_entry_completion'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/menu_centralized_data_entry_completion'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/menu_centralized_data_entry_completion'))
WebUI.delay(5)


//INPUT CUST CREDENTIAL (CUST NAME)
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_customer_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_customer_name'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/field_customer_name'), custName)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_search'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_action'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_action'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Personal/btn_action'))
WebUI.delay(1)


//CDE COMPLETION PROCESS
//customer main data
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/img_search_industry_type'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/img_search_industry_type'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/img_search_industry_type'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_industry_type_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_industry_type_name'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_industry_type_name'), industryType)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_search_industry_type'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_select_industry_type'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_select_industry_type'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_select_industry_type'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_number_employe'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_number_employe'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_number_employe'))
WebUI.doubleClick(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_number_employe'))
WebUI.sendKeys(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_number_employe'), numberEmployee)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_establish_date'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_establish_date'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_establish_date'), establishDate)
//WebUI.sendKeys(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_establish_date'), Keys.chord(Keys.ENTER))
WebUI.delay(1)


//contact result
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_call_reason'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_call_reason'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_call_reason'), 'Call is not picked up', false)
WebUI.delay(1)


//customer address
//legal address
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_add_legal_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_add_legal_address'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_add_legal_address'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_address_type'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_address_type'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_address_type'), 'Legal Address', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_address'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_address'), address)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_rt'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_rt'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_rt'), rt)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_rw'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_rw'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_rw'), rw)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/img_search_zipCode'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/img_search_zipCode'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/img_search_zipCode'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_kelurahan'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_kelurahan'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_kelurahan'), kelurahan)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_search_zipCode'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_search_zipCode'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_search_zipCode'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_select_zipCode'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_select_zipCode'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_select_zipCode'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_phone_area'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_phone_area'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_phone_area'), phoneArea)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_phone_number'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_phone_number'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_phone_number'), phoneNumber)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_phone_ext'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_phone_ext'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_phone_ext'), phoneExt)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_building_ownership'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_building_ownership'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_building_ownership'), 'Sewa Tahunan', false)
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_establish_date'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_address'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_address'))
WebUI.delay(1)

//company address
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_edit_company_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_edit_company_address'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_edit_company_address'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_address_to_copy'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_address_to_copy'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_address_to_copy'), 'Legal Address', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_copy_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_copy_address'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_copy_address'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_establish_date'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_address'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_address'))
WebUI.delay(1)


//management shareholder data
//personal 1
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_add_personal_share_holder'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_add_personal_share_holder'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_add_personal_share_holder'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/img_search_personal_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/img_search_personal_name'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/img_search_personal_name'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_customer_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_customer_name'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_customer_name'), personalName1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_search_customer'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_search_customer'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_search_customer'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_select_customer1'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_select_customer1'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_select_customer1'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_job_position'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_job_position'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_job_position'), 'DIREKTUR', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_share_percentage'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_share_percentage'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_share_percentage'))
WebUI.doubleClick(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_share_percentage'))
WebUI.sendKeys(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_share_percentage'), '45')

WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_edit_company_address'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_personal_share'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_personal_share'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_personal_share'))
WebUI.delay(1)

//personal 2
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_add_personal_share_holder'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_add_personal_share_holder'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_add_personal_share_holder'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/img_search_personal_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/img_search_personal_name'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/img_search_personal_name'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_customer_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_customer_name'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_customer_name'), personalName2)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_search_customer'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_search_customer'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_search_customer'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_select_customer2'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_select_customer2'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_select_customer2'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_job_position'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_job_position'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_job_position'), 'EXECUTIVE', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_share_percentage'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_share_percentage'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_share_percentage'))
WebUI.doubleClick(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_share_percentage'))
WebUI.sendKeys(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_share_percentage'), '55')

WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_edit_company_address'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_personal_share'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_personal_share'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_personal_share'))
WebUI.delay(1)


//contact information data
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_contact_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_contact_name'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_contact_name'), contactName)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_job_position (1)'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_job_position (1)'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_job_position (1)'), 'DIREKTUR UTAMA', false)
WebUI.delay(1)


//legal document data
//akta doc
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_add_legal_doc'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_add_legal_doc'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_add_legal_doc'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_legal_doc_type'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_legal_doc_type'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_legal_doc_type'), 'AKTA PENDIRIAN', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_doc_number'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_doc_number'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_doc_number'), '123456789')

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_date_issued'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_date_issued'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_date_issued'), '01/01/2018')

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_expired_date'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_expired_date'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_expired_date'), '01/01/2025')

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_legal_doc'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_legal_doc'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_legal_doc'))
WebUI.delay(1)

//last akta doc
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_add_legal_doc'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_add_legal_doc'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_add_legal_doc'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_legal_doc_type'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_legal_doc_type'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_legal_doc_type'), 'LAST AKTA', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_doc_number'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_doc_number'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_doc_number'), '0987654321')

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_date_issued'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_date_issued'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_date_issued'), '01/01/2018')

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_expired_date'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_expired_date'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_expired_date'), '01/01/2025')

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_legal_doc'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_legal_doc'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_legal_doc'))
WebUI.delay(1)

//siup doc
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_add_legal_doc'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_add_legal_doc'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_add_legal_doc'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_legal_doc_type'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_legal_doc_type'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_legal_doc_type'), 'Siup', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_doc_number'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_doc_number'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_doc_number'), '123654789')

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_date_issued'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_date_issued'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_date_issued'), '01/01/2018')

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_expired_date'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_expired_date'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_expired_date'), '01/01/2025')

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_legal_doc'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_legal_doc'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_legal_doc'))
WebUI.delay(1)


//attribute list data
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/img_search_debitor_group'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/img_search_debitor_group'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/img_search_debitor_group'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_bi_code'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_bi_code'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/field_bi_code'), biCode)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_search_bi_code'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_search_bi_code'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_search_bi_code'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_select_bi_code'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_select_bi_code'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_select_bi_code'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_debitor_business_scale'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_debitor_business_scale'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_debitor_business_scale'), 'Usaha Menengah', false)
WebUI.delay(1)


//application info
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_wop'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_wop'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_wop'), 'Auto Debit BCA', false)
WebUI.delay(1)


//asset data
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_edit_asset'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_edit_asset'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_edit_asset'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_address_to_copy_asset'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_address_to_copy_asset'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_address_to_copy_asset'), 'Legal Address', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_copy_address_asset'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_copy_address_asset'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_copy_address_asset'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/select_wop'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_asset'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_asset'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_save_asset'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_submit'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_submit'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/CDE Completion Company/btn_submit'))
WebUI.delay(5)


//CLOSE BROWSER
WebUI.closeBrowser()
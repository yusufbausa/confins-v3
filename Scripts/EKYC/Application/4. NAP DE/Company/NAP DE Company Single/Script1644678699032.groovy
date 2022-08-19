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
WebUI.waitForElementPresent(findTestObject('Login/btn_select_profile'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_select_profile'), 30)
WebUI.click(findTestObject('Login/btn_select_profile'))
WebUI.delay(1)


//SELECT MENU NAP DE
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_menu'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_menu'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_menu'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/menu_new_application_data_entry'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/menu_new_application_data_entry'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/menu_new_application_data_entry'))
WebUI.delay(5)


//INPUT CUST CREDENTIAL
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_cust_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_cust_name'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/field_cust_name'), custName)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_search_customer'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_search_customer'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Personal/btn_search_customer'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_action'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_action'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_action'))
WebUI.delay(1)


//PRE APP
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_next_to_app'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_next_to_app'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_next_to_app'))
WebUI.delay(1)


//SELECT CUSTOMER
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'))
WebUI.delay(1)


//GUARANTOR
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'))
WebUI.delay(1)


//APPLICATION DATA
WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_self_usage'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_self_usage'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_self_usage'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_self_usage'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/select_address_to_copy'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/select_address_to_copy'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/NAP DE Company/select_address_to_copy'), 'Legal Address', false)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_copy_address'))
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'))
WebUI.delay(1)


//ASSET DATA
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_edit_asset_data'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_edit_asset_data'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_edit_asset_data'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/select_sales_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/select_sales_name'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/NAP DE Company/select_sales_name'), 'MANDA', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_no_mesin'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_no_mesin'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_no_mesin'), noMesin)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_no_rangka'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_no_rangka'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_no_rangka'), noRangka)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_manufactur_year'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_manufactur_year'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_manufactur_year'), manufYear)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_made_in'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_made_in'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_made_in'), madeIn)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_cylinder'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_cylinder'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_cylinder'), cylinder)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_transmission'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_transmission'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_transmission'), transmission)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_color'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_color'), 30)
WebUI.setText(findTestObject('Object Repository/EKYC/Application/NAP DE Company/field_color'), color)

WebUI.scrollToElement(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_asset'), 0)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_asset'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_asset'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_asset'))
WebUI.delay(1)


//asset registration
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_asset_registration'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_asset_registration'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_asset_registration'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_management_share'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_management_share'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_management_share'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_asset_registration'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_asset_registration'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_asset_registration'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'))
WebUI.delay(1)


//INSURANCE DATA
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_edit_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_edit_insurance'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_edit_insurance'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_next_to_calculate'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_next_to_calculate'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_next_to_calculate'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_calculate_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_calculate_insurance'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_calculate_insurance'))
WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_insurance'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_insurance'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_next_to_save'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_next_to_save'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_next_to_save'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'))
WebUI.delay(1)


//LIFE INSURANCE DATA
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'))
WebUI.delay(1)


//FINANCIAL DATA
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_calculate_fee'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_calculate_fee'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_calculate_fee'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_calculate_after_fee'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_calculate_after_fee'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_calculate_after_fee'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_calculate_installment'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_calculate_installment'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_calculate_installment'))
WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'))
WebUI.delay(1)


//COMISSION DATA
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_and_continue'))
WebUI.delay(1)


//OTHER DATA
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/select_contract_less_tenor'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/select_contract_less_tenor'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/NAP DE Company/select_contract_less_tenor'), 'No', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/select_rental_business'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/select_rental_business'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/NAP DE Company/select_rental_business'), 'No', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/select_asset_online_trannsport'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/select_asset_online_trannsport'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/NAP DE Company/select_asset_online_trannsport'), 'No', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/select_fraud_indication'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/select_fraud_indication'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/EKYC/Application/NAP DE Company/select_fraud_indication'), 'No', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_other_info'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_other_info'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_other_info'))
WebUI.delay(1)


//TERM & CONDITION
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_ktp_pemohon'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_ktp_pemohon'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_ktp_pemohon'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_ktp_direktur'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_ktp_direktur'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_ktp_direktur'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_ijin_praktek'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_ijin_praktek'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_ijin_praktek'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_npwp'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_npwp'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_npwp'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_siup'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_siup'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_siup'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_rekening'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_rekening'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_rekening'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_lap_keuangan'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_lap_keuangan'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_lap_keuangan'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_tdp'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_tdp'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_tdp'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_akta_pendirian'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_akta_pendirian'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_akta_pendirian'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_rek_listrik'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_rek_listrik'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_rek_listrik'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_doc_keuangan'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_doc_keuangan'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_doc_keuangan'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_surat_perjanjian_kerja'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_surat_perjanjian_kerja'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_surat_perjanjian_kerja'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_doc_kepemilikan_rumah'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_doc_kepemilikan_rumah'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/check_fc_doc_kepemilikan_rumah'))

WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_other_info'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_other_info'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_save_other_info'))
WebUI.delay(1)


//SUBMIT APPLICATION
WebUI.waitForElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_submit'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_submit'), 30)
WebUI.click(findTestObject('Object Repository/EKYC/Application/NAP DE Company/btn_submit'))
//WebUI.delay(1)
//WebUI.waitForAlert(30)
//WebUI.verifyAlertPresent(0)
WebUI.acceptAlert()
WebUI.delay(5)


//CLOSE BROWSER
WebUI.closeBrowser()


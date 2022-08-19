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

// NEW APPLICATION RETAIL PERSONAL SINGLE ASSET

//OPENING BROWSER
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//INPUT CREDENTIAL-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
WebUI.setText(findTestObject('Login/username'), username)

//WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
WebUI.setText(findTestObject('Login/password'), password)

//WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)


//SELECT PROFILE-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//WebUI.waitForElementPresent(findTestObject('Login/btn_select_profile'), 30)
//WebUI.verifyElementPresent(findTestObject('Login/btn_select_profile'), 30)
WebUI.click(findTestObject('Login/btn_select_profile'))
WebUI.delay(1)


//SELECT MENU EDIT APP RETURN HANDLING
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_menu_edit_app'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_menu_edit_app'))
WebUI.delay(1)


//INPUT CUST CREDENTIAL (APP NUMBER)
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_application_number'), 30)
WebUI.setText(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_application_number'), appNo)

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_search_application'))
WebUI.delay(1)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_entry'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_entry'))
WebUI.delay(5)

//TAB CUSTOMER
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'))
WebUI.delay(4)


//TAB GUARANTOR
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'))
WebUI.delay(4)


//TAB APPLICATION DATA
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_tenor'), 30)
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_tenor'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_tenor'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_tenor'), tenor)
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_tenor'), Keys.chord(Keys.TAB))
WebUI.delay(1)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'))
WebUI.delay(2)


//TAB ASSET DATA
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_edit_asset_data'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_edit_asset_data'))
WebUI.delay(2)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_dp_type_percentage'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_dp_type_percentage'))
WebUI.delay(1)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_dp'), 30)
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_dp'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_dp'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_dp'), assetDP)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_no_mesin'), 30)
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_no_mesin'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_no_mesin'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_no_mesin'), noMesin)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_no_rangka'), 30)
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_no_rangka'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_no_rangka'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_no_rangka'), noRangka)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_made_in'), 30)
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_made_in'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_made_in'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_made_in'), madeIn)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_cylinder'), 30)
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_cylinder'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_cylinder'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_cylinder'), cylinder)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_trransmission'), 30)
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_trransmission'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_trransmission'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_trransmission'), transmission)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_color'), 30)
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_color'), Keys.chord(Keys.CONTROL + "a"))
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_color'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_color'), color)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_asset'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_asset'))
WebUI.delay(1)

//ASSET REGISTRATION
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_asset_registration'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_asset_registration'))
WebUI.delay(1)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_self_usage'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_self_usage'))
WebUI.delay(1)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_registration'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_registration'))
WebUI.delay(2)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue_asset'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue_asset'))
WebUI.delay(2)


//TAB INSURANCE DATA
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_edit_insurance'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_edit_insurance'))
WebUI.delay(1)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/select_scheme_name'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Application/Edit App Return Handling/select_scheme_name'), 
    insuranceType, false)
WebUI.delay(1)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/select_rate_type'), 30)
WebUI.selectOptionByValue(findTestObject('Object Repository/Edit Application/Edit App Return Handling/select_rate_type'), 
    'NG', false)

WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/select_main_coverage'), 30)
WebUI.selectOptionByValue(findTestObject('Object Repository/Edit Application/Edit App Return Handling/select_main_coverage'), 
    'ALL RISK', false)
WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_TPL'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_TPL'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_next_to_calculate'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_next_to_calculate'))
WebUI.delay(1)


//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_calculate_insurance'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_calculate_insurance'))
WebUI.delay(5)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_insurance'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_insurance'))
WebUI.delay(2)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_next_to_continue'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_next_to_continue'))
WebUI.delay(2)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'))
WebUI.delay(2)


//TAB LIFE INSURANCE DATA
//WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Insurance Data/select_life_insurance_name'), 30)
WebUI.selectOptionByLabel(findTestObject('New Application (NEW)/Insurance Data/select_life_insurance_name'),
	lifeInsuranceType, false)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'))
WebUI.delay(1)


//TAB FINANCIAL DATA
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_calculate_fee'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_calculate_fee'))
WebUI.delay(2)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_calculate'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_calculate'))
WebUI.delay(2)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_calculate_installment'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_calculate_installment'))
WebUI.delay(5)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'))
WebUI.delay(2)


//TAB COMMISSION DATA
WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'))
WebUI.delay(2)


//TAB OTHER DATA
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'))
WebUI.delay(2)


//TAB OTHER INFO
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_other_info'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_other_info'))
WebUI.delay(2)


//TAB TERM & CONDITION
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_ktp_pemohon'), 30)
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_ktp_pemohon'))
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_ktp_suami_istri'), 30)
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_ktp_suami_istri'))
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_kk'), 30)
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_kk'))
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_ijin_praktek'), 30)
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_ijin_praktek'))
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_npwp'), 30)
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_npwp'))
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_rek_koran'), 30)
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_rek_koran'))
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_dokumen_surat_nikah'), 30)
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_dokumen_surat_nikah'))
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_dokumen_pbb'), 30)
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_dokumen_pbb'))
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_cover_buku_tabungan'), 30)
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_cover_buku_tabungan'))
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_kk_nama_stnk'), 30)
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_kk_nama_stnk'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_other_info'), 30)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_other_info'))
WebUI.delay(1)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_submit_application'), 30)
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_submit_application'))
//WebUI.verifyAlertPresent(1)
//WebUI.acceptAlert()
//WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_submit_app'), 30)
WebUI.click(findTestObject('New Application (NEW)/Other Data and Term n Condition/button_submit_app'))
//WebUI.verifyAlertPresent(1)
WebUI.acceptAlert()
WebUI.delay(3)


//CLOSE BROWSER
WebUI.closeBrowser()


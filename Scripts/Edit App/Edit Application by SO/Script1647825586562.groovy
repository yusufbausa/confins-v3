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
WebUI.delay(1)
	
	
//SELECT PROFILE-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Login/btn_select_profile'))
WebUI.delay(1)
	
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App by SO/select_role'))
	
//SELECT MENU EDIT APP BY SO
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App by SO/btn_menu'))
//WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App by SO/btn_menu_edit_app_by_SO'))
WebUI.delay(1)
	
	
//INPUT CUST CREDENTIAL (APP NO)
WebUI.setText(findTestObject('Object Repository/Edit Application/Edit App by SO/field_application_number'), appNo)
	
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App by SO/btn_search'))
//WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App by SO/btn_action'))
WebUI.delay(1)
	
	
//SELECT CUSTOMER
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'))
WebUI.delay(1)
	
	
//SELECT GUARANTOR
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'))
WebUI.delay(1)
	
	
//APPLICATION DATA
WebUI.scrollToElement(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_tenor'), 0)
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_tenor'))
WebUI.doubleClick(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_tenor'))
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_tenor'),
	Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_tenor'), tenor)
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_tenor'),
	Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'))
WebUI.delay(1)
	
	
//ASSET DATA
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_edit_asset_data'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_dp_type_percentage'))

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_dp'))
WebUI.doubleClick(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_dp'))
WebUI.sendKeys(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_dp'),
	Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_dp'), assetDp)
//WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_no_mesin'), noMesin)

WebUI.setText(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_no_rangka'), noRangka)
//WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_made_in'), madeIn)

WebUI.setText(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_cylinder'), cylinder)

WebUI.setText(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_trransmission'), transmission)

WebUI.setText(findTestObject('Object Repository/Edit Application/Edit App Return Handling/field_color'), color)
	
WebUI.scrollToElement(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_asset'), 0)
//WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_asset'))
WebUI.delay(1)
	
	
//ASSET REGISTRATION
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_asset_registration'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_self_usage'))

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_registration'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue_asset'))
WebUI.delay(1)
	
	
//INSURANCE DATA
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_edit_insurance'))
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Application/Edit App Return Handling/select_scheme_name'),
	'COMMERCIAL', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Edit Application/Edit App Return Handling/select_rate_type'),
	'Non Group', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Edit Application/Edit App Return Handling/select_main_coverage'),
	'ALL RISK', false)
//WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_TPL'))

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_next_to_calculate'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_calculate_insurance'))
WebUI.delay(3)
	
WebUI.scrollToElement(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_insurance'), 0)

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_insurance'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_next_to_continue'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'))
WebUI.delay(1)
	
	
//LIFE INSURANCE
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'))
WebUI.delay(1)
	
	
//FINANCIAL DATA
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_calculate_fee'))
//WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_calculate'))
//WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_calculate_installment'))
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'))
WebUI.delay(1)
	
	
//COMISSION DATA
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'))
WebUI.delay(1)
	
	
//OTHER DATA
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_and_continue'))
WebUI.delay(1)
	
	
//OTHER INFO
WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_other_info'))
WebUI.delay(1)
	
	
//TERM & CONDITION
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_ktp_pemohon'))
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_ktp_suami_istri'))
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_kk'))
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_ijin_praktek'))
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_npwp'))
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_rek_koran'))
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_dokumen_surat_nikah'))
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_dokumen_pbb'))
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_cover_buku_tabungan'))
//WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/check_fc_kk_nama_stnk'))
//WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_save_other_info'))
WebUI.delay(1)


WebUI.click(findTestObject('Object Repository/Edit Application/Edit App Return Handling/btn_submit_application'))
//WebUI.verifyAlertPresent(0)
WebUI.acceptAlert()
WebUI.delay(5)
	
	
//CLOSE BROWSER
WebUI.closeBrowser()

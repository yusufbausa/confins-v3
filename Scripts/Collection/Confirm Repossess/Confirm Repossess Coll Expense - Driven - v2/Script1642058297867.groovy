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
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()
	
	
//input credential
WebUI.setText(findTestObject('Login/username'), usernameAR)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)
	
	
//select role
WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/select_role'))
//WebUI.delay(1)
	
	
//select menu confirm repossess	
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/button_menu'))
//WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Confirm Repossess/select_menu_collection'), '270', false)
//WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/extend_menu_repossess'))
//WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/button_menu_repossess'))
//WebUI.delay(1)
	
	
//input cust credential (agreement no)
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_agreement_no'), agreeNo)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/button_search'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/button_edit_collection_data'))
WebUI.delay(1)
	
	
//confirm repossess process
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_repossess_date'), date)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Confirm Repossess/select_asset_location'), '0001ASTRIAJKT01', false)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Confirm Repossess/select_asset_repossess_type'), 'NORMAL', false)
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_asset_condition'), assetCondition)
	
WebUI.click(findTestObject('COLLECTION/Repossession Collection Expense/img_search_zipCode'))
WebUI.setText(findTestObject('COLLECTION/Repossession Collection Expense/field_kelurahan'), '%pancoran%')
WebUI.click(findTestObject('COLLECTION/Repossession Collection Expense/btn_search'))
WebUI.click(findTestObject('COLLECTION/Repossession Collection Expense/btn_select_zipCode'))
//WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_license_plate'), licensePlate)
	
WebUI.setText(findTestObject('COLLECTION/Repossession Collection Expense/field_license_plate'), licensePlate)
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_license_owner'), licenseOwner)
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_license_expired_date'), licenseExpired)
//WebUI.scrollToElement(findTestObject('COLLECTION/Confirm Repossess/field_license_expired_date'), 0)
WebUI.delay(1)

	
//asset checklist
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_ac'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_tape_cdplayer'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kunci'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_dashboard'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_seat'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_spion_dalam'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_emblem'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_ban'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_velg'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_ban_cadangan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_fog_lamp'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_toolset'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_grill'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_bemper_depan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_select_head_lamp'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_sign_depan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kap_mesin'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_wiper_depan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_depan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_spion_kanan_kiri'))
	
//WebUI.scrollToElement(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_depan_kanan'), 0)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_depan_kanan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_pintu_depan_kanan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_belakang_kanan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_select_kaca_pintu_belakang_kanan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_listplank_kanan_kiri'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_depan_kiri'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_pintu_depan_kiri'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_belakang_kiri'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_pintu_belakang_kiri'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_belakang'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_rem'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_sign_belakang'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_mundur'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_belakang'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_bemper_belakang'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_engine'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_sistem_rem'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_aki'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_no_rangka'))
	
//WebUI.scrollToElement(findTestObject('COLLECTION/Confirm Repossess/radio_check_no_mesin'), 0)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_no_mesin'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_hidup_di_derek'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_hidup_jalan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_select_mati_di_derek'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_stnk'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_tanggal_stnk'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_angka_kilometer'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_ditarik_dari_pihak_ketiga'))

WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_checker'), 'Aji Kurniawan')
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_checker_job_title'), 'Collector')
WebUI.setText(findTestObject('Object Repository/COLLECTION/Confirm Repossess/input_Check Date_ucdpCheckdatetxtDatePicker'), date)
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_notes'), notes)
WebUI.delay(1)

WebUI.click(findTestObject('COLLECTION/Confirm Repossess/button_submit'))
WebUI.delay(3)
	
	
//close browser
WebUI.closeBrowser()

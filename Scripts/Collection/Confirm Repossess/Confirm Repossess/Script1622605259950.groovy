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
WebUI.navigateToUrl('http://confins-uat.taf.co.id/confins/')
WebUI.maximizeWindow()


//input credential
WebUI.setText(findTestObject('Login/username'), 'ITW0341')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(3)


//select role
WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/select_role'))
WebUI.delay(2)


//select menu confirm repossess
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/button_menu'))
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Confirm Repossess/select_menu_collection'), 
    '270', false)
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/extend_menu_repossess'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/button_menu_repossess'))
WebUI.delay(3)


//input cust credential (agreement no)
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_agreement_no'), 
    '1915858857')
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/button_search'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/button_edit_collection_data'))
WebUI.delay(3)


//confirm repossess process
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_repossess_date'), 
    '06/03/2021')
WebUI.selectOptionByValue(findTestObject('COLLECTION/Confirm Repossess/select_asset_location'), 
    '0001ASTRIAJKT01', false)
WebUI.selectOptionByValue(findTestObject('COLLECTION/Confirm Repossess/select_asset_repossess_type'), 
    'NORMAL', false)
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_asset_condition'), 'good')
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_license_plate'), 'abc123456')
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_license_owner'), 'abc54321')
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_license_expired_date'), 
    '10/10/2022')
WebUI.scrollToElement(findTestObject('COLLECTION/Confirm Repossess/field_license_expired_date'), 0)
WebUI.delay(1)

//asset checklist
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_ac'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_tape_cdplayer'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kunci'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_dashboard'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_seat'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_spion_dalam'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_emblem'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_ban'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_velg'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_ban_cadangan'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_fog_lamp'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_toolset'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_grill'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_bemper_depan'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_select_head_lamp'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_sign_depan'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kap_mesin'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_wiper_depan'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_depan'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_spion_kanan_kiri'))
WebUI.delay(1)
//WebUI.scrollToElement(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_depan_kanan'), 0)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_depan_kanan'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_pintu_depan_kanan'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_belakang_kanan'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_select_kaca_pintu_belakang_kanan'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_listplank_kanan_kiri'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_depan_kiri'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_pintu_depan_kiri'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_belakang_kiri'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_pintu_belakang_kiri'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_belakang'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_rem'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_sign_belakang'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_mundur'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_belakang'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_bemper_belakang'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_engine'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_sistem_rem'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_aki'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_no_rangka'))
WebUI.delay(1)
//WebUI.scrollToElement(findTestObject('COLLECTION/Confirm Repossess/radio_check_no_mesin'), 0)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_no_mesin'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_hidup_di_derek'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_hidup_jalan'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_select_mati_di_derek'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_stnk'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_tanggal_stnk'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_angka_kilometer'))
WebUI.delay(1)
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_ditarik_dari_pihak_ketiga'))
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_checker'), 'Aji Kurniawan')
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_checker_job_title'), 'Collector')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/COLLECTION/Confirm Repossess/input_Check Date_ucdpCheckdatetxtDatePicker'), 
    '06/03/2021')
WebUI.delay(1)
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_notes'), 'notes')
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/button_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()
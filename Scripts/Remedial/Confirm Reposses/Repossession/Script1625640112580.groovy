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
WebUI.setText(findTestObject('Login/username'), 'PAB0656')
WebUI.setText(findTestObject('Login/password'), 'password')
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select menu remedial repossession
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/button_menu'), 20)
WebUI.click(findTestObject('REMEDIAL/Repossession/button_menu'))
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/select_menu_remedial'), 20)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Repossession/select_menu_remedial'), 
    '303', false)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/menu_repossession'), 20)
WebUI.click(findTestObject('REMEDIAL/Repossession/menu_repossession'))
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/expand_menu_repossess'), 20)
WebUI.click(findTestObject('REMEDIAL/Repossession/expand_menu_repossess'))
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/button_menu_repossess'), 20)
WebUI.click(findTestObject('REMEDIAL/Repossession/button_menu_repossess'))
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/field_agreement_number'), 20)
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_agreement_number'), 
    '1916236491')
WebUI.click(findTestObject('REMEDIAL/Repossession/button_search'))
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/button_repossess'), 20)
WebUI.click(findTestObject('REMEDIAL/Repossession/button_repossess'))
WebUI.delay(1)


//repossession process
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/field_repossess_date'), 20)
WebUI.scrollToElement(findTestObject('REMEDIAL/Repossession/field_repossess_date'), 0)
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_repossess_date'), 
    '06/03/2021')
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Repossession/select_asset_location'), 
    '0001ASTRIAJKT01', false)
WebUI.delay(1)
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Repossession/select_asset_repossess_type'), 
    'NORMAL', false)
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_asset_condition'), 'Good')
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_license_owner'), '123456789')
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_license_plate'), 'B 1234 CDE')
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_license_expired_date'), 
    '01/01/2025')
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/IMPORTANT_click_before_checklist'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_AC'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_radio'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kunci'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_dashboard'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_seat'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_spion_dalam'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_emblem'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_ban'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_velg'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_ban_cadangan'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_fog_lamp'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_tanduk'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_toolset'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_grill'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_bemper_depan'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_head_lamp'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_lampu_sign_depan'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kap_mesin'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_wiper_depan'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_depan'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_spion_luar'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_roof_kanan'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_pintu_depan_kanan'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_depan_kanan'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_pintu_belakang_kanan'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_belakang_kanan'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_listplank'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_roof_kiri'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_pintu_depan_kiri'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_depan_kiri'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_pintu_belakang_kiri'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_belakang_kiri'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_bagasi'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_belakang'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_lampu_rem'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_lampu_sign_belakang'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_lampu_mundur'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_pintu_belakang'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_bemper_belakang'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_engine'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_sistem_rem'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_aki'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_no_rangka'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_no_mesin'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_hidup_jalan'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_hidup_di_derek'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_mati_di_derek'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_STNK'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_keur'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_bak_besi'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_bak_kayu'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_box'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_rak_besi'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_molen'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_dump'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_tanggal_STNK'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_angka_kilometer'))
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_ditarik_pihak_ketiga'))
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_checker'), 'Priyanto')
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_checker_job_title'), 'Collector')
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_check_date'), '06/03/2021')
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_notes'), 'notes')
WebUI.delay(1)
WebUI.click(findTestObject('REMEDIAL/Repossession/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()


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

//OPEN BROWSER
WebUI.openBrowser('')
WebUI.navigateToUrl(url)
WebUI.maximizeWindow()


//INPUT ADMIN CREDENTIAL
WebUI.setText(findTestObject('Login/username'), usernameRAH1)
WebUI.setText(findTestObject('Login/password'), password)
WebUI.click(findTestObject('Login/btn_login'))
//WebUI.delay(1)


//SELECT ROLE REMEDIAL AREA HEAD 1
WebUI.click(findTestObject('REMEDIAL/Remedial Expense v3/Remedial Expense Approval v3/select_role'))
//WebUI.delay(1)


//SELECT MENU REPOSSESSION
WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/btn_menu'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/select_menu_remedial'),
	'REMEDIAL', false)
WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/menu_repossession'))
WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/expand_menu_repossession'))
WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/btn_menu_repossession'))
WebUI.delay(30)


//INPUT CUST CREDENTIAL
WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/field_agree_no'), agreeNo)
WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/btn_search'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/btn_repossess'), 30)
WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/btn_repossess'))
WebUI.delay(1)


//REPOSSESSION PROCESS
WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/field_repossess_date'), date)
WebUI.selectOptionByLabel(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/select_asset_location'), assetLocation, false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/select_repossess_type'), repossessType, false)
WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/field_asset_condition'), assetCondition)
WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/field_license_owner'), licenseOwner)
WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/field_license_exp_date'), licenseExpDate)

WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/img_search_zipCode'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/field_kelurahan'), kelurahan)
WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/btn_search_zipCode'))
WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/btn_select_zipCode'))
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/field_license_plate'), licensePlate)
WebUI.delay(1)


//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_ac'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_radio'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_kunci'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_panel_dashboard'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_seat'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_spion_dalam'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_emblem'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_ban'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_velg'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_ban_cadangan'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_fog_lamp'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_tanduk'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_toolset'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_grill'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_bemper_depan'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_headlamp'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_lampu_sign_depan'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_kap_mesin'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_wiper_depan'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_kaca_depan'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_kaca_spion'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_roof_kanan'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_pintu_depan_kanan'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_kaca_pintu_depan_kanan'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_pintu_belakang_kanan'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_kaca_pintu_belakang_kanan'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_listplank'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_roof_kiri'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_pintu_depan_kiri'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_kaca_pintu_depan_kiri'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_pintu_belakang_kiri'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_kaca_pintu_belakang_kiri'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_bagasi'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_kaca_belakang'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_lampu_rem'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_lampu_sign_belakang'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_lampu_mundur'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_pintu_belakang'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_bemper_belakang'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_engine'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_sistem_rem'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_sistem_aki'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_gesekan_no_rangka'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_gesekan_no_mesin'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_hidup_jalan'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_hidup_diderek'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_mati_diderek'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_stnk'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_keur'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_karoseri_bak_besi'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_karoseri_bak_kayu'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_karoseri_box'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_karoseri_rak_besi'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_karoseri_molen'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_karoseri_dump'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_tgl_stnk'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_angka_kilometer'))
//WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/check_ditrarik_dari_pihak_ketiga'))

//ASSET CHECKLIST
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_AC'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_radio'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kunci'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_dashboard'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_seat'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_spion_dalam'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_emblem'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_ban'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_velg'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_ban_cadangan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_fog_lamp'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_tanduk'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_toolset'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_grill'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_bemper_depan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_head_lamp'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_lampu_sign_depan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kap_mesin'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_wiper_depan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_depan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_spion_luar'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_roof_kanan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_pintu_depan_kanan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_depan_kanan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_pintu_belakang_kanan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_belakang_kanan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_listplank'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_roof_kiri'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_pintu_depan_kiri'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_depan_kiri'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_pintu_belakang_kiri'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_belakang_kiri'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_bagasi'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_belakang'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_lampu_rem'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_lampu_sign_belakang'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_lampu_mundur'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_pintu_belakang'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_bemper_belakang'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_engine'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_sistem_rem'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_aki'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_no_rangka'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_no_mesin'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_hidup_jalan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_hidup_di_derek'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_mati_di_derek'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_STNK'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_keur'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_bak_besi'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_bak_kayu'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_box'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_rak_besi'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_molen'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_dump'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_tanggal_STNK'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_angka_kilometer'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_ditarik_pihak_ketiga'))
WebUI.delay(1)


//EXECUTOR INFO
WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/field_checker'), checker)
WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/field_checker_job_title'), checkerJob)
WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/field_check_date'), date)
WebUI.setText(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/field_notes'), notes)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/COLLECTION/Repossession Remedial Expense v3/btn_submit'))
WebUI.delay(5)


//close browser
WebUI.closeBrowser()



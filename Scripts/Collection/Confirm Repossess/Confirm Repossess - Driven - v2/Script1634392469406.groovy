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
WebUI.waitForElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementPresent(findTestObject('Login/username'), 30)
WebUI.verifyElementClickable(findTestObject('Login/username'))
WebUI.setText(findTestObject('Login/username'), usernameAR)

WebUI.waitForElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementPresent(findTestObject('Login/password'), 30)
WebUI.verifyElementClickable(findTestObject('Login/password'))
WebUI.setText(findTestObject('Login/password'), password)

WebUI.waitForElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 30)
WebUI.verifyElementClickable(findTestObject('Login/btn_login'))
WebUI.click(findTestObject('Login/btn_login'))
WebUI.delay(1)


//select role
WebUI.waitForElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/select_role'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/RAL Req by Supervisor/select_role'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/RAL Req by Supervisor/select_role'))
WebUI.click(findTestObject('COLLECTION/RAL Req by Supervisor/select_role'))
WebUI.delay(1)


//select menu confirm repossess
WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/button_menu'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/select_menu_collection'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/select_menu_collection'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/select_menu_collection'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Confirm Repossess/select_menu_collection'), '270', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/extend_menu_repossess'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/extend_menu_repossess'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/extend_menu_repossess'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/extend_menu_repossess'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/button_menu_repossess'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/button_menu_repossess'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/button_menu_repossess'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/button_menu_repossess'))
WebUI.delay(1)


//input cust credential (agreement no)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/field_agreement_no'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/field_agreement_no'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/field_agreement_no'))
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_agreement_no'), agreeNo)

WebUI.click(findTestObject('COLLECTION/Confirm Repossess/button_search'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/button_edit_collection_data'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/button_edit_collection_data'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/button_edit_collection_data'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/button_edit_collection_data'))
WebUI.delay(1)


//confirm repossess process
WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/field_repossess_date'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/field_repossess_date'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/field_repossess_date'))
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_repossess_date'), date)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/select_asset_location'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/select_asset_location'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/select_asset_location'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Confirm Repossess/select_asset_location'), '0001ASTRIAJKT01', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/select_asset_repossess_type'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/select_asset_repossess_type'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/select_asset_repossess_type'))
WebUI.selectOptionByValue(findTestObject('COLLECTION/Confirm Repossess/select_asset_repossess_type'), 'NORMAL', false)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/field_asset_condition'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/field_asset_condition'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/field_asset_condition'))
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_asset_condition'), assetCondition)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/field_license_plate'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/field_license_plate'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/field_license_plate'))
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_license_plate'), licensePlate)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/field_license_owner'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/field_license_owner'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/field_license_owner'))
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_license_owner'), licenseOwner)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/field_license_expired_date'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/field_license_expired_date'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/field_license_expired_date'))
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_license_expired_date'), licenseExpired)
//WebUI.scrollToElement(findTestObject('COLLECTION/Confirm Repossess/field_license_expired_date'), 0)
WebUI.delay(1)

//asset checklist
WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_ac'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_ac'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_ac'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_ac'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_tape_cdplayer'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_tape_cdplayer'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_tape_cdplayer'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_tape_cdplayer'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_kunci'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_kunci'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_kunci'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kunci'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_dashboard'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_dashboard'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_dashboard'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_dashboard'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_seat'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_seat'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_seat'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_seat'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_spion_dalam'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_spion_dalam'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_spion_dalam'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_spion_dalam'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_emblem'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_emblem'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_emblem'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_emblem'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_ban'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_ban'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_ban'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_ban'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_velg'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_velg'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_velg'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_velg'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_ban_cadangan'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_ban_cadangan'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_ban_cadangan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_ban_cadangan'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_fog_lamp'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_fog_lamp'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_fog_lamp'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_fog_lamp'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_toolset'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_toolset'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_toolset'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_toolset'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_grill'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_grill'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_grill'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_grill'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_bemper_depan'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_bemper_depan'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_bemper_depan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_bemper_depan'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_select_head_lamp'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_select_head_lamp'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_select_head_lamp'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_select_head_lamp'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_sign_depan'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_sign_depan'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_sign_depan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_sign_depan'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_kap_mesin'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_kap_mesin'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_kap_mesin'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kap_mesin'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_wiper_depan'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_wiper_depan'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_wiper_depan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_wiper_depan'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_depan'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_depan'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_depan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_depan'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_spion_kanan_kiri'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_spion_kanan_kiri'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_spion_kanan_kiri'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_spion_kanan_kiri'))

//WebUI.scrollToElement(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_depan_kanan'), 0)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_depan_kanan'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_depan_kanan'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_depan_kanan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_depan_kanan'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_pintu_depan_kanan'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_pintu_depan_kanan'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_pintu_depan_kanan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_pintu_depan_kanan'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_belakang_kanan'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_belakang_kanan'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_belakang_kanan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_belakang_kanan'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_select_kaca_pintu_belakang_kanan'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_select_kaca_pintu_belakang_kanan'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_select_kaca_pintu_belakang_kanan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_select_kaca_pintu_belakang_kanan'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_listplank_kanan_kiri'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_listplank_kanan_kiri'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_listplank_kanan_kiri'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_listplank_kanan_kiri'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_depan_kiri'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_depan_kiri'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_depan_kiri'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_depan_kiri'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_pintu_depan_kiri'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_pintu_depan_kiri'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_pintu_depan_kiri'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_pintu_depan_kiri'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_belakang_kiri'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_belakang_kiri'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_belakang_kiri'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_belakang_kiri'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_pintu_belakang_kiri'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_pintu_belakang_kiri'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_pintu_belakang_kiri'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_pintu_belakang_kiri'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_belakang'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_belakang'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_belakang'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_kaca_belakang'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_rem'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_rem'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_rem'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_rem'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_sign_belakang'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_sign_belakang'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_sign_belakang'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_sign_belakang'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_mundur'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_mundur'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_mundur'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_lampu_mundur'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_belakang'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_belakang'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_belakang'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_pintu_belakang'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_bemper_belakang'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_bemper_belakang'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_bemper_belakang'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_bemper_belakang'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_engine'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_engine'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_engine'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_engine'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_sistem_rem'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_sistem_rem'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_sistem_rem'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_sistem_rem'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_aki'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_aki'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_aki'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_aki'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_no_rangka'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_no_rangka'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_no_rangka'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_no_rangka'))

//WebUI.scrollToElement(findTestObject('COLLECTION/Confirm Repossess/radio_check_no_mesin'), 0)
WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_no_mesin'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_no_mesin'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_no_mesin'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_no_mesin'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_hidup_di_derek'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_hidup_di_derek'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_hidup_di_derek'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_hidup_di_derek'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_hidup_jalan'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_hidup_jalan'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_hidup_jalan'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_hidup_jalan'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_select_mati_di_derek'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_select_mati_di_derek'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_select_mati_di_derek'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_select_mati_di_derek'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_stnk'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_stnk'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_stnk'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_stnk'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_tanggal_stnk'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_tanggal_stnk'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_tanggal_stnk'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_tanggal_stnk'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_angka_kilometer'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_angka_kilometer'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_angka_kilometer'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_angka_kilometer'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_ditarik_dari_pihak_ketiga'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/radio_check_ditarik_dari_pihak_ketiga'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/radio_check_ditarik_dari_pihak_ketiga'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/radio_check_ditarik_dari_pihak_ketiga'))

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/field_checker'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/field_checker'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/field_checker'))
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_checker'), 'Aji Kurniawan')

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/field_checker_job_title'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/field_checker_job_title'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/field_checker_job_title'))
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_checker_job_title'), 'Collector')

WebUI.waitForElementPresent(findTestObject('Object Repository/COLLECTION/Confirm Repossess/input_Check Date_ucdpCheckdatetxtDatePicker'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/COLLECTION/Confirm Repossess/input_Check Date_ucdpCheckdatetxtDatePicker'), 30)
WebUI.verifyElementClickable(findTestObject('Object Repository/COLLECTION/Confirm Repossess/input_Check Date_ucdpCheckdatetxtDatePicker'))
WebUI.setText(findTestObject('Object Repository/COLLECTION/Confirm Repossess/input_Check Date_ucdpCheckdatetxtDatePicker'), date)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/field_notes'))
WebUI.setText(findTestObject('COLLECTION/Confirm Repossess/field_notes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('COLLECTION/Confirm Repossess/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('COLLECTION/Confirm Repossess/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('COLLECTION/Confirm Repossess/button_submit'))
WebUI.click(findTestObject('COLLECTION/Confirm Repossess/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()
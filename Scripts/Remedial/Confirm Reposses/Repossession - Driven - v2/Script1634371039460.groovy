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
WebUI.setText(findTestObject('Login/username'), usernameRA1)

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
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Login/Login Remedial Area 1/select_role'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Login/Login Remedial Area 1/select_role'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Login/Login Remedial Area 1/select_role'))
WebUI.click(findTestObject('REMEDIAL/Login/Login Remedial Area 1/select_role'))
WebUI.delay(1)


//select menu remedial repossession
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/button_menu'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/button_menu'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/button_menu'))
WebUI.click(findTestObject('REMEDIAL/Repossession/button_menu'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/select_menu_remedial'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/select_menu_remedial'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/select_menu_remedial'))
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Repossession/select_menu_remedial'), '303', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/menu_repossession'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/menu_repossession'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/menu_repossession'))
WebUI.click(findTestObject('REMEDIAL/Repossession/menu_repossession'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/expand_menu_repossess'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/expand_menu_repossess'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/expand_menu_repossess'))
WebUI.click(findTestObject('REMEDIAL/Repossession/expand_menu_repossess'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/button_menu_repossess'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/button_menu_repossess'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/button_menu_repossess'))
WebUI.click(findTestObject('REMEDIAL/Repossession/button_menu_repossess'))
WebUI.delay(1)


//input cust credential (agreement number)
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/field_agreement_number'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/field_agreement_number'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/field_agreement_number'))
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_agreement_number'), agreeNo)

WebUI.click(findTestObject('REMEDIAL/Repossession/button_search'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/button_repossess'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/button_repossess'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/button_repossess'))
WebUI.click(findTestObject('REMEDIAL/Repossession/button_repossess'))
WebUI.delay(1)


//repossession process
WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/field_repossess_date'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/field_repossess_date'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/field_repossess_date'))
WebUI.scrollToElement(findTestObject('REMEDIAL/Repossession/field_repossess_date'), 10)
WebUI.delay(1)
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_repossess_date'), date)
WebUI.sendKeys(findTestObject('REMEDIAL/Repossession/field_repossess_date'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/select_asset_location'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/select_asset_location'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/select_asset_location'))
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Repossession/select_asset_location'), '0001ASTRIAJKT01', false)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/select_asset_repossess_type'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/select_asset_repossess_type'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/select_asset_repossess_type'))
WebUI.selectOptionByValue(findTestObject('REMEDIAL/Repossession/select_asset_repossess_type'), 'NORMAL', false)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/field_asset_condition'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/field_asset_condition'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/field_asset_condition'))
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_asset_condition'), 'Good')

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/field_license_owner'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/field_license_owner'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/field_license_owner'))
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_license_owner'), licenseOwner)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/field_license_plate'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/field_license_plate'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/field_license_plate'))
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_license_plate'), licensePlat)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/field_license_expired_date'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/field_license_expired_date'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/field_license_expired_date'))
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_license_expired_date'), licenseExp)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/IMPORTANT_click_before_checklist'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/IMPORTANT_click_before_checklist'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/IMPORTANT_click_before_checklist'))
WebUI.click(findTestObject('REMEDIAL/Repossession/IMPORTANT_click_before_checklist'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_AC'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_AC'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_AC'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_AC'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_radio'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_radio'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_radio'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_radio'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_kunci'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_kunci'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_kunci'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kunci'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_dashboard'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_dashboard'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_dashboard'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_dashboard'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_seat'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_seat'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_seat'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_seat'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_spion_dalam'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_spion_dalam'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_spion_dalam'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_spion_dalam'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_emblem'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_emblem'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_emblem'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_emblem'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_ban'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_ban'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_ban'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_ban'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_velg'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_velg'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_velg'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_velg'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_ban_cadangan'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_ban_cadangan'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_ban_cadangan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_ban_cadangan'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_fog_lamp'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_fog_lamp'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_fog_lamp'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_fog_lamp'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_tanduk'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_tanduk'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_tanduk'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_tanduk'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_toolset'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_toolset'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_toolset'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_toolset'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_grill'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_grill'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_grill'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_grill'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_bemper_depan'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_bemper_depan'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_bemper_depan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_bemper_depan'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_head_lamp'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_head_lamp'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_head_lamp'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_head_lamp'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_lampu_sign_depan'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_lampu_sign_depan'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_lampu_sign_depan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_lampu_sign_depan'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_kap_mesin'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_kap_mesin'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_kap_mesin'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kap_mesin'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_wiper_depan'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_wiper_depan'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_wiper_depan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_wiper_depan'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_kaca_depan'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_kaca_depan'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_kaca_depan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_depan'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_kaca_spion_luar'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_kaca_spion_luar'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_kaca_spion_luar'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_spion_luar'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_roof_kanan'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_roof_kanan'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_roof_kanan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_roof_kanan'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_pintu_depan_kanan'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_pintu_depan_kanan'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_pintu_depan_kanan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_pintu_depan_kanan'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_depan_kanan'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_depan_kanan'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_depan_kanan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_depan_kanan'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_pintu_belakang_kanan'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_pintu_belakang_kanan'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_pintu_belakang_kanan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_pintu_belakang_kanan'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_belakang_kanan'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_belakang_kanan'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_belakang_kanan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_belakang_kanan'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_listplank'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_listplank'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_listplank'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_listplank'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_roof_kiri'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_roof_kiri'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_roof_kiri'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_roof_kiri'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_pintu_depan_kiri'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_pintu_depan_kiri'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_pintu_depan_kiri'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_pintu_depan_kiri'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_depan_kiri'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_depan_kiri'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_depan_kiri'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_depan_kiri'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_pintu_belakang_kiri'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_pintu_belakang_kiri'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_pintu_belakang_kiri'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_pintu_belakang_kiri'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_belakang_kiri'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_belakang_kiri'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_belakang_kiri'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_pintu_belakang_kiri'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_bagasi'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_bagasi'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_bagasi'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_bagasi'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_kaca_belakang'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_kaca_belakang'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_kaca_belakang'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_kaca_belakang'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_lampu_rem'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_lampu_rem'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_lampu_rem'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_lampu_rem'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_lampu_sign_belakang'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_lampu_sign_belakang'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_lampu_sign_belakang'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_lampu_sign_belakang'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_lampu_mundur'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_lampu_mundur'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_lampu_mundur'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_lampu_mundur'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_pintu_belakang'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_pintu_belakang'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_pintu_belakang'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_pintu_belakang'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_bemper_belakang'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_bemper_belakang'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_bemper_belakang'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_bemper_belakang'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_engine'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_engine'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_engine'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_engine'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_sistem_rem'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_sistem_rem'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_sistem_rem'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_sistem_rem'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_aki'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_aki'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_aki'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_aki'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_no_rangka'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_no_rangka'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_no_rangka'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_no_rangka'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_no_mesin'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_no_mesin'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_no_mesin'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_no_mesin'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_hidup_jalan'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_hidup_jalan'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_hidup_jalan'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_hidup_jalan'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_hidup_di_derek'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_hidup_di_derek'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_hidup_di_derek'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_hidup_di_derek'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_mati_di_derek'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_mati_di_derek'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_mati_di_derek'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_mati_di_derek'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_STNK'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_STNK'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_STNK'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_STNK'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_keur'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_keur'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_keur'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_keur'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_bak_besi'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_bak_besi'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_bak_besi'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_bak_besi'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_bak_kayu'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_bak_kayu'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_bak_kayu'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_bak_kayu'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_box'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_box'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_box'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_box'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_rak_besi'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_rak_besi'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_rak_besi'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_rak_besi'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_molen'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_molen'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_molen'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_molen'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_dump'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_dump'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_dump'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_karoseri_dump'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_tanggal_STNK'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_tanggal_STNK'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_tanggal_STNK'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_tanggal_STNK'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_angka_kilometer'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_angka_kilometer'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_angka_kilometer'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_angka_kilometer'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_ditarik_pihak_ketiga'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/check_yes_ditarik_pihak_ketiga'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/check_yes_ditarik_pihak_ketiga'))
WebUI.click(findTestObject('REMEDIAL/Repossession/check_yes_ditarik_pihak_ketiga'))

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/field_checker'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/field_checker'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/field_checker'))
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_checker'), 'Priyanto')

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/field_checker_job_title'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/field_checker_job_title'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/field_checker_job_title'))
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_checker_job_title'), 'Collector')

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/field_check_date'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/field_check_date'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/field_check_date'))
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_check_date'), date)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/field_notes'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/field_notes'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/field_notes'))
WebUI.setText(findTestObject('REMEDIAL/Repossession/field_notes'), notes)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('REMEDIAL/Repossession/button_submit'), 30)
WebUI.verifyElementPresent(findTestObject('REMEDIAL/Repossession/button_submit'), 30)
WebUI.verifyElementClickable(findTestObject('REMEDIAL/Repossession/button_submit'))
WebUI.click(findTestObject('REMEDIAL/Repossession/button_submit'))
WebUI.delay(3)


//close browser
WebUI.closeBrowser()


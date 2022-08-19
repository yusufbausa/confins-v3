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

// CREDIT SIMULATION COMPANY SINGLE ASSET


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
WebUI.click(findTestObject('Login/btn_select_profile'))
//WebUI.delay(1)


//access menu credit simulation
WebUI.click(findTestObject('Credit Simulation/btn_menu'))
WebUI.click(findTestObject('Credit Simulation/btn_menu_credit_simulation'))
WebUI.click(findTestObject('Credit Simulation/btn_add_simulation'))
WebUI.delay(1)


//credit simulation process
//main information
WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_cust_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_cust_name'), 30)
WebUI.setText(findTestObject('Object Repository/Credit Simulation/Company Single/field_cust_name'), custName)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/check_company'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/check_company'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/check_company'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/img_search_product'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/img_search_product'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/img_search_product'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_product_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_product_name'), 30)
WebUI.setText(findTestObject('Object Repository/Credit Simulation/Company Single/field_product_name'), productOffer)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_search_product'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_search_product'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_search_product'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/select_product_offering'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/select_product_offering'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/select_product_offering'))
//WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/field_asset_amount'))
//WebUI.doubleClick(findTestObject('Object Repository/Credit Simulation/Company Single/field_asset_amount'))
//WebUI.setText(findTestObject('Object Repository/Credit Simulation/Company Single/field_asset_amount'), '2')
WebUI.delay(3)


//application data
WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_tenor'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_tenor'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/field_tenor'))
WebUI.doubleClick(findTestObject('Object Repository/Credit Simulation/Company Single/field_tenor'))
WebUI.sendKeys(findTestObject('Object Repository/Credit Simulation/Company Single/field_tenor'), tenor)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/select_installment_scheme'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/select_installment_scheme'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Credit Simulation/Company Single/select_installment_scheme'), 'Regular Fixed Installment', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/select_payment_frequency'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/select_payment_frequency'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Credit Simulation/Company Single/select_payment_frequency'), 'MONTHLY', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_next'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_next'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_next'))
WebUI.delay(1)


//asset data
WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_add_asset'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_add_asset'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_add_asset'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/img_search_supplier'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/img_search_supplier'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/img_search_supplier'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_branch_address'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_branch_address'), 30)
WebUI.setText(findTestObject('Object Repository/Credit Simulation/Company Single/field_branch_address'), supplierAddress)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_search_supplier'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_search_supplier'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_search_supplier'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_select_supplier'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_select_supplier'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_select_supplier'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/img_search_asset'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/img_search_asset'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/img_search_asset'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_asset_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_asset_name'), 30)
WebUI.setText(findTestObject('Object Repository/Credit Simulation/Company Single/field_asset_name'), assetName)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_search_asset'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_search_asset'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_search_asset'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_select_asset'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_select_asset'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_select_asset'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_asset_price'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_asset_price'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/field_asset_price'))
WebUI.doubleClick(findTestObject('Object Repository/Credit Simulation/Company Single/field_asset_price'))
WebUI.sendKeys(findTestObject('Object Repository/Credit Simulation/Company Single/field_asset_price'), assetPrice)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_dp'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_dp'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/field_dp'))
WebUI.doubleClick(findTestObject('Object Repository/Credit Simulation/Company Single/field_dp'))
WebUI.sendKeys(findTestObject('Object Repository/Credit Simulation/Company Single/field_dp'), assetDp)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/select_asset_usage'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/select_asset_usage'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Credit Simulation/Company Single/select_asset_usage'), 'Operasional', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_save_asset_data'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_save_asset_data'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_save_asset_data'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_next'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_next'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_next'))
WebUI.delay(1)


//insurance data
WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_edit_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_edit_insurance'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_edit_insurance'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/select_scheme_name'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/select_scheme_name'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Credit Simulation/Company Single/select_scheme_name'), insuranceScheme, false)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_next_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_next_insurance'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_next_insurance'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/select_main_coverage'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/select_main_coverage'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Credit Simulation/Company Single/select_main_coverage'), 'ALL RISK', false)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/check_tpl'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/check_tpl'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/check_tpl'))
//WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_calculate_insurance'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_calculate_insurance'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_calculate_insurance'))
WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_save_insurance_data'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_save_insurance_data'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_save_insurance_data'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_next'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_next'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_next'))
WebUI.delay(1)


//financial data
WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_calculate_fee'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_calculate_fee'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_calculate_fee'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_calculate'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_calculate'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_calculate'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_calculate_installment'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_calculate_installment'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_calculate_installment'))
WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_next'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_next'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_next'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_next'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_next'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_next'))
WebUI.delay(1)


//credit simulation to new application
WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_mobile_phone'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_mobile_phone'), 30)
WebUI.setText(findTestObject('Object Repository/Credit Simulation/Company Single/field_mobile_phone'), mobilePhone)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_npwp'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_npwp'), 30)
WebUI.setText(findTestObject('Object Repository/Credit Simulation/Company Single/field_npwp'), npwp)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_save_to_upload'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_save_to_upload'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_save_to_upload'))
WebUI.delay(1)


//upload document
WebUI.scrollToElement(findTestObject('Object Repository/Credit Simulation/Company Single/btn_choose_file'), 30)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_choose_file'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_choose_file'), 30)
WebUI.uploadFile(findTestObject('Object Repository/Credit Simulation/Company Single/btn_choose_file'), fileUpload)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_remarks'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/field_remarks'), 30)
WebUI.setText(findTestObject('Object Repository/Credit Simulation/Company Single/field_remarks'), remarks)
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_upload'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_upload'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_upload'))
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_submit'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Credit Simulation/Company Single/btn_submit'), 30)
WebUI.click(findTestObject('Object Repository/Credit Simulation/Company Single/btn_submit'))
//WebUI.verifyAlertPresent(0)
WebUI.acceptAlert()
WebUI.delay(6)


//close browser
WebUI.closeBrowser()